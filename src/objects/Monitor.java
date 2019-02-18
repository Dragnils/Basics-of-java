package objects;

import toshiba.ToshibaModel2;

// принципы полиморфизма

public class Monitor extends ElectronicDevice {

    @Override
    public void on() {
        System.out.println(getName() + " on");
    }

    @Override
    public void off() {

    }

    public Monitor() {
    }

    public Monitor(String name) {
        super(name);
    }

    public Monitor(String name, double weight) {
        super(name, weight);
    }

    public void connectDevice(Computer comp){
        if(comp instanceof ToshibaModel2){
            // первый вариант нисходящего приведения: без создания отдельной переменной, все в одной строке
            // используется, когда нужно вызвать только один метод

            ((ToshibaModel2)comp).initializeBeforeConnect();

            // другой вариант : с присвоением в переменную
            // используется, когда нужно вызвать несколько методов, чтобы каждый раз не приводить как в первом случае
//             ToshibaModel2 tm2 = (ToshibaModel2)comp;
//             tm2.initializeBeforeConnect();
        }
        comp.connect();
    }
}
