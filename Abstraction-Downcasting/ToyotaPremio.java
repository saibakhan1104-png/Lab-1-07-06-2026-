class ToyotaPremio extends Toyota {
    private String BodyType;
    ToyotaPremio(String color,String model,String MadeIn,int MadeYear,String BodyType) {
        super(color, model, MadeIn, MadeYear);
        this.BodyType = BodyType;
        System.out.println("Toyota Premio Constructor called.");
    }

    @Override
   void CarType() {
        System.out.println("Car Type:Toyota Premio.");
    }

    @Override
    void Status() {
        System.out.println("Car Status:Toyota Premio Running.");
    }

    public String getBodyType(){
        return BodyType;
    }
}
