public class Swapping {
    public static void main(String[] args) {
        swappingWithThirdVariable();
        System.out.println("===================================================");
        swappingWithoutUsingThirdVariable();
    }
    public static void swappingWithThirdVariable(){
        //swapping with using 3rd variable
        int a = 10;
        int b = 20;
        System.out.println("Before swapping by using third variable the value of a is: "+a);
        System.out.println("Before swapping by using third variable the value of b is: "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping by using third variable the value of a is: "+a);
        System.out.println("After swapping by using third variable the value of b is: "+b);
    }
    public static void swappingWithoutUsingThirdVariable(){
        //swapping without using 3rd variable
        int a = 10;
        int b = 20;
        System.out.println("Before swapping by without using third variable the value of a is: "+a);
        System.out.println("Before swapping by without using third variable the value of b is: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping by without using third variable the value of a is: "+a);
        System.out.println("After swapping by without using third variable the value of b is: "+b);
    }
}
