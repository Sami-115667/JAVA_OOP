package EXCEPTION_HANDALING;

public class NestTry {

    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 34 /a ;
            System.out.println("a = "+a);
            try{
                if(a==1) a=a/(a-a);
                if(a==2){
                    int []c = {1};
                    c[34]=99 ;
                }

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }catch(ArithmeticException e ){
            System.out.println(e);
            System.out.println(1111);
        }
    }

}
