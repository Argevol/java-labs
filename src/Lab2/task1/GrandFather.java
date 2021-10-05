package Lab2.task1;

public class GrandFather {
    //5
    public static int ageOfGrandFather = 60;

    //6
    static {
        System.out.println("GrandFather static block");
    }

    //7
    {
        System.out.println("GrandFather non-static block");
    }

    //7
    public String nameOfGrandFather = "GrandFather name: Ivan";

    //8
    public GrandFather(){
        System.out.println("GrandFather: public static int = " + ageOfGrandFather);
        System.out.println("GrandFather: public String name = " + nameOfGrandFather);
    }
}
