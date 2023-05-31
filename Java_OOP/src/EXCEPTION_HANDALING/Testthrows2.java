package EXCEPTION_HANDALING;

class M{
    void method() {
        System.out.println("device operation performed");
    }
}
class Testthrows2{
    public static void main(String args[]){//declare exception
        M m=new M();
        m.method();

        System.out.println("normal flow...");
    }
}
