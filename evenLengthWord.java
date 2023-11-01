public class evenLengthWord {
    public static void main(String[] args) {
        String line="In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available. It is also used to temporarily replace .";
        for ( String s:line.split(" ")) {
            if (s.length()%2==0) {
                System.out.println(s+' ');
            }
            
        }
    }
}
