package BLOCK_HANDELING;


class A {
    static {
        System.out.println("If this class extend by Main class then it executes first.");
    }
}

class B{
    static {
        System.out.println("If this class is not extend by Main class then we have to create a object of this class.");

    }
}
public class Main extends A  {

    static {
        System.out.println("It will execute first after creating main method."); //Static block
    }

    {
        System.out.println("When creating object of this class it executes.");//Instace block
    }
    public static void main(String[] args) {

        Main obj=new Main();
        B obj1=new B();

    }
}
