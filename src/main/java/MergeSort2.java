public class MergeSort2 {
    public static void main(String[] args) {
        int arr[] = new int[]{2,5,1,12,3,6,7};
        printArray(arr);
        sort(arr,0,arr.length - 1);
        printArray(arr);
    }
    public static void sort(int arr[],int l,int r){
  if ( l < r) {
      int m = l + (r - l) / 2;
      sort(arr, l, m);
      sort(arr, m + 1, r);
      merge(arr, l, m, r);
  }
    }

    public static void merge(int arr[],int l ,int m , int r) {
        int n1 = (m - l) + 1;
        int n2 = r - m;
        int ar1[] = new int[n1];
        int ar2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            ar1[i] = arr[l + i];

        }
        for (int i = 0; i < n2; i++) {
            ar2[i] = arr[m + i + 1];

        }
        int i = 0, j= 0 , k=l;
        while (i < n1 && j <n2) {
            if (ar1[i] <= ar2[j]){
                arr[k] =ar1[i];
                i++;

            }
            else {
                arr[k] =ar2[j];
                j++;


            }
            k++;

        }
     while ( i < n1) {
         arr[k] = ar1[i];
         i++;
         k++;
     }
     while (j < n2) {
         arr[k] = ar2[j];
         j++;
         k++;
     }

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
