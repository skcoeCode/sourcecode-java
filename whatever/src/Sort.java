
public class Sort {

    public int[] of(int[] input) {
        int count =1;
        while (count > 0) {
            count=0;
            for (int i = 0; i < input.length-1; i++) {
                if(input[i] > input[i+1]) {
                    int temp=input[i];
                    input[i]=input[i+1];
                    input[i+1]=temp;
                    count++;
                }
            }
        }
        return input;
        
/*        
        ////
        int length=input.length;
        int[] inputTemp = new int[length];
       if(length==1) {
           inputTemp=input;
       }

       if(length==2) {
           if (input[0] > input[1]) {
               inputTemp[1] = input[0];
               inputTemp[0] = input[1];
           }else {
               inputTemp=input;
           }
       }
       if(length==3){
           boolean flag=false;
           if (input[0] > input[1]) {
               inputTemp[1] = input[0];
               inputTemp[0] = input[1];
               flag=true;
           }
           if(input[1] > input[2] ) {
               inputTemp[1] = input[2];
               inputTemp[2] = input[1];
               flag=true;
           }
           if(!flag) {
               inputTemp=input;
           }
       }
       if(length==4) {
           boolean flag=false;
           if (input[0] > input[1]) {
               inputTemp[1] = input[0];
               inputTemp[0] = input[1];
               flag=true;
           }
           if(input[1] > input[2] ) {
               inputTemp[1] = input[2];
               inputTemp[2] = input[1];
           }
           
           if(input[2] > input[3] ) {
               inputTemp[2] = input[3];
               inputTemp[3] = input[2];
           }
           
          
       }
        */

       
    }

    private void swap(int i, int j) {
        // TODO Auto-generated method stub
        
    }

}
