public class findMissingNumberUsingXor {
    public static void main(String[] args) {
        int arr[] ={1,2,3,6,5};
        int len = arr.length;
        int xor1 = arr[0];
        int count = 1;

        for (int  i = 1; i < len; i++) {
         xor1 ^= arr[i];
         xor1 ^= count;
         count++;

        }
        xor1 ^= count;
        count++;
        xor1 ^= count;
        System.out.println(xor1);
    }
}
