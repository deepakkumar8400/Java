class tree {
    static boolean ans = true;

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.right = new Node(6);
        root.right.right = new Node(2);
        root.right.left = new Node(3);
        root.right.left.left = new Node(2);
        root.right.left.right = new Node(1);

        print(root);
        System.out.println("ans is " + ans);
    }

    static Pair print(Node root) {
        if (root == null) {
            return new Pair(0, true);
        }
        if (root.left == null && root.right == null) {
            return new Pair(root.data, true);
        }

        Pair l = print(root.left);
        Pair r = print(root.right);

        if (l.sum + r.sum != root.data || !l.b || !r.b) {
            ans = false;
        }

        return new Pair(l.sum + r.sum + root.data, ans);
    }
}

class Pair {
    int sum;
    boolean b;

    Pair(int sum, boolean b) {
        this.sum = sum;
        this.b = b;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
