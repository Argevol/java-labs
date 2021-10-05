package Lab2.task1;

public class Son extends Father{
    //1
    public static int ageOfSon = 20;

    //2
    static {
        System.out.println("Son static block");
    }

    //11
    {
        System.out.println("Son non-static block");
    }

    //11
    public String nameOfSon = "Son name: Maxim";

    //12
    public Son(){
        System.out.println("Son: public static int = " + ageOfSon);
        System.out.println("Son: public static int = " + ageOfFather);
        System.out.println("Son: public static int = " + ageOfGrandFather);
        System.out.println("Son: public String name = " + nameOfSon);
        System.out.println("Son: public String name = " + nameOfFather);
        System.out.println("Son: public String name = " + nameOfGrandFather);
    }
}
