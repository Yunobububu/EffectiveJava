package Chapter2;
//Initialization on Demand Holder,利用内部类的线程安全来包装单列模式的线程安全
public class SingletonHolder {
    private SingletonHolder(){}
    private static class Holder{
        public static SingletonHolder singletonHolder = new SingletonHolder();
    }
    public SingletonHolder getInstance(){
        return Holder.singletonHolder;
    }
}
