import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Juno", 2, false);
        Cat cat2 = new Cat("Poppy", 4, true);
        cat1.displayInfo();
        cat2.displayInfo();

        Cat[] cats = {cat1,cat2};
        Owner owner1 = new Owner("Jef", cats);
        owner1.displayInfo();
    }
}
