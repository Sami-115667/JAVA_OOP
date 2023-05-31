package WRAPPER;

public class Main {
    public static void main(String[] args) {
        //wrapperClass objectOfWrapperClass
//        Integer myInt = 5;
//        Double myDouble = 5.99;
//        Character myChar = 'A';
//        System.out.println(myInt);
//        System.out.println(myDouble);
//        System.out.println(myChar);

        Integer myInt = 500001;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        String obj = myInt.toString();
        System.out.println("Length : "+obj.length());
        String obj1 = String.valueOf(myInt);
        System.out.println("Length : "+obj1.length());
        String obj2 = String.valueOf(myDouble);
        System.out.println("Length : "+obj1.length());


    }
}

