public class Sort01 {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,0,1,1,0,0,0,1,1};
        //sort zeroes and ones
        printArray(arr);
        int length = arr.length;
        int i = 0 ;int j =0;

        while(i < length) {
               if (arr[i] == 1) {
                   i++;
               }
               else if(arr[i] ==0){
                   swap(arr,i,j);
                   i++;
                   j++;
               }

        }


        printArray(arr);

    }
    public static void swap(int []arr,int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
