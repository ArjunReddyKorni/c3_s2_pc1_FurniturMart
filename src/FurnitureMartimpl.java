import java.util.Scanner;

public class FurnitureMartimpl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FurnitureMart object = new FurnitureMart();


        System.out.println("Please select the type of the furniture,1.Tables,2.chairs,3.cupboards,4.stools");
        object.furnitureType = scanner.nextLine();
        System.out.println("please select the grade of the furniture,1.Grade1,2.Grade2,3.Grde3");
        object.gradeOfFurniture = scanner.nextLine();
        System.out.println("please select the colour of the furniture,1.red,2.blue,3.green");
        object.colour = scanner.nextLine();
        System.out.println("please select the usage of the furniture,1.indoor,2.outddor");
        object.furnitureUsage = scanner.nextLine();
        System.out.println("please enter the price of the product");
        object.price = scanner.nextDouble();

        double price = object.FurnitureItem();
        System.out.println("price = " + price);

    }
}
