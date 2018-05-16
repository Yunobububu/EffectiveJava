package Chapter2;

public class Singlton1 {
    private Singlton1(){}
    private static Singlton1 singlton1 = new Singlton1();
    public static Singlton1 getInstance(){ return singlton1;}
}
