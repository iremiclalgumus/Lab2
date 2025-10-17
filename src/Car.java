enum FuelType{GASOLINE,DIESEL,ELECTRIC}
public class Car {
    String brand;
    String model;
    int year;
    Engine engine;
    Car(String brand,String model, int year,Engine engine, FuelType fuelType)
        this.model=model;
        this.brand=brand;


    public String getBrand() {

    }

    public void displayInfo(){
        System.out.println("Brand:"+brand+"");
        engine.showPower();
        switch(fuelType){
            case GASOLINE: System.out.println("GASOLINE Traditional engine"); break;
            case DIESEL:System.out.println(""); break;
            case ELECTRIC:System.out.println("ELECTRIC Eco-friendly"); break;
        }


    }
   public static void main(String[]args){

        Car c1= new Car(brand:"Mercedes",model:"Benz",year:2020,engine1,FuelType.DIESEL);
        c1.brand="Mercedes";
        c1.model="Benz";
        c1.year=2020;
        c1.displayInfo();
   }
}
