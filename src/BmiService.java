public class BmiService {

    public double calculate(double masses, double height) {
        double squaredHeight = height * height;
        double bodyMassIndex = masses / squaredHeight;
        return bodyMassIndex;
    }
}
