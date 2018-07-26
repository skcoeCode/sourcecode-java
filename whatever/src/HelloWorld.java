/**
 * 
 * @author user
 *
 */
public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld s = new HelloWorld();
        s.say(100);
    }

    private static final int NUMBER_TWO=2;
    public static int index=1;
    private int number=3;
    private void say(int number) {
        int index = 0;

        System.out.println(index);
        System.out.println(number);
        System.out.println(this.number);
        System.out.println(NUMBER_TWO);
        System.out.println(HelloWorld.index);
    }

}
