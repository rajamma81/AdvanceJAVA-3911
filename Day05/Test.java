package Day05;

class Car{
    private String name;
    private int cost;
    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name=name;
    }
    public int getCost(){
        return cost;
    }
    public  void setCost(int cost) {
        this.cost = cost;
    }
    public Car(String name,int cost) {
        super();
        this.name=name;
        this.cost=cost;

    }
    public Car(){
        super();
    }
}

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getName());
        System.out.println(c.getCost());

        Car c1= new Car("Ferrari",5000000);
        System.out.println(c1.getName());
        System.out.println(c1.getCost());


    }
    
    
}
