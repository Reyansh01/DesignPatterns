package SingletonDesignPattern;

public class Single {
    
    private static Single single;

    private String name;
    private int age;

    private Single(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Single getInstance(String name, int age) {
        if(single == null) {
            single = new Single(name, age);
        }
        return single;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
