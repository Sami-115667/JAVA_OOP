package CONSTRUCTOR;


 class Data {

    private String name;

    public Data(String n) {
        System.out.println("Parameterized Constructor");
        this.name = n;
    }

    public String getName() {
        return name;
    }
}

public class Main {




        public static void main(String[] args) {
            Data d = new Data("Java");
            System.out.println(d.getName());
        }



}
