package app.model;

public class AppModel {

    public String getResult(String color) {
        String result = "The entered color is not present on the traffic light";
        if (isValidColor(color)) {
            switch (Color.valueOf(color)) {
                case RED ->
                        result = "Driver, you need to stop!";
                case YELLOW ->
                        result = "Driver, you should get ready.";
                case GREEN ->
                        result = "Driver, you can start driving.";
            }
        }
        return result;
    }

    private boolean isValidColor(String color) {
        try {
            Color.valueOf(color);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    enum Color {
        RED, YELLOW, GREEN
    }
}
