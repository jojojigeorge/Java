package polymorphism.dynamic_runtime_overriding;

public class second extends first{
    void sum(){
        System.out.println("this is in class second");
    }
    public static void main(String[] args) {
        second s=new second();
        s.sum();
    }
}
