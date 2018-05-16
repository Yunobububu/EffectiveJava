package Chapter2;

public class SingletonWithLock {
    private static SingletonWithLock singletonWithLock = null;
    private SingletonWithLock(){}
    private synchronized static SingletonWithLock getSingletonWithLock(){
        if(singletonWithLock ==null){
            singletonWithLock =  new SingletonWithLock();
        }
        return singletonWithLock;
    }
}
