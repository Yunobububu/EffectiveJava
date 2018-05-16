package Chapter2;

public class EagerSingleton {
    private EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    private EagerSingleton getInstance(){
        return instance;
    }
}
