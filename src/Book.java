public class Book {
    private String name;
    private int age;
    public Book(String n, int a){
        name = n;
        age = a;
    }
    public Book(String n){
        name = n;
        age = 0;
    }
    public Book(){
        name = "BookyBookBookZeSecond";
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
        System.out.println("Books are not biological so there is no need to convert a book's lifespan into a human one , but if you really wish to know the age of book that goes by the name of " + name + ", well it's "+ age + " old ");
    }
}
