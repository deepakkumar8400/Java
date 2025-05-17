import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TopView {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(2);
        n.left.left = new Node(3);
        n.right = new Node(4);
        n.right.left = new Node(5);

        Queue<Node> q = new LinkedList<>();
        Queue<Integer> qq = new LinkedList<>();
        Map<Integer, Integer> hm = new TreeMap<>(); // Use TreeMap for sorted order

        q.offer(n);
        qq.offer(0);

        while (!q.isEmpty()) {
            int dt = qq.poll();
            Node node = q.poll();

            if (!hm.containsKey(dt)) {
                hm.put(dt, node.data);
            }

            if (node.left != null) {
                q.offer(node.left);
                qq.offer(dt - 1);
            }
            if (node.right != null) {
                q.offer(node.right);
                qq.offer(dt + 1);
            }
        }

        for (int value : hm.values()) {
            System.out.print(value + " ");
        }
    }
}