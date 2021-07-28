public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 99.9;
        double growth = 1.99;
        double bmi = service.calculate(weight, growth);
        System.out.printf("ИМТ: %.1f", bmi);
    }

}
