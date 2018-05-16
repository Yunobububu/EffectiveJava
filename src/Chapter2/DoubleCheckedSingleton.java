package Chapter2;
//double check lock
public class DoubleCheckedSingleton {
    private static DoubleCheckedSingleton dcs = null;
    private DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getSingleton(){
        if(dcs == null){
            synchronized (DoubleCheckedSingleton.class){
                if(dcs == null){
                    dcs = new DoubleCheckedSingleton();
                }
            }
        }
        return dcs;
    }
}
