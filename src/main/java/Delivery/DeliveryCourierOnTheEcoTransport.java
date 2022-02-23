package Delivery;

import Category.Category;

//Single-responsibility principle
//Liskov substitution principle
public class DeliveryCourierOnTheEcoTransport extends DeliveryCourier implements Delivery {

    private String nameDelivery = "CourierDelivery on the eco transport";
    protected String typeVehicle;

    public DeliveryCourierOnTheEcoTransport(String nameCourier, int speed, String typeVehicle) {
        super(nameCourier, speed);
        this.typeVehicle = typeVehicle;
    }

    @Override
    public String getNameDelivery() {
        return nameDelivery;
    }

    @Override
    public String delivery() {
        String humanSay = "Hi! I will deliver your order in an eco-friendly mode of transport.";
        return humanSay;
    }

    @Override
    public boolean getDeliveryPossibility(int roadDistance, int waitingTime, Category category) {
        boolean possibility = false;
        if(!category.equals(Category.LARGE_HOME_APPLIANCES) && !category.equals(Category.TELEVISIONS)) {
            if (waitingTime >= roadDistance / speed) {
                possibility = true;
            }
        }
        return possibility;
    }
}
