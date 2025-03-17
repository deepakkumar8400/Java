import java.util.*;

class Node {
    List<Node> children;
    int data;
    
    Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

class top {
    public static void main(String[] args) {
        Node n = new Node(10);
        Node nn = new Node(20);
        Node nnn = new Node(30);
        ArrayList<Node> al=new ArrayList<>();
        al.add(nn);
        al.add(nnn);
        n.children=al;
        System.err.println(n.children.get(0).data);
    }
}
