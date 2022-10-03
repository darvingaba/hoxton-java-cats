import java.lang.reflect.Array;

public class Owner {
    public String name;
    public Cat[] cats;

    public Owner (String name,Cat[] cats){
        this.name = name;
        this.cats = cats;   
    }
    void displayInfo(){
        for (Cat cat:cats){
            String catsName = cat.name;
        }

        System.out.printf("This is %s  and has these cats: %catsName !\n", this.name);
    }
}