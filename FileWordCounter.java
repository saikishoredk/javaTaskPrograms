import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            int wordCount = 0;
            while (fileScanner.hasNext()) {
                fileScanner.next();
                wordCount++;
            }

            System.out.println("Number of words in the file: " + wordCount);

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
// The provided Java code implements a simple file word counter program. Users are prompted to enter the path of a //file, and the program reads the file to count the number of words within it. The code uses a Scanner object to //read the file and a loop to iterate through each word, incrementing a counter for each encountered word. //Finally, the program displays the total word count. This program offers a straightforward solution for quickly //determining the number of words in a given file, making it useful for various text analysis or processing tasks.




