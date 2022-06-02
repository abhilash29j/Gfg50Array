public class MaxSumInConfig {
    public static void main(String[] args) {

        int arr[] = {8,3,1,2};
        int sum = 0;
        int x = 0;
        int maxSum = 0;
        int s0 = 0;
        for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
         s0 += (i*arr[i]);
          }


        maxSum = sum;
        x = sum ;

        sum = s0;
        int n =arr.length ;
        int count = 1;
        for (int i = 0 ;i < arr.length - 1; i++) {
            int si1 = s0 + x - (n * arr[n - i - 1]);
            if (si1 > maxSum)
                maxSum = si1;

     s0 = si1;
        }
        System.out.println(maxSum);
        }
    }

