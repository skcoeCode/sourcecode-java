
public class PrimeFactor {

    public String of(int number) {

        String result = "";

        

        result = calPrimerFactor2(number, result);

        return result;
    }

    private String calPrimerFactor1(int number, String result) {
        int primeNumber=2;
        for (; number > 1; ) {
            if(number%primeNumber==0) {
                result=result+primeNumber;
                number=number/primeNumber;
            }else {
                primeNumber=primeNumber+1; 
            }
        }
        return result;
    }
    private String calPrimerFactor2(int number, String result) {
        int primeNumber=2;
        while (number > 1) {
            if(number%primeNumber==0) {
                result=result+primeNumber;
                number=number/primeNumber;
            }else {
                primeNumber=primeNumber+1; 
            }
        }
        return result;
    }

}
