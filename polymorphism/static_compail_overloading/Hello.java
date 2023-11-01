package polymorphism.static_compail_overloading;

public class Hello {
    void display (){
        System.out.println("this is in method display()");
    }
    void display(int x){
        System.out.println("this is in method display(int x)");
    }
    public static void main(String[] args) {
        Hello h=new Hello();
        h.display(0);
        h.display();
    }
    
}
