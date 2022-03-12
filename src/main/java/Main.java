import Category.Category;
import Delivery.Delivery;
import Delivery.DeliveryByDrone;
import Delivery.DeliveryCourier;
import Delivery.DeliveryCourierOnTheEcoTransport;
import Delivery.DeliveryByCar;

import java.util.*;

public class Main {
    static Integer position;

    //D.R.Y

    public static void addProduct(String name, Manufacture manufacture, int manufactureDate, Category category, Map<Integer, Product> productList) {
        productList.put(position, new Product(name, manufacture, manufactureDate, category));
        position++;
    }

    static void productListIterator(Map<Integer, Product> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Integer, Product> entry : list.entrySet()) {
            stringBuilder
                    .append(entry.getKey())
                    .append(" ")
                    .append(entry.getValue().toString())
                    .append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Delivery> deliveries = new ArrayList<>();
        Map<Integer, Product> productList = new HashMap<>();
        Basket basket = new Basket();

        //Magic numbers

        position = 1;
        int roadDistance;
        int waitingTime;

        Manufacture bosch = new Manufacture("Bosch", "Germany", 1886);
        Manufacture siemens = new Manufacture("Siemens", "Germany", 1847);
        Manufacture jbl = new Manufacture("JBL", "USA", 1946);
        Manufacture samsung = new Manufacture("Samsung Group", "The Republic of Korea", 1938);

        addProduct("Washing Machine", bosch, 2022, Category.LARGE_HOME_APPLIANCES, productList);
        addProduct("Mixer", siemens, 2021, Category.SMALL_KITCHEN, productList);
        addProduct("Mobile phone", samsung, 2021, Category.SMARTPHONES, productList);
        addProduct("Television 55", samsung, 2021, Category.TELEVISIONS, productList);
        addProduct("Notebook", samsung, 2020, Category.LAPTOPS, productList);

        deliveries.add(new DeliveryByDrone("Phantom", 30));
        deliveries.add(new DeliveryCourier("Maxim", 5));
        deliveries.add(new DeliveryCourierOnTheEcoTransport("Denis", 20, "ElectroScooter", 20));
        deliveries.add(new DeliveryByCar("Mercedes", 60));

        System.out.println("Hello, dear friend! We are pleased to introduce the following products:" + "\n");
        productListIterator(productList);
        System.out.println("What are you interested in? (input number of order position or 'q' for exit)");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            } else {
                int inputParse = Integer.parseInt(input);
                if (productList.containsKey(inputParse)) {
                    basket.addProduct(productList.get(inputParse));
                    System.out.println("Something else? (input number of order position or 'q' for exit)");
                } else {
                    System.out.println("Order number is incorrect");
                }
            }
        }
        System.out.println("\n" + "Your basket:" + "\n");
        basket.printListIterator();
        System.out.println("\n" + "Do you want to order delivery? Input 'Y' or 'N'");
        String inputOrder = scanner.nextLine();
        if (inputOrder.equals("Y") || inputOrder.equals("y")) {
            System.out.println("how far do you live? (km)");
            roadDistance = scanner.nextInt();
            System.out.println("How long can you wait for delivery (hour)?");
            waitingTime = scanner.nextInt();
            System.out.println("\n" + "For your order, you can choose the following types of delivery" + "\n");
            for (Product product : basket.basketList) {
                System.out.println("\n" + product.name + "\n");
                for (int i = 0; i < deliveries.size(); i++) {
                    System.out.println(deliveries.get(i).getNameDelivery() + " - " +
                            deliveries.get(i).getDeliveryPossibility(roadDistance, waitingTime, product.getCategory()));
                }
            }
        } else if (inputOrder.equals("N") || inputOrder.equals("n")) {
            System.out.println("Thanks for the orders.");
        } else {
            System.out.println("Incorrect input");
        }
    }
}
