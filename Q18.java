package JAVA_BASICS;

//Narrowing cast: convert a double to an int and print both.
public class Q18 {
    public static void main(String[] args){
        double x=9.78;
        int y=(int)x; 
        System.out.println("Double value: "+x);
        System.out.println("Narrowed to integer: "+y);
    }
}
