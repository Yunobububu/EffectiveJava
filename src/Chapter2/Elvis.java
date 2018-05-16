package Chapter2;

public class Elvis {
    private static Elvis ourInstance = new Elvis();

    public static Elvis getInstance() {
        return ourInstance;
    }

    private Elvis() {
    }
}
