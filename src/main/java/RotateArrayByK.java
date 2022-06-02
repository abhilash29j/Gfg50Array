import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};

        int x[] = rotate(nums, 3);
        System.out.println(Arrays.toString(x));
    }
    public static int[] rotate(int[] nums, int k) {
        int nums2[] = new int[nums.length];
        int length = nums.length;
        int index = 0;
        for (int i = length - k; i < length; i++) {

            nums2[index] = nums[i];
            index++;

        }

        for (int i = 0; i < length - k; i++) {

            nums2[index] = nums[i];
            index++;
        }
return  nums2;
    }
}
