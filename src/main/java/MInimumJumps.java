public class MInimumJumps {
    public static void main(String[] args) {
  //   int arr[] = {2,1,3,2,3,4,5,1,2,8};
 //  int arr[] ={2 ,3, 1, 1, 2, 4, 2 ,0 ,1, 1};
 //    int arr[] = {0 ,1, 1, 1, 1};
     int arr[] = {2,1,0,3};
        int n = arr.length;
        int dp[] = new int[n];
        dp[n - 1] = 0;

        int min = Integer.MAX_VALUE;
        for (int i = n - 2; i >=0; i--) {
            int jump = arr[i];
            if (jump == 0) {
                dp[i] = -1;
                continue;
            }
            for (int j = i + 1 ; j <= (i + jump) && (j < n); j++) {
              if (dp[j] < 0)
                  continue;
                min = Math.min(min,dp[j]);

            }
          if (min == Integer.MAX_VALUE) {
              dp[i] = -1;
          }
          else
          dp[i] = min + 1;

            min = Integer.MAX_VALUE;
        }

        for(int x : dp) {
            System.out.print(x + " ");
        }

    }
}
