package DesignPatternsFromGangOf4.creational.builder;

public class StudentBuilder {

    public static class Builder {
        private String name;
        private String sub1;
        private String sub2;
        private double grade;

        public Builder(){

        }

        public StudentBuilder build(){
            return new StudentBuilder(this);
        }

        public Builder withName(String name){
            this.name=name;
            return this;
        }

        public Builder withSub1(String sub1){
            this.sub1=sub1;
            return this;
        }

        public Builder withSub2(String sub2){
            this.sub2=sub2;
            return this;
        }

        public Builder withGrade(double grade){
            this.grade=grade;
            return this;
        }
    }

    private final String name;
    private final String sub1;
    private final String sub2;
    private final double grade;

    private StudentBuilder(Builder builder){
        this.name=builder.name;
        this.sub1=builder.sub1;
        this.sub2=builder.sub2;
        this.grade=builder.grade;
    }

    public String getName() {
        return name;
    }

    public String getSub1() {
        return sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public double getGrade() {
        return grade;
    }
}
