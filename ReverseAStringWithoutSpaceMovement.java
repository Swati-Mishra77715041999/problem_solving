public class ReverseAStringWithoutSpaceMovement {
    public static void main(String[] args) {
        String str = "Today is Monday";
        String rev = "";
        String temp = "";
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i) == ' '){
                continue;
            }
            rev = rev + str.charAt(i);
        }
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                temp = temp + rev.charAt(count);
                count++;
            }else{
                temp = temp + "\s";
            }
        }
        System.out.println("Reverse string is: "+temp);
    }
}
