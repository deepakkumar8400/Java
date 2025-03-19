class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor to initialize the heap with a given capacity
    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Function to get the index of the parent of a node
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Function to get the index of the left child of a node
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Function to get the index of the right child of a node
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Function to swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Heapify the tree rooted at index i
    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        // Find the smallest among root, left child, and right child
        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        // If smallest is not root, swap and heapify the affected subtree
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    // Function to insert a new element into the heap
    public void insert(int element) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        // Insert the new element at the end of the heap
        heap[size] = element;
        size++;

        // Fix the min heap property if it is violated
        int i = size - 1;
        while (i > 0 && heap[parent(i)] > heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Function to extract the minimum element (root of the heap)
    public int extractMin() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return Integer.MAX_VALUE;
        }

        // The root contains the minimum element
        int root = heap[0];

        // Replace root with the last element and heapify
        heap[0] = heap[size - 1];
        size--;
        heapify(0);

        return root;
    }

    // Function to get the minimum element (root)
    public int getMin() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return Integer.MAX_VALUE;
        }
        return heap[0];
    }

    // Function to print the heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(3);
        minHeap.insert(1);
        minHeap.insert(6);
        minHeap.insert(5);
        minHeap.insert(9);
        minHeap.insert(8);

        System.out.println("Heap after insertion:");
        minHeap.printHeap();

        System.out.println("Extracting Min: " + minHeap.extractMin());
        minHeap.printHeap();

        System.out.println("Current Min: " + minHeap.getMin());
    }
}
