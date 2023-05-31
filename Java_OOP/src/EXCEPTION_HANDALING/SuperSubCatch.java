package EXCEPTION_HANDALING;

public class SuperSubCatch {


    //A sub class must come before its super class .
    public static void main(String[] args) {

        try{
            int a =0 ;
            int b = 42/a ;
        }
        catch (Exception e){
            System.out.println("Thd");
        }
//        catch (ArithmeticException e){
//            System.out.println("Access");
//        }
        //Its shows a error
        //sub class must come before super class



    }
}
