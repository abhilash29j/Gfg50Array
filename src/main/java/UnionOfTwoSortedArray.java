import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,1,1,2,2,7,9,9,9,9};
        int arr2[] = {1,1,3,3,7,8,8,8};

        int len1 = arr1.length;
        int len2 = arr2.length;
        List<Integer> list = new ArrayList<>();

        int i = 0,j = 0;
        int prev = Integer.MAX_VALUE;

        while (i < len1 && j < len2) {
            if (arr1[i] == arr2[j] ) {
                if (arr1[i] != prev)
                list.add(arr1[i]);

                prev = arr1[i];
                i++;
                j++;

            }
            else if (arr1[i] < arr2[j]) {
                if (arr1[i] != prev) {
                    list.add(arr1[i]);
                    prev = arr1[i];

                }

                i++;
            }
            else if (arr1[i] > arr2[j]) {
                if (arr2[j] != prev) {
                    list.add(arr2[j]);
                    prev = arr2[j];

                }

                j++;
            }

        }


        while(i < len1){
           if(arr1[i] != arr1[i - 1])
            list.add(arr1[i]);
           i++;

        }
        while(j < len2){
            if(arr2[j] != arr2[j - 1])
            list.add(arr2[j]);
            j++;

        }



        System.out.println(list.toString());

    }
}
