package mulitlevelInheritance2;

public class Animal {
    String name;
    String gender;

    void eat(String food){    // one parameter method
        System.out.println(name+" eat "+food);
    }
    void drink(String something,String time){   // two parameter method
        System.out.println(name+" drink "+something);
        System.out.println("Drinking time is "+time);
    }

}
