public class SubarrayWithgivenSumUsingSlidinGWindow {
    public static void main(String[] args) {
        int arr[] = {142,112,54,69,148,45,63,158,38,60,124,142,130,179,117,36,191,43,89,107,41,143,65,49,47,6,91,130,171,151,7,102,194,149,30,24,85,155,157,41,167,177,132,109,145,40,27,124,138,139,119,83,130,142,34,116,40,59,105,131,178,107,74,187,22,146,125,73,71,30,178,174,98,113};
        int num = 256;
        int len = arr.length;
        int currSum = 0;
        int start = 0;
        for (int i = 0; i < len; i++) {
            currSum += arr[i];

            while (currSum > num) {
                currSum -= arr[start];
                start++;
            }
            if (currSum == num) {
                System.out.println((start + 1) + " " + (i + 1));
            }



        }



    }
}

