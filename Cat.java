

public class Cat {
    public String name;
    public Number age;
    public Boolean likesCuddles;
    public int cat2;

    public Cat (String name,Number age,Boolean likesCuddles){
        this.name = name;
        this.age=age;
        this.likesCuddles=likesCuddles;
    }
    void displayInfo (){
        if(this.likesCuddles){
            System.out.printf("This is %s, who is %s year(s) old. %s likes cuddles !\n", this.name,
        this.age,this.name);
        }else{
            System.out.printf("This is %s, who is %s year(s) old. %s doesn't likes cuddles !\n", this.name,
        this.age,this.name);
        }   
    }
}