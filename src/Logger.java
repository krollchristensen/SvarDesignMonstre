public class Logger {
    private static Logger instance;
    private Logger() {
        // Privat konstruktør for at forhindre ekstern instantiering
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message); // Dette skal ændres til filskrivning i en reel applikation
    }
}
