package JAVA_BASICS;

//Show the difference between int and long using a large number.

public class Q2 {
    public static void main(String[] args){
        
        // int range: -2,147,483,648 to 2,147,483,647
        // long range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        int intValue = 2147483647; 
        long longValue = 9223372036854775807L;

        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);
    }
    
}
