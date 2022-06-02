public class Test {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,1,6,9,12};
        int len = arr.length;
//        int min = arr[0];
//        int max = arr[0];
//
//        for (int i = 1; i < len; i++) {
//            if (arr[i] > max) max = arr[i];
//            else if (arr[i] < min) min = arr[i];
//
//        }
//        System.out.println(min +"  "+ max);
        int max , min;
        int index;
        if (len % 2 != 0) {
            max = arr[0];
            min = arr[0];
            index = 1;
        }
        else {
            if (arr[0] < arr[1]){
                max = arr[1];
                min = arr[0];
            }
            else {
                max = arr[0];
                min = arr[1];

            }

        }
        index = 2;

   while (index < len) {
       if (arr[index] < arr[index + 1]) {
             if (arr[index] < min) min = arr[index];
             if (arr[index + 1] > max) max = arr[index + 1];

       }

       else {
           if (arr[index] > max) max = arr[index];
           if (arr[index + 1] < min) min = arr[index + 1];

       }
    index+=2;
   }
        System.out.println(min +" "+ max);
    }
}
