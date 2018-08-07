package DesignPatternsFromGangOf4.creational.prototype;

public abstract class Item implements Cloneable{
    String iname;
    double price;

    // Cloneable interface forces to add this overridden method here
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
