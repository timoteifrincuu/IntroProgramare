import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Program {
    public static void main(String[] args) {
        try {
           	BufferedReader reader = new BufferedReader(new FileReader("numere.dat"));
            BufferedReader reader2 = new BufferedReader(new FileReader("intervale.dat"));
            FileWriter writer = new FileWriter("statistica.dat");
            String line = reader.readLine();
            String line2 = reader2.readLine();

            writer.close();
			reader.close();
            reader2.close();
        } catch (Exception e) {
            System.out.println("Fisierul a fost deja furnizat.");
        }
    }
}

