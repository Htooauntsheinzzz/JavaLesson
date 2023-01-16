package multilevelInhertiance;

public class Son extends Father{
    static double sum;
    public static void main(String[] args) {
        Son s1 = new Son();
         sum = s1.fmoney+s1.gmoney;
        s1.getInfoforGrandFather();
        s1.getFatherInfo();

        System.out.println(sum);
    }
}
