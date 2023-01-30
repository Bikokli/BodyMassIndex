public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 74;
        double h = 1.72;
        double bodyIndex = service.calculate(m,h);

        System.out.println("Следовательно, индекс массы тела равен:");
        System.out.println(bodyIndex);


    }

}