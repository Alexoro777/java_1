class MyFirstJava1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }   
    
    static void checkSumSign() {
        int a = 5, b = 7;
        if (a + b >=0) {
            System.out.println("�㬬� ������⥫쭠�");
        } else {
            System.out.println("�㬬� ����⥫쭠�");
        }
    } 
    static void  printColor() {
        int value = 10;
        if (value <=0) {
            System.out.println("����");
        } 
        if (value >0 && value <=100) {
            System.out.println("�����");
        }
        if (value >100) {
            System.out.println("������");
        }
    }
    static void  compareNumbers() {
        int a = 20, b = 30;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }    
}    