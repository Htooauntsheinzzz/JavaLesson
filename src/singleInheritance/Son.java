package singleInheritance;

public class Son extends Father{

    public static void main(String[] args) {
        Son s1 = new Son();
        s1.money=100000;
        s1.phone="Samsung";
        s1.getPhoneandMoney();
        s1.fatherWork();
        s1.fatherOwn();

    }

}
