public abstract class Pyramide {
    private double hoehe;
    public Pyramide(double hoehe){
        this.hoehe = hoehe;
    }

    public abstract double volumen();
    public double getHoehe(){
        return hoehe;
    }

}
