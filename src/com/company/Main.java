package com.company;

import Asus.AsusModel1;
import Asus.AsusModel2;
import ipad.IPadComposition;
import objects.Computer;
import printer.Printer;
import printer.PaperFormat;
import toshiba.ToshibaModel1;
import toshiba.ToshibaModel2;

public class Main {

    public static void main(String[] args) {

        ToshibaModel1 toshiba1 = new ToshibaModel1("T1");
        ToshibaModel2 toshiba2 = new ToshibaModel2("T2");

        AsusModel1 asus1 = new AsusModel1("A1");
        AsusModel2 asus2 = new AsusModel2("A2");

        toshiba1.writeDisc();
        asus1.writeDisc();
        toshiba1.on();
        toshiba1.workFromBattery();

        Computer.shoInfo();

        System.out.println(AsusModel1.createFactoryName(asus1.getName()));
        System.out.println(Computer.compCount);
        System.out.println(Computer.lastObject);

        System.out.println("*********************************************************");

//        Notebook note = new Notebook("IBM");
//        note.on();



        // нельзя создавать экземпляры этих классов!
//        Toshiba t1 = new Toshiba("asdasd"); // т.к. модификатор доступа конструктора Toshiba стоит protected
//        Asus a1 = new Asus();


      /*  // 7 урок, задание 2, полиморфизм: создание метода connect для каждой модели ноутбуков
        // вызов в классе Monitor с использованием полиморфизма
        Computer toshiba1 = new ToshibaModel1("T1");
        Computer toshiba2 = new ToshibaModel2("T2");

        Computer asus1 = new AsusModel1("A1");
        Computer asus2 = new AsusModel2("A2");

        Computer note1 = new Notebook("Note1");
        Computer comp1 = new Computer("Comp1");

        Monitor monitor = new Monitor();

        monitor.connectDevice(toshiba1);
        monitor.connectDevice(toshiba2);
        monitor.connectDevice(asus1);
        monitor.connectDevice(asus2);
        monitor.connectDevice(note1);
        monitor.connectDevice(comp1);
        */

      testPrinter();

        System.out.println("********************************************************************************");

        //проверяем работу на наследовние и на композицию свяязанногос классом  Планшет и его дочерними классом и
        // Отдельным классом созданным с помощью композиции

        IPadComposition ipad1 = new IPadComposition();
        ipad1.getCamera();
        ipad1.on();
        System.out.println(ipad1.getHdd());
        ipad1.getScreen();
        ipad1.takePhoto();
        ipad1.off();



    }

    private  static void testPrinter(){
        //печать принтера на заданных форматах бумаги

        Printer printer = new Printer();
        printer.printPaperTypes();

        printer.print(PaperFormat.A5, "1111111111111111");
        printer.print(PaperFormat.A4, "000000000000000000000");
        printer.print(PaperFormat.A3, "4555");
    }
}
