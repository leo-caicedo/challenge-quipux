import java.util.Scanner;

public class PrintTime {
    public static void main(String[] args) {
        System.out.println(getTimeToWords());
    }

    public static String getTimeToWords() {
        int hour = getHour();
        int minutes = getMinutes();

        String[] minorNums = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte"};

        String[] bigNums = {"veinti", "treinta", "cuarenta", "cincuenta"};

        String wordHour = "";
        String wordMinutes = "";

        if (hour <= 20) {
            wordHour = minorNums[hour];
        } else if (hour <= 23) {
            wordHour = bigNums[0] + " " + minorNums[hour % 10];
        }

        if (minutes == 0) {
            return wordHour + " en punto";
        } else if (minutes == 30) {
            return wordHour + " y media";
        } else if (minutes <= 20) {
            wordMinutes = minorNums[minutes];
        } else if (minutes <= 29) {
            wordMinutes = bigNums[0] + " " + minorNums[minutes % 10];
        } else if (minutes <= 39) {
            wordMinutes = bigNums[1] + " " + minorNums[minutes % 10];
        } else if (minutes <= 49) {
            wordMinutes = bigNums[2] + " " + minorNums[minutes % 10];
        } else if (minutes <= 59) {
            wordMinutes = bigNums[3] + " " + minorNums[minutes % 10];
        }

        return wordHour + " y " + wordMinutes + " minutos";
    }

    public static int getHour() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la hora HH: ");

        return Integer.parseInt(scanner.nextLine());
    }

    public static int getMinutes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa los minutos MM: ");

        return Integer.parseInt(scanner.nextLine());
    }
}