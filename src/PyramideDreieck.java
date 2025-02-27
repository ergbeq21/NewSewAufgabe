public class PyramideDreieck extends Pyramide{
    private double basis;
    public PyramideDreieck(double hoehe, double basis) {
        super(hoehe);
        this.basis = basis;
    }

    @Override
    public double volumen() {
        return (((getHoehe()*basis)/2)*getHoehe())/3;
    }
}
