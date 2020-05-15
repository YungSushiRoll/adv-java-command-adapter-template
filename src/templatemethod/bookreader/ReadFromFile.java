package templatemethod.bookreader;

import java.io.*;

public class ReadFromFile extends BookReader {

    private File file = new File("prideprejudice.txt");
    private BufferedReader reader;

    @Override
    void initialize() {
        // Modify this method to open the file prideprejudice.txt (included with project)
        System.out.println("Open an input file");
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }

    }

    @Override
    void startReading() {
        // Modify this method to read lines from the file and print each line to standard output
        System.out.println("Loop writing out each record");
        try {
            String text;
            while ((text = reader.readLine()) != null)
            {
                System.out.println(text);
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    void stopReading() {
        // Modify this method to close the file
        try
        {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Close input file");
    }
}
