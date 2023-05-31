package EXCEPTION_HANDALING;

public class MultipleCatches {


    public static void main(String[] args){

        //main thread occuress exception
            try {
                int a = args.length;
                System.out.println("a = "+a);
                int []c = {1};
                c[22]=89;
                int  b= 42/a ;
                c[222]=89;

            }catch (ArithmeticException e){
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        System.out.println("After try catch Block ");

    }
}
