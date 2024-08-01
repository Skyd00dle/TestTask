import java.util.Scanner;

public class test {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение");
        String spring = scan.nextLine();
        String[] Mass = spring.split(" ");
        if (Mass.length != 3) {
            throw new Exception("Неверный формат ввода");
        }
        int value1 = Integer.parseInt(Mass[0]);
        int value2 = Integer.parseInt(Mass[2]);
        if (value1 < 1 || value1 > 10 || value2 < 1 || value2 > 10) {
            throw new Exception("Число вне диапазона");
        }
        String charValue = Mass[1];
        int sum = 0;
        if (charValue.equals("+") )  {
             sum = value1 + value2;
        }
        else if (charValue.equals("-")) {
            sum = value1 - value2;
        }
        else if (charValue.equals("/")) {
            sum = value1 / value2;
        }
        else if (charValue.equals("*")) {
            sum = value1 * value2;
        }
        else {
            throw new Exception("Неверный оператор");
        }
        System.out.println(sum);
    }
}
