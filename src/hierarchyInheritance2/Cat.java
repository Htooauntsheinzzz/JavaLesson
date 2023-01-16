package hierarchyInheritance2;

public class Cat extends  Animal{



    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.name="Hello kiity";
        c1.gender ="female";
        c1.getInfo();
        c1.eat("fishes");
    }
}
