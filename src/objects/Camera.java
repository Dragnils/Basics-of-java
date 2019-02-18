package objects;

public class Camera extends ElectronicDevice {

    public void recordVideo(){
        print("recording video...");
    }

    public void takeFoto(){
        print("foto");
    }

    public void splash(){
        print("splashing");
    }

    @Override
    public void on() {
        print("Camera initializing...");
    }

    @Override
    public void off() {
        print("Camera off.");
    }
}
