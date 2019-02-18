package objects;

import java.util.Date;

public abstract class Computer extends ElectronicDevice {

    //private  int ram;
   // private int hdd;
    protected Ram ram = new Ram(2048, "Intel");
    protected Hdd hdd = new Hdd(512, "Fujitsu");
    public static int compCount; // кол-во созданных объектов типа Comp
    public static Computer lastObject; // последний созданный объект

    // для этой переменной нет гетеров и сетеров, потому что значение всегда задается конструктором
   // private boolean cdWritable = true;// по-умолчанию диски можно записывать // т.т. мы создали новый класс CDRom


    //Computer расширяет поведение эл.устройства
    //теперь компьютер ы умеют загружаться и соединяться с устройствами
    //конкретное поведение задается в конкретных моделях
    public abstract void load();
    public abstract void connect();

    public Computer(){
        countObject();
    }

    public Computer(String name){
        super(name);
        countObject();
    }

    public Computer(String name, double weight){
        super(name, weight);
        countObject();
    }

   /* public Computer(String name, boolean cdWritable){
        super(name);
        this.cdWritable = cdWritable;
        countObject();
    }*/

    /*  public Computer(String name, double weight, int ram, int hdd, boolean cdWritable) {
        super(name, weight);

        this.ram = ram;
        this.hdd = hdd;
        //this.cdWritable = cdWritable;

        countObject();

        on();
    }*/

    //ведет подсчет объектов
    protected void countObject(){
        compCount++;
        lastObject = this;
    }


   /* public void writeDisc(){
        System.out.println("Объект: " + getName());
        if (cdWritable){// проверка, может ли привод записывать диски
            System.out.println("Запись диска...");
        }else{
            System.out.println("Невозможно записать диск. Привод не пишущий");
        }
    }
    */


  /*  @Override // нет необходимости переопределять данные методы, т.к. Computer является также абстрактным классом
    public void on() {
        System.out.println("Computer on();");
    }

    @Override
    public void off() {
        System.out.println("Computer off();");
    }
*/

    // измененный метод перезагрузки
    // для перезагрузки сначала выключаем компьютер, затем включаем и загружаем
    public void reboot() {
        //print("Computer reboot();");
        off();
        on();
        load();
    }


    //печать статистики
    public static void shoInfo(){
        // print(ram); // ошибка, т.к. переменная настатична
        print("Total count: " + compCount);
        print("Last object: " + lastObject);
    }


    // такой же метод, как и в классе ElectronicDevice (для тестирования, какой из методов будет вызываться)
    protected static void print(String str) {
        System.out.println(str);
    }

    //присвоение уникального заводского имени с датой и временем
    public static String createFactoryName(String str){
        return str + " " + new Date().toString() + " SOME INFORMATION";
    }


    public Ram getRam() {
        if(ram==null){
            ram = new Ram(2048, "Intel");
        }
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        if (hdd == null) {
            hdd = new Hdd(512, "Toshiba");
        }
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }
}
