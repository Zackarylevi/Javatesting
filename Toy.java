
    // Class -----------------------------------------------//
    public class Toy {
   // Attributes (Fields / Instance Variables)-------------//
    String name;
    String brand;
    double price;
    int quality;

    // Method ----------------------------------------------//
    void setPrice(double price){
        this.price = price;
    }
    // Main Method-----------------------------------------//
    public static void main(String[] args) {

    // Object---------------------------------------------//

        Toy toy1 = new Toy();
        toy1.name = "Rare Pink";
        toy1.brand = "Hironi";
        toy1.price = 150;
        toy1.quality = 15;
        toy1.setPrice((toy1.price*0.5));
        System.out.println(toy1.price);

    
    }
}
