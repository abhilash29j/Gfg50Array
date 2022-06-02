public class SegregateNegAndPostNotPreser {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-1,4,8,-33,-1,2,-21};
        int i = 0;
        int j = arr.length - 1;
        while (true){
            while (arr[i] > 0 && i < j) {
                i++;
            }
            while (arr[j] < 0 && i < j) {
                j--;
            }
          if (i < j){
          swap(arr,i ,j);
          i++;
          j--;
          }
          else
              break;

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
