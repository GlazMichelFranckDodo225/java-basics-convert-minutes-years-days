import java.util.Scanner;

public class YearsAndDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double minutesInYear = 60 * 24 * 365;
        System.out.println("Input the number of minutes : ");
        double minutes = input.nextDouble();

        long years = (long) (minutes / minutesInYear);
        int days = (int) ((minutes / 60 / 24) % 365);

        System.out.println((int) minutes + " minutes are approximatively " + years +
                " years and " + days + " days.");

    }
}
