public class quadratPyramide  extends Pyramide{

    private double seite;

    public quadratPyramide(double seite, double hoehe) {
        super(hoehe);
        this.seite = seite;
    }


    @Override
    public double volumen() {
        return (1.0 / 3.0) * (seite * seite) * getHoehe();
    }

    public double getSeite() {
        return seite;
    }

}

