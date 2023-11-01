public class classObject {
    public static void main(String[] args) {
        hello c1 = new hello();
        hello c2 = new hello();
        c1.a = 10;
        c2.b = 20;
        // -------------------------------------------calling a static method without an object
        sum();

        // -------------------------------------------call static methode using class name (without help of object)
        // hello.staticdisplay();


        // --------------------------------------------access class varible using object
        // System.out.println("c1.a = " + c1.a);
        // System.out.println("c1.b = " + c1.b);
        // System.out.println("c2.a = " + c2.a);
        // System.out.println("c2.b = " + c2.b);
        // c1.display();
        // c2.display();
    }
    static void sum(){
        System.out.println("this is a simple method");
    }
}
