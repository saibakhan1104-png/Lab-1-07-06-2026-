public class Main{
    public static void main(String [] args){
        ToyotaPremio c= new ToyotaPremio("White","Premio G X","Japan",2024,"Sedan");
        System.out.println("--Car information--");
        c.CarType();

        System.out.println("Colour of the car :"+c.color);
        System.out.println("Model of the car :"+c.model);
        System.out.println("Made in :"+c.MadeIn);
        System.out.println("Made year :"+c.MadeYear);
        System.out.println("Body Type :"+c.BodyType);
        c.Status();
    }
}