import java.io.BufferedWriter;
import java.io.IOException;

public class Interval {
    private Double min;
    private Double max;
    private int nrTestate;
    private int nrContinute;

    public Interval(Double min, Double max){
        this.max = max;
        this.min = min;
        this.nrContinute = 0;
        this.nrTestate = 0;     
    }

    public void metodaTestare(Double nr){
        nrTestate++;
        if(nr>=min && nr<=max)
            nrContinute++;
    }

    public double procent(){
        return (double) nrContinute/nrTestate *100;
    }

    public void afisare(BufferedWriter writer) throws IOException {
        writer.write("[ " + min + " , " + max +" ] " + procent() + "%" + "\n");
    }
}
