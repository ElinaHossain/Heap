import java.util.*;

public class Driver {

    public static void main(String[] args) {
        // Create HeapItem array
        HeapItem<Integer, String>[] items = new HeapItem[]{
                new HeapItem<>(323, "abc"),
                new HeapItem<>(252, "def"),
                new HeapItem<>(282, "ghi"),
                new HeapItem<>(121, "jkl"),
                new HeapItem<>(131, "mno"),
                new HeapItem<>(222, "pqr"),
                new HeapItem<>(141, "stu"),
                new HeapItem<>(66, "vwx"),
                new HeapItem<>(111, "yz")
        };

        // Declare and initialize a Heap
        Heap<Integer, String> heap = new Heap<>(50);

        // Call heapify and pass in the newly created array
        heap.heapify(items);

        // Call print
        System.out.println("Heap after heapify:");
        heap.print();

        // Call deleteRoot 
        heap.deleteRoot();
        heap.deleteRoot();

        // Call print
        System.out.println("\nHeap after deleting two roots:");
        heap.print();

        // Call sort
        heap.heapSort();

        // Call print
        System.out.println("\nSorted Heap:");
        heap.print();
    }
    
}
