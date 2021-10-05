package Lab2.task1;

public class Father extends GrandFather{
    //3
    public static int ageOfFather = 40;

    //4
    static {
        System.out.println("Father static block");
    }

    //9
    {
        System.out.println("Father non-static block");
    }

    //9
    public String nameOfFather = "Father name: Mykhailo";

    //10
    public Father(){
        System.out.println("Father: public static int = " + ageOfFather);
        System.out.println("Father: public static int = " + ageOfGrandFather);
        System.out.println("Father: public String name = " + nameOfFather);
        System.out.println("Father: public String name = " + nameOfGrandFather);
    }

}
