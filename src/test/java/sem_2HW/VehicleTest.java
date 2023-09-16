package sem_2HW;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleTest {

    @Test //  - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    public void carIsInstanceofVehicle() {
        Car car = new Car("Land Rover", "Range Rover Sport", 2023);
        assertEquals(car.getClass().getSuperclass().getTypeName(), Vehicle.class.getName());
    }

    @Test //  - проверка того, объект Car создается с 4-мя колесами
    public void carHasFourWheels() {
        Car car = new Car("Land Rover", "Range Rover Sport", 2023);
        assertEquals(car.getNumWheels(), 4);
    }

    @Test //  - проверка того, объект Motorcycle создается с 2-мя колесами
    public void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Nightster Special", 2023);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test //  - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    public void carReachesSpeedOfSixtyInTestDribenMode () {
        Car car = new Car("Land Rover", "Range Rover Sport", 2023);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test //  - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    public void motorcycleReachesSpeedOfSeventyFiveInTestDribenMode () {
        Motorcycle motorcycle = new Motorcycle("Land Rover", "Range Rover Sport", 2023);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }
    @Test //  - проверка, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    public void isCarStopped () {
        Car car = new Car("Land Rover", "Range Rover Sport", 2023);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test //  - проверка, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    public void isMotorcycleStopped () {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Nightster Special", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}
