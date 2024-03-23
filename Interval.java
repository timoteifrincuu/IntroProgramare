public class Interval {
    private Double min;
    private Double max;
    private int nrTestate = 0;
    private int nrContinute = 0;

    public Interval(Double max, Double min){
        this.max = max;
        this.min = min;
        this.nrContinute = nrContinute;
        this.nrTestate = nrTestate;     
    }

    public void metodaTestare(Double nr){
        nrTestate++;
        if(nr>=min && nr<=max)
            nrContinute++;
    }

    public void afisare(){
        System.out.println("Intervalul: " + " cu procentul obtinut: ");
    }
}
