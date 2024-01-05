package com.madushan.exercise;

public class LogLevels {

    public static String message(String logLine) {
        // Split the log line into parts using ":" as a delimiter
        String[] parts = logLine.split(":", 2);

        // Extract the message part and remove leading/trailing white space
        String message = parts[1].trim();

        return message;
    }

    public static String logLevel(String logLine) {
        // Split the log line into parts using ":" as a delimiter
        String[] parts = logLine.split(":", 2);

        // Extract the message part and remove leading/trailing white space
        String message = parts[0].trim().replace("[", "").replace("]", "");

        return message.toLowerCase();
    }

    public static String reformat(String logLine) {
        // Split the log line into parts using ":" as a delimiter
        String[] parts = logLine.split(":", 2);

        // Extract the message part and remove leading/trailing white space
        String level = parts[0].trim();
        String message = parts[1].trim();

        return message + " ("+level.toLowerCase().replace("[", "").replace("]", "")+")";
    }
}
