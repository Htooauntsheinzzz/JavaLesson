package mulitlevelInheritance2;

public class Man extends  Human{


    public static void main(String[] args) {
        Man m1 = new Man();
        m1.name="William";
        m1.gender="male";
        m1.nrc="1234234";
        m1.eat("Rice & Meat & Vegetable");
        m1.drink("Beer","night");
        m1.work("Software Engineer");

    }
}
