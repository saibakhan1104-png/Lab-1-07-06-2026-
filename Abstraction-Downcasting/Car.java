abstract class Car {
    protected String color;
    protected String model;
    Car(String color,String model){
        this.color=color;
        this.model=model;
        System.out.println("Car constructor called.");
    }
   abstract void CarType();
   abstract void Status();
}
