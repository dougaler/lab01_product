import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductWriter {
    public static void main(String[] args) throws IOException {
        ArrayList<String> Persondata = new ArrayList<>();
        ArrayList<String> product0data = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String IDnum = " ";
        String name = " ";
        String description = " ";
        double cost = 0;
        boolean done = false;
        System.out.println("Enter the following information when prompted: ID #, First Name, Last Name, Title, Year of Birth");
        do{
            IDnum = SafeInput.getNonZeroLenString(in,"Enter 6 digit ID number");
            name = SafeInput.getNonZeroLenString(in,"Enter name");
            description = SafeInput.getNonZeroLenString(in,"Enter description");
            cost = SafeInput.getDouble(in,"Enter cost");
            product0data.add(new Product(name, description, IDnum, cost).toCSVRecord());
            done = SafeInput.getYNConfirm(in,"Would you like to end? Enter Y to quit. Enter N to add another");

        }while(!done);
        System.out.println(product0data);
        Path path = Paths.get("C:\\Users\\legol\\IdeaProjects\\lab01_product\\src\\ProductTestData.txt");
        //create file
        try {
            Path createdFilePath = Files.createFile(path);
            System.out.println("Created a file at : "+createdFilePath);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Files.write(path, product0data);
    }
}