public class VehicleFactory {
    public Vehicle getVehicle(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (type.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }
}