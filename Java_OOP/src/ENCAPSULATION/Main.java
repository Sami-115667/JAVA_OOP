package ENCAPSULATION;

class Person {
    private String name; // private = restricted access

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person obj = new Person();
        //obj.name is not is accessible
        //because name is private

        obj.setName("Habiul Islam ");
        System.out.println(obj.getName());
    }
}

