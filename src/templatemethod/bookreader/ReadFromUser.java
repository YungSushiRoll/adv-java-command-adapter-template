package templatemethod.bookreader;

import java.util.Scanner;

public class ReadFromUser extends BookReader {

    private Scanner keyboard = new Scanner(System.in);
    private String story;

    @Override
    void initialize() {
        System.out.println("\n\nYour carrier as a writer begins now,\n" +
                "what are your first words?");
        story = keyboard.nextLine();
    }

    @Override
    void startReading() {
        System.out.println("That is such a great start, this is what you wrote.\n");
        System.out.println("\"" + story + "\"");

    }

    @Override
    void stopReading() {

    }
}
