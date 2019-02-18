package objects;

public abstract class Planshet extends Computer {

    private RetinaScreen screen;
    private Camera camera;

    public Planshet(String name) {
        super(name);
    }

    public Planshet(String name, double weight) {
        super(name, weight);
    }

    public abstract void navigateByScreen();

    @Override
    public void load() {
        print("Planshet load");
    }

    @Override
    public void on() {
        print("Planshet on");
    }

    @Override
    public void off() {
        print("Planshet off");
    }

    public void takePhoto(){
        getCamera().takeFoto();
    }

    public Camera getCamera(){
        if(camera == null) camera =new Camera();
        return camera;
    }

    public RetinaScreen getScreen(){
        if(screen == null) screen = new RetinaScreen();
        return screen;
    }
}
