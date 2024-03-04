public class Main {
    public String name = "yoshie";
    public int age = 5;
    public double weight = 4.6;
    public String favoriteplace = "Kitchen";
    public String allergy = "Cold";

    public void getName() {
        System.out.println("My dog name is " + name);
    }
    public void getAge() {
        System.out.println("My dog age is " + age);
    }
    public void getWeight() {
        System.out.println("My dog weight is " + weight);
    }
    public void getFavoriteplace() {
        System.out.println("My dog favorite place is " + favoriteplace);
    }
    public void getAllergy() {
        System.out.println("My dog allergy is " + allergy);
    }
    public static void main(String[] args) {
        Main dog = new Main();
        dog.getName();
        dog.getAge();
        dog.getWeight();
        dog.getFavoriteplace();
        dog.getAllergy();
    }
}