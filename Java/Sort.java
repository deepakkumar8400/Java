import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
class Sort {
    static Node sort(Node sl, Node nn) {
        if (sl == null || nn.data < sl.data) { 
            nn.next = sl;
            return nn;
        }
        Node curr = sl;
        while (curr.next != null && curr.next.data < nn.data) {
            curr = curr.next;
        }
        nn.next = curr.next;
        curr.next = nn;
        return sl;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of LL:");
        int k = sc.nextInt();
        System.out.println("Enter values:");
        Node n1 = new Node(0), n = n1;
        for (int i = 0; i < k; i++) {
            n.next = new Node(sc.nextInt());
            n = n.next;
        }

        Node node = n1.next, sl = null;
        while (node != null) {
            Node next = node.next;
            node.next = null; // Important: Break original link before inserting
            sl = sort(sl, node);
            node = next;
        }

        System.out.println("Sorted Linked List:");
        print(sl);
    }
}
