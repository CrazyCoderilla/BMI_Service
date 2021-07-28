public class BmiService {
    public static double calculate(double weight, double growth) {
        return weight / (growth * growth);
    }
}
