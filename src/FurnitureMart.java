public class FurnitureMart {

    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String colour;
    String furnitureUsage;
    double price;

    FurnitureMart() {

        int furnitureCode = 5342;
        String furnitureType = "Table";
        String gradeOfFurniture = "grade1";
        String colour = "green";
        String furnitureUsage = "outdoor";
        double price = 300.0;
    }

    public double FurnitureItem() {
        double discount = 5.0;
        if (furnitureUsage.equals("outdoor"))
            price = price - (price * discount / 100);
        return price;
    }
}
