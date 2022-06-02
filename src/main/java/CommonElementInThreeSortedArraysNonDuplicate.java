import java.util.ArrayList;
import java.util.List;

public class CommonElementInThreeSortedArraysNonDuplicate {
    public static void main(String[] args) {
        int ar1[] = { 1, 5, 10,20,20,40, 80 };
        int ar2[] = { 6, 7, 20,20, 80, 100 };
        int ar3[] = { 3, 4, 15, 20,20, 30, 70, 80, 120 };
        List<Integer> list = new ArrayList<>();
        int l1= ar1.length;
        int l2 = ar2.length;
        int l3 = ar3.length;

        int i = 0, j = 0, k = 0;
        while (i < l1 && j < l2 && k < l3) {
               if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                   list.add(ar1[i]);
                   i++;
                   j++;
                   k++;
               }
             else if (ar1[i] < ar2[j]) {
                 i++;
               }
             else if (ar2[j] < ar3[k]) {
                 j++;
               }
             else {
                 k++;
               }
        }
        System.out.println(list);
    }
}
