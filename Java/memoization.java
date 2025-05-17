import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class memoization {
    static Node reverse(Node head) {
        Node curr = head;
        Node pre = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
    public static void main(String[] args) {
        System.out.println("Enter size of LL");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Enter value of LL");
        Node n1 = new Node(0);
        Node n = n1;
        for (int i = 0; i < k; i++) {
            int value = sc.nextInt();
            n.next = new Node(value);
            n = n.next;
        }

        System.out.println("Again enter size of LL");
        int kk = sc.nextInt();
        System.out.println("Enter value of LL");
        Node m1 = new Node(0);
        Node m = m1;
        for (int i = 0; i < kk; i++) {
            int value = sc.nextInt();
            m.next = new Node(value);
            m = m.next;
        }

        n = reverse(n1.next);  // Reverse first list
        m = reverse(m1.next);  // Reverse second list

        Node nn = new Node((n.data + m.data) % 10);
        Node ans = nn;
        int cr = (n.data + m.data) / 10;
        n = n.next;
        m = m.next;

        while (n != null || m != null) {
            if (n == null) {
                int num = (m.data + cr) % 10;
                cr = (m.data + cr) / 10;
                ans.next = new Node(num);
                ans = ans.next;
                m = m.next;
            } else if (m == null) {
                int num = (n.data + cr) % 10;
                cr = (n.data + cr) / 10;
                ans.next = new Node(num);
                ans = ans.next;
                n = n.next;
            } else {
                int num = (n.data + m.data + cr) % 10;
                cr = (n.data + m.data + cr) / 10;
                ans.next = new Node(num);
                ans = ans.next;
                n = n.next;
                m = m.next;
            }
        }

        if (cr > 0) {
            ans.next = new Node(cr);
        }

        Node finalnode = reverse(nn);  // Reverse the result to get the correct order
        System.out.println("Output will be:");
        while (finalnode != null) {
            System.out.print(finalnode.data + " ");
            finalnode = finalnode.next;
        }
    }
}
