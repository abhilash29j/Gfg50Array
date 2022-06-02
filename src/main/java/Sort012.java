public class Sort012 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,0,0,0,1,0,2,0,0,1};
        int length = arr.length;
        int i = 0, j = 0, k = length - 1;
        int  len = length;
        while (i < len) {
            if (arr[i] == 1) {
                i++;
            }
            else if (arr[i] == 0) {
                swap(arr, i ,j);
                j++;
                i++;
            }
            else if (arr[i] == 2) {
                swap(arr,i ,k);
                k--;
                len--;

            }


        }
        printArray(arr);

    }


    public  static void swap(int x[],int a,int b){

        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
