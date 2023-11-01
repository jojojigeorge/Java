package interface1;

public class second implements first{
    public void display(){
        System.out.println("this is an example of interface-------------");
    }
    public static void main(String[] args) {
        second s= new second();
        s.display();
    }
}
