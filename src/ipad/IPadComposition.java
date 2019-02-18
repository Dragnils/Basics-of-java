package ipad;


import objects.Camera;
import objects.Hdd;
import objects.Ram;
import objects.RetinaScreen;

// при композиции мы не зависим от родительской реализации, полностью с нуля конструируем объект
public class IPadComposition {

    private Hdd hdd;
    private Ram ram;
    private RetinaScreen screen;
    private Camera camera;

    public void on() {
        System.out.println("IPad on");
    }

    public void off() {
        System.out.println("IPad off");
    }

    public void swithOnCamera(){
        getCamera().on();
    }

    public void takePhoto() {
        getCamera().splash();
        getCamera().takeFoto();
    }

    public Hdd getHdd() {
        if(hdd==null) hdd = new Hdd(512, "Toshiba");
        return hdd;
    }


    public Ram getRam() {
        if (ram==null) ram = new Ram(2048, "Intel");
        return ram;
    }

    public RetinaScreen getScreen() {
        return screen;
    }

    public Camera getCamera() {
        if (camera == null) {
            camera = new Camera();
        }
        return camera;
    }


}
