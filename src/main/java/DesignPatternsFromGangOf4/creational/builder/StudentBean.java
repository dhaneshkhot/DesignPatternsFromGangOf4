package DesignPatternsFromGangOf4.creational.builder;

public class StudentBean {
    private String name;
    private String sub1;
    private String sub2;
    private double grade;

    public StudentBean() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
