public class ExceptionPractice {
    public static void main(String[] args) {
        int num1 = 0, num2;
        try {
            num2 = 1 / num1;
            System.out.println(num2);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя.");
        } catch (Exception e) {
            System.out.println("Возникло исключение.");
        } finally {
            System.out.println(num1);
        }
    }
}
