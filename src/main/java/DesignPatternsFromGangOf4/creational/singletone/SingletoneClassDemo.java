package DesignPatternsFromGangOf4.creational.singletone;

public class SingletoneClassDemo {

    public static void main (String arg[]) {
        SingletoneClass singletoneClass1 = SingletoneClass.getInstance();
        SingletoneClass singletoneClass2 = SingletoneClass.getInstance();

        System.out.println(singletoneClass1);
        System.out.println(singletoneClass2);
    }
}
