public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Myindex = service.calculate(70, 1.70);
        System.out.println();
        System.out.println("Нормой является : 18,5-24,99");
        System.out.println();
        System.out.println("Ваш индекс массы тела:" + Myindex);
    }
}
