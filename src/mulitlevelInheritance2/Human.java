package mulitlevelInheritance2;

public class Human extends Animal {
    String nrc;

    void work (String job){
        System.out.println(name+"work as"+job);
        System.out.println("His nrc no is "+ nrc);
    }

}
