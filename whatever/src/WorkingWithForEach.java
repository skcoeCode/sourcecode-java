
public class WorkingWithForEach {

    public static void main(String[] args) {
        int[] number= {1,2,3,4,5,6,7,8};
        //Old way
        for (int s = 0; s < number.length; s++) {
            System.out.println(s);
        }
        //For each
        for (int i : number) {
            System.out.println(i);
        }

    }

}
