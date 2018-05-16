package Chapter2;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){}
    private static LazySingleton getLazySingleton(){
        if (lazySingleton == null){
            return new LazySingleton();
        }
        return lazySingleton;
    }

}
