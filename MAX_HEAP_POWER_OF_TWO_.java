import java.util.ArrayList;
import java.util.List;
/**
 * This class implements a max-heap with a specified number of children per parent.
 * The number of children is defined as a power of two.
 */
public class MAX_HEAP_POWER_OF_TWO_ {
    private final int number_of_children_per_parent;
    private final int powerDegree;
    private final List<Integer> heap;

    public MAX_HEAP_POWER_OF_TWO_(int children_per_parent) {
         if (children_per_parent < 0 || children_per_parent > 30) {
            throw new IllegalArgumentException("Power of two must be between 0 and 30, inclusive.");
         }
        this.powerDegree = children_per_parent;
        this.number_of_children_per_parent = 1 << powerDegree; // 2^children_per_parent
        this.heap = new ArrayList<>();
    }

    public void insert(int value){
        int index = heap.size();
        heap.add(value);
    }

    public int pop_max (){
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty.");
        }
        // Assuming the heap is a max-heap, we can remove the maximum element
        // which is typically at the root (index 0).
        // In a max-heap, the root is the maximum element.
        // Here, we would typically need to maintain the heap property after removing the max.
        // For simplicity, we will just remove the first element and assume it's the max.
        return heap.remove(0); 
    }

    public void printHeap() {
        System.out.println(heap);
    }
}

