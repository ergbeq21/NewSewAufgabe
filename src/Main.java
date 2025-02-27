public class Main {
    public static void main(String[] args) {
        double seite = 5.0;
        double hoehe = 10.0;

        quadratPyramide meinePyramide = new quadratPyramide(seite, hoehe);

        double volumen = meinePyramide.volumen();
        System.out.println("Das Volumen der quadratischen Pyramide beträgt: " + volumen);

        System.out.println("Seitenlänge der Basis: " + meinePyramide.getSeite());
        System.out.println("Höhe der Pyramide: " + meinePyramide.getHoehe());
    }
}