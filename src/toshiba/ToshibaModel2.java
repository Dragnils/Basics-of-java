package toshiba;

import objects.Notebook;

public class ToshibaModel2 extends Toshiba{

    public ToshibaModel2(String name) {
        super(name);
    }

    @Override
    public void connect(){
        System.out.println("ToshibaModel2 connect();");
    }


    // метод, который нужно выполнить перед подключением (connect())
    // для демонстрации полиморфизма в классе Monitor в методе connectDevice
    public void initializeBeforeConnect(){
        System.out.println("Model " + getName() + "  initializing before connect...");
    }


    @Override
    public void workFromBattery() {
        print("ToshibaModel2 different working from battery");
    }

    @Override
    public void lightKeyboard() {
        print("ToshibaModel2 keyboard lighting");
    }
}
