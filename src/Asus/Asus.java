package Asus;

 import objects.Notebook;

public abstract class Asus extends Notebook {

    // нельзя создать экземпляр класса, т.к. protected
    // вызывающий класс Main дожен находится в другом пакете
    protected Asus(String name) {
        super(name, false);
    }

    //все асусы будут печатать приветственное сообщение(можно при загрузке)
    public void printStartScreen(){
        print("Asus company. All right reserved.");
    }
}
