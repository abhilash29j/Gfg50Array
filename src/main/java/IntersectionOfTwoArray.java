import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        //2,2,2,3,4,4,7,8
        //1,2,4,4,6,6,7,8,10

        int arr1[] = {2,2,2,3,4,4,7,8};
        int arr2[] = {1,2,4,4,6,6,7,8,10};
        List<Integer> finalIntersectionArray = new ArrayList<>();

        int i = 0, j =0;


while (i < arr1.length && j <arr2.length) {

    while (i < (arr1.length - 1) && arr1[i] == arr1[i + 1]){
        i++;

    }

    while (j < (arr2.length - 1) && arr2[j] == arr2[j + 1]){
        j++;

    }

    if (arr1[i] == arr2[j]) {
        finalIntersectionArray.add (   arr1[i]  );
        i++;
        j++;
    }

    else if(arr1[i] > arr2[j]){
        j++;
    }


    else if (arr1[i] < arr2[j]) {
        i++;
    }

}

        System.out.println(finalIntersectionArray);
    }
}
