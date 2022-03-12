package Delivery;

import Category.Category;

//Single-responsibility principle
//Liskov substitution principle
public class DeliveryCourierOnTheEcoTransport extends DeliveryCourier implements Delivery, Maintenance {

    private String nameDelivery = "CourierDelivery on the eco transport";
    protected String typeVehicle;
    protected int powerDistance;

    public DeliveryCourierOnTheEcoTransport(String nameCourier, int speed, String typeVehicle, int powerDistance) {
        super(nameCourier, speed);
        this.typeVehicle = typeVehicle;
        this.powerDistance = powerDistance;
    }

    @Override
    public String getNameDelivery() {
        return nameDelivery;
    }

    @Override
    public String delivery() {
        return "Hi! I will deliver your order in an eco-friendly mode of transport.";
    }

    @Override
    public boolean getDeliveryPossibility(int roadDistance, int waitingTime, Category category) {
        boolean possibility = false;
        if(!category.equals(Category.LARGE_HOME_APPLIANCES) && !category.equals(Category.TELEVISIONS) && checkMaintanance()) {
            if (waitingTime >= roadDistance / speed & roadDistance <= powerDistance / 2) {
                possibility = true;
            }
        }
        return possibility;
    }

    @Override
    public boolean checkMaintanance() {
        return true;
    }
}
