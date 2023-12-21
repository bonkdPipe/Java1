public class Ball {
    private String name;
    private int age;
    public Ball(String n, int a){
        name = n;
        age = a;
    }
    public Ball(String n){
        name = n;
        age = 0;
    }
    public Ball(){
        name = "le ball";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println("I don't even know anymore, why would you need to know the age of an ordinary ball, but if you really wish to know the age of book that goes by the name of " + name + ", well it's" + age + " years old");
    }
}
