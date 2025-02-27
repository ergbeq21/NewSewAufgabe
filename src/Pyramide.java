public abstract class Pyramide {
    private double hoehe;
    public Pyramide(double hoehe){
        this.hoehe = hoehe;
    }

    public double getHoehe(){
        return hoehe;
    }
    public abstract double volumen();


    public abstract double calcoberflaechen();



}
