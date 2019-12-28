package by.bntu.fitr.povt.alexeyd.lab16.entity;

import java.io.*;

public class Bread extends Product implements Serializable {

    //static final long serialVersionUID = 0L;

    public static int bredAmount;
    private boolean organic;
    private String sort;
    private String flour;
    private String color;
    private String shape;

    /* static initialization block (it's called only once) */
    static {
        bredAmount = 0;
    }

    /* initialization block (it's called every time an object is created)*/
    {
        bredAmount++;
    }

    public Bread() {}

    /* copy -constructor (type of constructor with parameters)*/
    public Bread(Bread bread) {
        super(bread.isHelpChildren(), bread.getWeight(), bread.getPrice(), bread.getId());
        this.organic = bread.organic;
        this.sort = bread.sort;
        this.flour = bread.flour;
        this.color = bread.color;
        this.shape = bread.shape;
    }

    public Bread(boolean helpChildren, int weight, double price, boolean organic, String sort, String flour, String color, String shape, int id) {
        super(helpChildren, weight, price, id);
        this.organic = organic;
        this.sort = sort;
        this.flour = flour;
        this.color = color;
        this.shape = shape;
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Bread{" +
            "organic=" + organic +
            ", sort='" + sort + '\'' +
            ", flour='" + flour + '\'' +
            ", color='" + color + '\'' +
            ", shape='" + shape + '\'' +
            ", helpChildren=" + isHelpChildren() + '\'' +
            ", weight=" + getWeight() + '\'' +
            ", price=" + getPrice() + '\'' +
            ", id=" + getId() + '\'' +
            '}';
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

    private void readObjectNoData() throws ObjectStreamException {

    }

/*    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeBoolean(this.organic);
        out.writeUTF(this.sort);
        out.writeUTF(this.flour);
        out.writeUTF(this.color);
        out.writeUTF(this.shape);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.organic = in.readBoolean();
        this.sort = in.readUTF();
        this.flour = in.readUTF();
        this.color = in.readUTF();
        this.shape = in.readUTF();
    }*/
}
