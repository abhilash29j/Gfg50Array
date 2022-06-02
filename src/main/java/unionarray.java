public class unionarray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3};

        int len1 = a.length;
        int len2 = b.length;

        int count = 0;

        int i = 0,j = 0;
        int prev = Integer.MAX_VALUE;

        while (i < len1 && j < len2) {
            if (a[i] == b[j] ) {
                if (a[i] != prev)
                    count++;

                prev = a[i];
                i++;
                j++;

            }
            else if (a[i] < b[j]) {
                if (a[i] != prev) {
                    count++;
                    prev = a[i];

                }

                i++;
            }
            else if (a[i] > b[j]) {
                if (b[j] != prev) {
                    count++;
                    prev = b[j];

                }

                j++;
            }

        }


        while(i < len1){

            count++;
i++;
        }
        while(j < len2){

            count++;
j++;
        }

        System.out.println(count);


    }
}
