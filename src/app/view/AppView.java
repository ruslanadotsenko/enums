package app.view;

import java.util.Scanner;
import java.util.Locale;

public class AppView {

    Scanner scanner = new Scanner(System.in);

    public String getData() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter one of the colors (RED, YELLOW, GREEN): ");
        return scanner.nextLine().trim().toUpperCase();
    }

    public void getOutput(String output) {
        scanner.close();
        System.out.println(output);

    }
}
