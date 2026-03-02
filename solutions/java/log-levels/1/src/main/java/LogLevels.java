public class LogLevels {
    
    public static String message(String logLine) {
        String[] strings = logLine.split("]: ", 2);
        return strings[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] strings = logLine.split("[\\[\\]]");
        return strings[1].toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);

        return message + " (" + level + ")";
    }
}
