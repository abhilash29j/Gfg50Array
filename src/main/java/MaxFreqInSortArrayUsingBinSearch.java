public class MaxFreqInSortArrayUsingBinSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int n = arr.length;
        int x = 0;
         int count = countOccur(arr,n ,x);
        System.out.println(count);
    }

    public static int countOccur(int arr[],int n,int x){

        int ind = bs(arr,x,0, n - 1);
        if (ind == -1)
            return  -1;
        int count = 0;
        int left = ind;
        int right = ind ;
        while (left >=0 && arr[left] == x) {
            count++;
            left--;
        }

        while (right < n && arr[right] == x) {
            count++;
            right++;
        }
        return count - 1;


        }





    public static int  bs(int []arr,int x,int l,int r){

        if (r < l)
            return -1;
        int mid = l + (r - l)/2;
        if (arr[mid] == x) {
            return mid;
        }
        else if (arr[mid] > x) {

            return bs(arr,x,l ,mid - 1);

        }
        else {
            return bs(arr,x,mid + 1,r);
        }



    }

}
