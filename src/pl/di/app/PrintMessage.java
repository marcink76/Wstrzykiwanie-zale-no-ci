package pl.di.app;

public class PrintMessage {
    private Reader reader;
    private Messager messager;
    private Inputer inputer;

    //Wstrzykiwanie przez konstruktor.
    public PrintMessage(Reader reader, Messager messager, Inputer inputer) {
        this.reader = reader;
        this.messager = messager;
        this.inputer = inputer;
    }

    public void printMessage(){
        //Jak zmienimy instancję messager na reader/inputer wywołamy metody z powyższych klas
        System.out.println(messager.makeMessage());
    }
}