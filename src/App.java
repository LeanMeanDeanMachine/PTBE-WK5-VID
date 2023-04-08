
public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        asteriskLogger.log("Dean Dean Dean");
        asteriskLogger.error("Do what you wanna🎶");

        spacedLogger.log("Guess What?");
        spacedLogger.error("Chicken Butt!");
    }
}
