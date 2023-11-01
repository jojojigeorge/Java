package abstraction;

public class second extends hello {
    void display(){
        System.out.println("this is in second class display method");
    }
    public static void main(String[] args) {
        second s=new second();
        s.display();
        s.hey();
    }
    
}
