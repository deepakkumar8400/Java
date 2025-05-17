import java.util.*;

class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return id + ":" + name;
    }
}

public class heap {
    public static void main(String[] args) {
        Comparator<Student> cmp = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name); // Sort by name
            }
        };

        TreeSet<Student> set = new TreeSet<>(cmp);
        set.add(new Student(2, "Deepak"));
        set.add(new Student(1, "Anil"));
        set.add(new Student(3, "Sunita"));

        for (Student s : set) {
            System.out.println(s);
        }
    }
}

// public class MinHeap<E extends Comparable<E>> {
//     private E[] heap;
//     private int size;
//     private int capacity;

//     @SuppressWarnings("unchecked")
//     public MinHeap(int capacity) {
//         this.capacity = capacity;
//         this.size = 0;
//         heap = (E[]) new Comparable[capacity];
//     }

//     private int parent(int i) { return (i - 1) / 2; }
//     private int leftChild(int i) { return 2 * i + 1; }
//     private int rightChild(int i) { return 2 * i + 2; }

//     // Insert element
//     public void insert(E element) {
//         if (size == capacity) {
//             throw new IllegalStateException("Heap full");
//         }
//         heap[size] = element;
//         siftUp(size);
//         size++;
//     }

//     // Heapify up
//     private void siftUp(int index) {
//         E temp = heap[index];
//         while (index > 0 && temp.compareTo(heap[parent(index)]) < 0) {
//             heap[index] = heap[parent(index)];
//             index = parent(index);
//         }
//         heap[index] = temp;
//     }

//     // Remove and return min element (root)
//     public E extractMin() {
//         if (size == 0) return null;
//         E min = heap[0];
//         heap[0] = heap[size - 1];
//         size--;
//         siftDown(0);
//         return min;
//     }

//     // Heapify down
//     private void siftDown(int index) {
//         E temp = heap[index];
//         int child;
//         while (leftChild(index) < size) {
//             child = leftChild(index);
//             if (child + 1 < size && heap[child + 1].compareTo(heap[child]) < 0) {
//                 child = child + 1;
//             }
//             if (temp.compareTo(heap[child]) <= 0) break;
//             heap[index] = heap[child];
//             index = child;
//         }
//         heap[index] = temp;
//     }

//     public E peek() {
//         if (size == 0) return null;
//         return heap[0];
//     }

//     public int getSize() {
//         return size;
//     }

//     // Simple test
//     public static void main(String[] args) {
//         MinHeap<Integer> minHeap = new MinHeap<>(10);
//         minHeap.insert(20);
//         minHeap.insert(15);
//         minHeap.insert(30);
//         minHeap.insert(5);

//         System.out.println("Min element: " + minHeap.peek()); // 5

//         while (minHeap.getSize() > 0) {
//             System.out.println(minHeap.extractMin());
//         }
//     }
// }
