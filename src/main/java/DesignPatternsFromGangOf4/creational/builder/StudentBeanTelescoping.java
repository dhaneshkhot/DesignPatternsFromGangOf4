package DesignPatternsFromGangOf4.creational.builder;

public class StudentBeanTelescoping {
    private String name;
    private String sub1;
    private String sub2;
    private double grade;


    public StudentBeanTelescoping(String name) {
        this.name=name;
    }

    public StudentBeanTelescoping(String name, String sub1) {
        this(name);
        this.sub1=sub1;
    }

    public StudentBeanTelescoping(String name, String sub1, double grade) {
        this(name, sub1);
        this.grade=grade;
    }

    public StudentBeanTelescoping(String name, String sub1, String sub2) {
        this(name, sub1);
        this.sub2=sub2;
    }

    public StudentBeanTelescoping(String name, String sub1, String sub2, double grade) {
        this(name, sub1, sub2);
        this.grade=grade;
    }
}

