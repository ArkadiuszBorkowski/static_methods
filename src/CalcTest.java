class CalcTest {
    public static void main(String[] args) {
        //Calculator calculator = new Calculator();

        double r = 10;

        System.out.println("Pole koła: "  + Calculator.circleArea(r));
        System.out.println("Obwód koła: "  + Calculator.circlePerimeter(r));
        System.out.println("Wartość PI " +  Calculator.PI);
    }
}
