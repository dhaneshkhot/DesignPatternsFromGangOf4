package DesignPatternsFromGangOf4.creational.builder;

public class StudentBuilderDemo {
    public static void main(String args []){
        StudentBuilder.Builder builder=new StudentBuilder.Builder();
        StudentBuilder studentBuilder =
                builder.withName("Mike")
                .withSub1("Maths")
//                .withSub2("Science")
                .withGrade(7.8)
                .build();

        System.out.println(studentBuilder.getName());
        System.out.println(studentBuilder.getSub1());
        System.out.println(studentBuilder.getSub2());
        System.out.println(studentBuilder.getGrade());
    }

}
