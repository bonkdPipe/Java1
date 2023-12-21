public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Mike's adventure towards a better future", 2);
        Book d2 = new Book("mark v tank", 7);
        Book d3 = new Book("Benelovent bank is the biggest bank in the histore of america..."); d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
