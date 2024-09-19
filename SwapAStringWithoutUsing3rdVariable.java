public class SwapAStringWithoutUsing3rdVariable {
    public static void main(String[] args) {
        String str1 = "swati";
        String str2 = "mishra";
        System.out.println("Value of String 1 before swapping is: "+str1);
        System.out.println("Value of String 2 before swapping is: "+str2);
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str1.length() - str2.length()-1);
        System.out.println("Value of String 1 after swapping is: "+str1);
        System.out.println("Value of String 2 after swapping is: "+str2);
    }
}
