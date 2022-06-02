public class MaxFreqInSortArrayUsingBinSearch2 {
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int n = arr.length;
        int x = 2;
        int count = count(arr,n ,x);
        System.out.println(count);
    }

    public static int count(int arr[] ,int n, int x) {
        int fir =first(arr, 0 , n - 1,x);
        int las = last(arr, 0 , n - 1,x);


        return las - fir + 1 ;
    }
    public static int first(int arr[],int l ,int r ,int x){

        if (l > r)
            return 0;
        int mid = l + (r - l)/2;
        if (mid ==0 || arr[mid] == x && arr[mid - 1] < x) {
            return mid;
        }
        else if (x > arr[mid]){
            return first(arr,mid + 1, r, x);
        }
        else {
            return first(arr,l , mid - 1,x);
        }

    }
    public static int last(int arr[],int l ,int r ,int x){

        if (l > r)
            return 0;
        int mid = l + (r - l)/2;
        if (mid == arr.length - 1 || arr[mid] == x && arr[mid + 1] > x) {
            return mid;
        }
        else if (x < arr[mid]){
            return last(arr,l ,mid -1, x);
        }
        else {
            return last(arr,mid + 1, r,x);
        }

    }




}
