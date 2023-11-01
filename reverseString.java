public class reverseString {
    public static void main(String[] args) {
        String str = "God is Love";
        String result="";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            result=ch+result;
        }
        System.out.println("\n Result :"+result);
    }
    
}