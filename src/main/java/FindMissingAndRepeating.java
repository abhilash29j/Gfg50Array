public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int arr[] = {1,3,3};
        int len = arr.length;
        int sum = 0;
        int actSum = len * (len + 1)/2;
        int repeatNum = -1;
        int ans = -1;
        for (int i = 0; i < len; i++) {
            sum += Math.abs(arr[i]);
            int num = Math.abs(arr[i]);
            if (arr[num - 1] < 0) {
                repeatNum = Math.abs(arr[i]);

            }
           arr[num - 1] *= -1;
        }
//        System.out.println("actual sum : "+ actSum);
//        System.out.println("sum : "+ sum);
        if (actSum > sum ){
            ans = repeatNum + (actSum - sum);
        }
        else {
            ans = repeatNum - (sum - actSum);
        }
        System.out.println("REpeating num is : "+ repeatNum);
        System.out.println("Missing num is  : "+ ans);
     }
}
