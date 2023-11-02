import java.util.Scanner;

public class PrintQuipux {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static String getNumber() {
        int num = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese numero: ");
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero entero");
            getNumber();
        }

        return validateNum(num);
    }

    public static String validateNum(int num) {
        boolean isEven = num % 2 == 0;

        if (!isEven && num > 20) {
            return "Quipux";
        }

        if (isEven && num >= 2 && num <= 5) {
            return "No Quipux";
        }

        if (isEven && num >= 6 && num <= 20) {
            return "Quipux";
        }

        // Es impar o par mayor a 20
        return "No Quipux";
    }
}
