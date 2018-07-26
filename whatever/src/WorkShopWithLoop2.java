
public class WorkShopWithLoop2 {

    public static void main(String[] args) {
        // heart
        step3();

    }

    private static void step3() {
        int start = 9;
        // แบ่งปัญหา

        // line 1\
        System.out.println(" **   ** ");
    
        
        // line 2
        for (int i = 0; i < 9; i++) {
            if(i== start/2) {
            System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }
        System.out.println();

        // line 3-7
       
        for (int round = 0; round < 5; round++) {
            for (int a = 0; a < round; a++) {
                System.out.print(" ");
            }
            for (int j = 0; j < start; j++) {
                System.out.print("*");
            }
            System.out.println();
            start = start - 2;
        }

    }

    private static void step1() {
        // line 1
        // line 2

        // line 3
        for (int j = 0; j < 9; j++) {
            System.out.print("*");
        }

        // line 4
        System.out.println("");
        System.out.print(" ");
        for (int j = 0; j < 7; j++) {
            System.out.print("*");
        }
        System.out.print(" ");

        // line 5
        System.out.println("");
        System.out.print(" ");
        System.out.print(" ");
        for (int j = 0; j < 5; j++) {
            System.out.print("*");
        }

        // line 6
        // line 7
        // line 8
        // line 9
    }

    private static void step2() {

        // แบ่งปัญหา

        // line 1
        // line 2

        // line 3-7
        int start = 9;
        for (int round = 0; round < 5; round++) {
            for (int a = 0; a < round; a++) {
                System.out.print(" ");
            }
            for (int j = 0; j < start; j++) {
                System.out.print("*");
            }
            System.out.println();
            start = start - 2;
        }

    }

}
