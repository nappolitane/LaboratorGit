import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

import java.lang.StringBuilder;

public class Exercitiu6 {
    private static void findEveryRegex(String line, String pattern)
    {
        // String to be scanned to find the pattern.
        System.out.println(line);

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);

        int counter = 0;
        while (m.find( )) {
            System.out.println("Found value: " + m.group());
            counter++;
        }
        if(counter==0)
            System.out.println("NO MATCH");
    }

    public static void run(String fName)
    {
        try {
            File fObj = new File(fName);
            Scanner myReader = new Scanner(fObj);
            StringBuilder builder = new StringBuilder();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                builder.append(data).append("\n");
            }
            myReader.close();

            if(builder.length() > 0) {
                builder.deleteCharAt(builder.length() - 1);
                System.out.println("File: '" + fObj.getName() + "', Length: " + builder.length());
                findEveryRegex(builder.toString(), "(\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b)");
            }
            else System.out.println("The file: '" + fObj.getName() + "' was empty.");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
