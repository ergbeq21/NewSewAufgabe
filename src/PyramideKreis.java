public class PyramideKreis extends Pyramide{
    private double radius;
    private double pie;
    public PyramideKreis(double hoehe,double radius, double pie){
        super(hoehe);
        this.radius = radius;
        this.pie = pie;
    }

    @Override
    public double volumen() {
        return (((radius*radius*pie))*getHoehe())/3;
    }


}
