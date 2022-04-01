/**
 * Java 1. Homework 3
 * 
 * @author Alexey Chulkov
 * @version 30.03.2022
 */
 
import java.util.Arrays;
 
class MyFirstJava3 {
    public static void main(String[] args) {
        changingArray();
        fillArray();
        multiplyArray();
        squareArray();
        returnArray(9, 8);
    }
    
    static void changingArray() {
        int[] arr = {1, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
            }else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillArray() {
        int[] arr = new int[100];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void multiplyArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *=2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void squareArray() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }    
    
    static void returnArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}