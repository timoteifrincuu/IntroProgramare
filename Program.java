import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Interval> intervale = new ArrayList<>();
        
        try {
            BufferedReader reader2 = new BufferedReader(new FileReader("intervale.dat"));
            String linieIntervale = "";
            while((linieIntervale = reader2.readLine()) != null){
                linieIntervale = linieIntervale.replaceAll("[\\[\\]]", "");
                String[] minMax = linieIntervale.split(",");
                double min = Double.parseDouble(minMax[0]);
                double max = Double.parseDouble(minMax[1]);
                Interval interval = new Interval(min, max);
                intervale.add(interval);
            }
            reader2.close();

           	BufferedReader reader = new BufferedReader(new FileReader("numere.dat"));
            String linieNumere = "";
            HashSet<Double> listaNr = new HashSet<Double>(); 
            while((linieNumere = reader.readLine()) != null){
                String[] numere = linieNumere.split("\\s+");
                for(String numereString : numere){
                    Double nrDouble = Double.parseDouble(numereString);
                    if(listaNr.contains(nrDouble)){
                        System.out.println(nrDouble+" deja apartine listei de nr.");
                    }
                    else{
                        listaNr.add(nrDouble);
                        for(Interval numInterval : intervale){
                            numInterval.metodaTestare(nrDouble);
                        }
                    }
                }
            }    
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("statistica.dat"));
            for(Interval numInterval : intervale){
                numInterval.afisare(writer);
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("Eroare");
        }
    }
}

