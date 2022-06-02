import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MinimumPlatform {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
//      int  arr[] = {900, 1100, 1235};
//      int  dep[] = {1000, 1200, 1240};
        List<Pair> list = new ArrayList<>();
        Stack<Pair> st= new Stack<>();
        for (int i = 0; i < n; i++) {
         list.add(new Pair(arr[i],dep[i]));
        }

        Collections.sort(list,(o1,o2) -> (o1.getArr()) - (o2.getArr()));


       int count = 1;

    for (int i = 0; i <  n; i++) {
        if (i == 0) {
      st.add(list.get(i));
        }
        else {
            Pair x = list.get(i);
             Pair st1 = st.peek();
         if (x.getArr() > st1.getDep()) {

             st.pop();
             st.add(x);
          }

         else if (x.getArr() <= st1.getDep() && x.getDep() < st1.getDep() ) {
count++;
         }
         else if (x.getDep() >= st1.getDep()) {
             count++;
             st1 = st.pop();
             st1.setDep(st1.getDep());
             st.add(st1);
         }




        }

    }

        System.out.println(count);


    }


}
class Pair{
    int arr;
    int dep;
    public Pair(int arr, int dep) {
        this.arr = arr;
        this.dep = dep;

    }

    public int getArr() {
        return arr;
    }

    public void setArr(int arr) {
        this.arr = arr;
    }

    public int getDep() {
        return dep;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }
}
