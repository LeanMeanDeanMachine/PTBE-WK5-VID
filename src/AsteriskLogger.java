public class AsteriskLogger implements Logger {
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    public void error(String message) {

        String error = "***Error: " + message + "***";
        String border = new String(new char[error.length()]).replace("\0", "*");

        System.out.println(border);
        System.out.println(error);
        System.out.println(border);

    }
}
