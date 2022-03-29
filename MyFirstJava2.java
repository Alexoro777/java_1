/**
 * Java 1. Homework 2
 * 
 * @author Alexey Chulkov
 * @version 27.03.2022
 */
 
class MyFirstJava2 {
    public static void main(String[] args) {
        System.out.println(within10and20(8, 9));
        positiveOrNegative(-5);
        System.out.println(isTrueOrFalse(15));
        printLine("My first java 2", 5);
	}
    
    static boolean within10and20(int a, int b) {
        return a + b <= 20 && a + b >= 10;
    }
    
    static void positiveOrNegative(int a) {
        System.out.println(a >= 0? "Positive" : "Negative");
    }  
     
    static boolean isTrueOrFalse(int c) {
        return c < 0;
    }
    
    static void printLine(String d, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println(d);
        }
    }     
}
