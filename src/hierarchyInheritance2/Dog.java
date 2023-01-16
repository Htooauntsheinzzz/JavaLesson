package hierarchyInheritance2;

public class Dog  extends  Animal{

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Aung Net";
        d1.gender="Male";
        d1.getInfo();
        d1.eat("Bones");

    }
}
