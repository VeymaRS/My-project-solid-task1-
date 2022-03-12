# My project solid task1

#### Магические числа. В любой момен я могу поменять скорости транспортных средств и они не являются константами.
[`DeliveryByCar class`](https://github.com/VeymaRS/My-project-solid-task1-/blob/65d44fb5a9690e2468752dd50b454b7adb9488bb/src/main/java/Delivery/DeliveryByCar.java#L11)
[`DeliveryByDrone class`](https://github.com/VeymaRS/My-project-solid-task1-/blob/65d44fb5a9690e2468752dd50b454b7adb9488bb/src/main/java/Delivery/DeliveryByCar.java#L11)
[`DeliveryCourier class`](https://github.com/VeymaRS/My-project-solid-task1-/blob/65d44fb5a9690e2468752dd50b454b7adb9488bb/src/main/java/Delivery/DeliveryCourier.java#L11)

#### D.R.Y Чтобы многократно не копировать один и тот же код для повторяющегося действия, вынес его в отдельный метод
[`D.R.Y`](https://github.com/VeymaRS/My-project-solid-task1-/blob/65d44fb5a9690e2468752dd50b454b7adb9488bb/src/main/java/Main.java#L15-L18)

#### Interface segregation principle. Несколько интерфейсов (Deliver, Maintenance) выполняют разные функции и для каких-то классов применимы оба (например DeliveryByCar) и имплементированы, а для каких-то (DeliveryCourier) применим только один интерфейс и не нужно требовать от курьера проходить тех. осмотр).
[`Interface segregation principle класс с имплементацией двух интерфейсов`](https://github.com/VeymaRS/My-project-solid-task1-/blob/fa2516e0c8fe590679f687ed95cc472503f8ff90/src/main/java/Delivery/DeliveryByCar.java#L7)
[`Interface segregation principle класс с имплементацией только одно интерфейса`](https://github.com/VeymaRS/My-project-solid-task1-/blob/fa2516e0c8fe590679f687ed95cc472503f8ff90/src/main/java/Delivery/DeliveryCourier.java#L7)

#### Single-responsibility principle. Каджый класс представляющий способ доставки делает только то, для чего он предназначен - доставляет. Клас Basket занимается накоплением и представлением товаров.
[`Basket`](https://github.com/VeymaRS/My-project-solid-task1-/blob/65d44fb5a9690e2468752dd50b454b7adb9488bb/src/main/java/Basket.java#L3)
[`DeliveryCourier`](https://github.com/VeymaRS/My-project-solid-task1-/blob/65d44fb5a9690e2468752dd50b454b7adb9488bb/src/main/java/Delivery/DeliveryCourier.java#L7)
[`DeliveryCourierOnTheEcoTransport`](https://github.com/VeymaRS/My-project-solid-task1-/blob/65d44fb5a9690e2468752dd50b454b7adb9488bb/src/main/java/Delivery/DeliveryCourierOnTheEcoTransport.java#L7)

#### Liskov substitution principle. Класс DeliveryCourierOnTheEcoTransport дополняет класс DeliveryCourier, т.к. доставлять может тот же курьер, но есть возможность делать это быстрее с помощью электротранспорта. Логически он заменяет простого курьера.
[`DeliveryCourierOnTheEcoTransport`](https://github.com/VeymaRS/My-project-solid-task1-/blob/65d44fb5a9690e2468752dd50b454b7adb9488bb/src/main/java/Delivery/DeliveryCourierOnTheEcoTransport.java#L7)

#### Open-closed princip. Возможно легко добавить новые способы доставки благодаря наследованию интерфейса Delivery и перегрузке его метода с учетом новых потребностей. Сам Delivery при этом не меняется.
[`Delivery`] (https://github.com/VeymaRS/My-project-solid-task1-/blob/fa2516e0c8fe590679f687ed95cc472503f8ff90/src/main/java/Delivery/Delivery.java#L6)
[`DeliveryByDrone`] (https://github.com/VeymaRS/My-project-solid-task1-/blob/fa2516e0c8fe590679f687ed95cc472503f8ff90/src/main/java/Delivery/DeliveryByDrone.java#L23-L26)
[`DeliveryByCar`] (https://github.com/VeymaRS/My-project-solid-task1-/blob/fa2516e0c8fe590679f687ed95cc472503f8ff90/src/main/java/Delivery/DeliveryByCar.java#L23-L26)
