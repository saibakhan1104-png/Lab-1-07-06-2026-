class Toyota extends Car {
    protected String MadeIn;
    protected int MadeYear;
    Toyota(String color,String model,String MadeIn,int MadeYear){
        super(color,model);
        this.MadeIn=MadeIn;
        this.MadeYear=MadeYear;
        System.out.println("Toyota Constructor called.");
    }

    @Override
   void CarType() {
        System.out.println("Car Type:Toyota.");
    }

    @Override
    void Status() {
        System.out.println("Car Status:Running.");
    }
}
