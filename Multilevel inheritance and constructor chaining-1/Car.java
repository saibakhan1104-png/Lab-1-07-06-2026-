public class Car {
    protected String color;
    protected String model;
    Car(String color,String model){
        this.color=color;
        this.model=model;
        System.out.println("Car constructor called.");
    }
    public void CarType(){
        System.out.println("Car Type: Generic.");
    }
    public void Status(){
        System.out.println("Car Status.");
    }
}
