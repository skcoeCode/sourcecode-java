
public class WorkingWithLoop {

    public static void main(String[] args) {
        sum10();
    }

    private static void sum10() {
        int total=0;
        for (int i = 1; i < 10; i++) {
            total=total+i;
        }
        System.out.println(total);
    }

}
