public class SubarrayWithGivenSumUsingSlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int num = 12;
        int len = arr.length;
        int i = 0 , j = 0;
        int sum = 0;
        while (i <= j  && j < len) {
            sum += arr[j];
            if (sum == num) {
                System.out.println((i + 1) + " " + (j + 1));
                break;
            }
            else if (sum < num) {
                j++;
            }
            else if (sum > num) {
                sum -= arr[i];
                sum -= arr[j];

                i++;

            }

        }
    }
}
