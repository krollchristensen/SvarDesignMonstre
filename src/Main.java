public class Main {
    public static void main(String[] args) {

        // Singleton mønster demonstration
        Logger logger = Logger.getInstance();
        logger.log("Dette er en logmeddelelse fra Singleton logger.");

        // Repository mønster demonstration
        StudentRepository repository = new SimpleStudentRepository();
        repository.add(new Student(1, "Peter"));
        repository.add(new Student(2, "Anna"));
        System.out.println("Studerende hentet med ID 1: " + repository.get(1).getName());
        System.out.println("Alle studerende:");
        for (Student student : repository.getAll()) {
            System.out.println("ID: " + student.getId() + ", Navn: " + student.getName());
        }

        // Factory mønster demonstration
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle("car");
        Vehicle bike = vehicleFactory.getVehicle("bike");
        System.out.println("Producing vehicles:");
        car.create();
        bike.create();
    }
}