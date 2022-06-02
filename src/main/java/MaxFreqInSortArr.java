public class MaxFreqInSortArr {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,2,2,3,3,3};
        int len = arr.length;
        int element = arr[0];
        int maxCount =Integer.MIN_VALUE;
        int count = 1;
        for (int i = 0 ; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count += 1;
                if (count > maxCount) {
                    maxCount = count;
                    element = arr[i];
                }
            }
            else {
                count = 1;
            }



        }

        System.out.println(element);

    }
}
