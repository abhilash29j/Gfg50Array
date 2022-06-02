import java.util.Scanner;

public class ReverseArray {

    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        while(test-->0){
            int n=in.nextInt();
            reverse(n,in);
        }
    }


    public static void reverse(int n, Scanner in) {
        if (n == 0)
            return;

        int x = in.nextInt();
        reverse(n - 1,in);
        System.out.print(x +" ");


    }


}
