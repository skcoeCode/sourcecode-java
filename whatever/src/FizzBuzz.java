

public class FizzBuzz {
    public static String sendRes(int number) {
        String result = "";
        if (mod3and5(number)) {
            result = "FizzBuzz";
        } else if (mod3(number)) {
            result = "Fizz";
        } else if (mod5(number)) {
            result = "Buzz";
        } else {
            result = String.valueOf(number);
        }
        
       
        
        return result;

    }

    private static boolean mod3and5(int number) {
        return mod3(number) && mod5(number);
    }

    private static boolean mod5(int number) {
        return number % 5 == 0;
    }

    private static boolean mod3(int number) {
        return number % 3 == 0;
    }
}
