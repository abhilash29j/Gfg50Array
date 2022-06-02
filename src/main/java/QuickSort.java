public class QuickSort {
    public static void main(String[] args) {
        int x[] = new int[]{3,4,1,4,6,8,12};
        printArray(x);
        quickSort(x,0,x.length - 1);
        printArray(x);

    }
    public static void quickSort(int x[] , int l, int r) {

        if (l >= r) return;
        else{
            int pivotIndex = partition(x, l,r);
            quickSort(x,l,pivotIndex - 1);
            quickSort(x, pivotIndex + 1 ,r);

        }

    }

    public static int partition(int x[] ,int l, int r){
        int pivot = x[r];
        int i = l - 1;
        for (int j = l; j < r; j = j + 1) {
            if  (x[j] < pivot) {
                i = i + 1;
                swap(x,i ,j);
            }
        }
        swap(x,i + 1,r);
        return i+1;
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
