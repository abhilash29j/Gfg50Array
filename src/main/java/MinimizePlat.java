import java.util.Arrays;

public class MinimizePlat {
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = arr.length;
        int i = 0;
        int j = 0;
        int maxTrain = 0;
        int platform = 0;


        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                maxTrain++;
                i++;
            }
            else {
                maxTrain--;
                j++;
            }
            platform = Math.max(platform,maxTrain);
        }
        System.out.println(platform);
    }
}
