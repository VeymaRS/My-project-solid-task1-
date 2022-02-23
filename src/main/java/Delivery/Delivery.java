package Delivery;

import Category.Category;

// Interface segregation principle
public interface Delivery {

    String delivery();

    String getNameDelivery();

    boolean getDeliveryPossibility(int roadDistance, int waitingTime, Category category);
}
