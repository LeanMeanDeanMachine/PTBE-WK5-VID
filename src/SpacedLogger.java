public class SpacedLogger implements Logger {

    private String spaceOut(String message) {
        return String.join(" ", message.split(""));
    }

    public void log(String message) {
        System.out.println(spaceOut(message));
    }

    public void error(String message) {
        System.out.println("ERROR: " + spaceOut(message));
    }
}
