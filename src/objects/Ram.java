package objects;

public class Ram extends ElectronicDevice{

    private int size;// задается только в конструкторе, нельзя поменять после создания

    public Ram(String name) {
        super(name);
    }

    public Ram(int size) {
        this.size = size;
    }

    public Ram(String name, double weight) {
        super(name, weight);
    }

    public Ram(String name, double weight, int size) {
        super(name, weight);
        this.size = size;
    }

    public Ram(int size, String name) {
        super(name);
        this.size = size;
    }

    @Override
    public void on() {
        print("Ram initializing...");
    }

    @Override
    public void off() {
        print("Ram off");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
