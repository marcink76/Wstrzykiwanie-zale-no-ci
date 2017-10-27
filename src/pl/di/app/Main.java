package pl.di.app;

public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader();
        Messager messager = new Messager();
        Inputer inputer = new Inputer();

        PrintMessage printMessage = new PrintMessage(reader, messager, inputer);
        printMessage.printMessage();
    }
}