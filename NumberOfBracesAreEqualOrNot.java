public class Coding {
    public static void main(String[] args) {
        int count =0;
        String str = "{}((()))()()[]";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='{' || str.charAt(i)== '(' || str.charAt(i) == '['){
                count ++;
            }
            else{
                count --;
            }
        }
        if(count ==0){
            System.out.println("braces are match to each other");
        }else {
            System.out.println("braces are mismatch");
        }
    }
}
