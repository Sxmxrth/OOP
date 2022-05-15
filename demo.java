public class demo {
    public static void main(String[] args) {
        cars audi=new cars();
//        cars tesla=new cars();
        audi.color="red";
        audi.numberPlate=9820;
        audi.price=10000;

        System.out.println(audi.color);
        System.out.println(audi.numberPlate);
        System.out.println(audi.price);
    }
}
class cars{
    String color;
    int numberPlate;
    float price;
}
