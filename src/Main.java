public class Main {

    public static void main(String[] args) {
        System.out.println("Сложение: "+ calculate(1,2, (double a,double b) -> a+b));
        System.out.println("Умножение: "+ calculate(2,4, (double a,double b) -> a*b));
        System.out.println("Деление: "+ calculate(4,2, (double a,double b) -> a/b));
        System.out.println("Максимальное число: "+ calculate(45,6, (double a,double b) -> Math.max(a,b)));
        System.out.println("Крайняя операция: "+ calculate(4,2, (double a,double b) -> ((Math.pow(Math.min(a,b),(Math.max(a,b))-Math.min(a,b)))*10)/Math.max(a,b)));
    }

    public static double calculate (double a, double b, IMath i) {
        return i.calc(a,b);
    }
}
