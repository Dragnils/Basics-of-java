package objects;

public abstract class PermanentComputer extends Computer {


    // для этой переменной нет гетеров и сетеров, потому что значение всегда задается конструктором
    private boolean cdWritable = true;// по-умолчанию диски можно записывать

    private CDRom cdRom;

    public PermanentComputer(String name){
        super(name);
    }

    public PermanentComputer(String name, double weight){
        super(name, weight);
    }

    public PermanentComputer(String name, boolean cdWritable){
        super(name);
        this.cdWritable = cdWritable;
        countObject();
    }

    public PermanentComputer(String name, double weight, Ram ram, Hdd hdd, boolean cdWritable){
        super(name, weight);

        this.ram = ram;
        this.hdd = hdd;
        this.cdWritable = cdWritable;

        countObject();

        on();
    }


    // метод записи диска - общий для всех дочерних классов
    // но его можно переопределить при необходимости
    public void writeDisc(){
        getCdRom().writeDisc();
    }

    public void readDisck(){
        getCdRom().readCD();
    }


    public CDRom getCdRom() {
        if (cdRom==null) cdRom = new CDRom(cdWritable);
        return cdRom;
    }

}
