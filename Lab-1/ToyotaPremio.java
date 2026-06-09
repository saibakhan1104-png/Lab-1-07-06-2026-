 class ToyotaPremio extends Toyota {
    protected String BodyType;
    ToyotaPremio(String color,String model,String MadeIn,int MadeYear,String BodyType) {
        super(color, model, MadeIn, MadeYear);
        this.BodyType = BodyType;
        System.out.println("Toyota Premio Constructor called.");
    }

     @Override
     public void CarType() {
         System.out.println("Car Type:Toyota Premio.");
     }

     @Override
     public void Status() {
         System.out.println("Car Status:Toyota Premio Running.");
     }
 }
