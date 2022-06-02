import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int arr[] = new int[] {3,1,6,2,9,0};
        int k =3;  //defualt is min heap
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for (int i =0 ;i < arr.length; i++) {

            pq.add(arr[i]);
            if (pq.size() > k) pq.remove();

        }
        System.out.println(pq.peek());
    }
}

