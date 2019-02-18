package objects;



public abstract class Notebook extends  PermanentComputer{

    public Notebook(String name) {
        super(name);
    }

    public Notebook(String name, boolean cdWritable) {
        super(name, cdWritable);
    }

    // для ноутбуков добавляется поведение работы от батареи (чего не может обычный компьютер)
    public abstract void workFromBattery();

    // можно для ноутбуков реализовать методы on(), off(), load()
    // и при необходимости переопределять в дочерних классах
    @Override // данный метод уже был переопределен для 7 урока связанного с заданием для Монитора
    public void connect(){
        System.out.println("Notebook connect();");
    }

    @Override
    public void load(){
        System.out.println(getName() + " loading");
    }

    @Override
    public void on(){
        getHdd().on();
        getRam().on();
        System.out.println(getName() + " on");
    }

    @Override
    public void off(){
        getHdd().off();
        getRam().off();
        System.out.println(getName() + " off");
    }




}
