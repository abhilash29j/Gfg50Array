public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trappingWater(new int[]{3, 0, 0, 2, 0, 4}, 6));
    }

    static long trappingWater(int arr[], int n) {

        long ans = 0;
        int maxl[] = new int[n];
        int maxr[] = new int[n];

        maxl[0] = arr[0];
        maxr[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            maxl[i] = Math.max(maxl[i - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            maxr[i] = Math.max(maxr[i + 1], arr[i]);
        }
        for (int i = 0; i < n; i++) {
            ans = ans + (Math.min(maxl[i], maxr[i]) - arr[i]);

        }
        for (int  i : maxl) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int  i : maxr) {
            System.out.print(i + " ");
        }
        System.out.println();

        return ans;
    }

}
