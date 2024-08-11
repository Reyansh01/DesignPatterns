package SingletonDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        Single single = Single.getInstance("Reyansh", 23);
        System.out.println("Name: " + single.getName() + " Age: " + single.getAge());
        Single single2 = Single.getInstance("Friend", 25);
        System.out.println("Name: " + single2.getName() + " Age: " + single2.getAge());
    }

}
