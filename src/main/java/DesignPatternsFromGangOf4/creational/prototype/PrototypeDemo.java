package DesignPatternsFromGangOf4.creational.prototype;

public class PrototypeDemo {
    public static void main(String [] args){
        Registry registry = new Registry();
        // cloned
        Movie movie = (Movie)registry.createItem("Movie");
        movie.setIname("Prototype creational design pattern");

        System.out.println(movie);
        System.out.println(movie.getIname());
        System.out.println(movie.price);
        System.out.println(movie.getRuntime());

        Movie movie2 = (Movie)registry.createItem("Movie");
        movie2.setIname("Another movie");

        System.out.println(movie2);
        System.out.println(movie2.getIname());
        System.out.println(movie2.price);
        System.out.println(movie2.getRuntime());
    }
}
