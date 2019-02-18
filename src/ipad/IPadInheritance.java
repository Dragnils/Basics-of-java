package ipad;


import objects.Planshet;

// при наследовании мы зависим от родительской реализации, например для IPad не нужен диск, который наследуется
// чтобы избежать ненужной реализации родительких классов, создан абстрактный класс Planshet
public class IPadInheritance extends Planshet{


    public IPadInheritance(String name) {
        super(name);
    }

    public IPadInheritance(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void navigateByScreen() {
        print("IPad navigate by screen");
    }

    public void useRetinaDisplay(){
        print("using retina display...");
    }

    @Override
    public void connect() {
        print("IPad connect");
    }

    @Override
    public void on(){
       print("IPad on()");
    }

    @Override
    public void load(){
        print("IPad navigate by screen");
    }

    @Override
    public void off(){
        print("IPad off()");
    }

    @Override
    public void takePhoto(){
        getCamera().splash();
        getCamera().takeFoto();
    }


}
