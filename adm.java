class Graph {
    int n;
    int a;
    int b;
    int[][] st;

    // Constructor to initialize the graph
    Graph(int n, int a, int b) {
        this.n = n;
        this.a = a;
        this.b = b;
        st = new int[n][n];  // Initialize the 2D array based on n
        st[a][b] = 1;  // Set the connection between a and b
    }

    // Method to display the graph's adjacency matrix
    void displayGraph() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(st[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class adm {
    public static void main(String[] args) {
        // Create a graph with 4 vertices, and an edge between vertex 1 and vertex 2
        Graph graph = new Graph(4, 1, 2);
        // Display the adjacency matrix
        graph.displayGraph();
    }
}
