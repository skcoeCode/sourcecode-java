package com.java.oop.design.day5;

/*
 * [1,5]
 * [1,5)
 * (1,5]
 * (1,5]
 * 
 */
public class RangeNumber {
    private String range;

    public RangeNumber(String string) {
        this.range = string;
    }

    public boolean startWithInclude() {
       return this.range.startsWith("[");
    }

   /* public boolean startWithExclude() {
        return this.range.startsWith("(");
    }*/

    public boolean endWithInclude() {
        
        return this.range.endsWith("]");
    }

   /* public boolean endWithExclude() {
        return this.range.endsWith(")");
    }*/

    public int startNumber() {
       // this.range.substring(0, 1);
        
        int num = Integer.parseInt("" + this.range.charAt(1));
        return num;
    }

    public int endNumber() {
        int num = Integer.parseInt("" + this.range.charAt(this.range.length() - 2));
        return num;
    }

    public String ofResult() {
        String result = "";
        
        try {
            int startNumber = this.startNumber();
            int endNumber = this.endNumber();
            result = getResultV2(result, startNumber, endNumber);
        } catch (StringIndexOutOfBoundsException e) {}

        System.out.println(result);

        return result;
    }

    private String getResultV1(String result, int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
            if (i == startNumber) {
                if (this.startWithInclude()) {
                    result += i + ",";
                }
            } else if (i == endNumber) {
                if (this.endWithInclude()) {
                    result += i + ",";
                }
            } else {
                result += i + ",";
            }
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }
    private String getResultV2(String result, int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
           
                result += i + ",";
           
        }
        if (!this.startWithInclude()) {
            result = result.substring(2);
        }
        if (!this.endWithInclude()) {
            result = result.substring(0, result.length() - 2);
        }
        
        result = result.substring(0, result.length() - 1);
        return result;
    }

}
