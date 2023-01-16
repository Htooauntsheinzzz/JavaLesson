package multilevelInhertiance;

public class Father extends GrandFather{

    double  fmoney=300000;
    String fphone = "Samsung note 22";

    void getFatherInfo(){
        System.out.println("Father money is"+fmoney);
        System.out.println("Father phone is"+fphone);
    }
}
