public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int num = 12;
        int len = arr.length;


        for (int i = 0; i < len - 1; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < len ; j++) {
                sum += arr[j];
                if (sum == num)
                    System.out.println(i + 1 +" " + (j + 1));
                else if (sum > num)
                    break;
            }
        }

    }
}
