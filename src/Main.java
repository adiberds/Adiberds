import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How much is the bill? ");
        String z = s.nextLine();
        int bill = Integer.parseInt(z);
        System.out.print("How much is the tip ");
        String x = s.nextLine();
        double tip = Integer.parseInt(x);
        tip /= 100;
        tip += 1;
        System.out.print("How many people are there? ");
        String Y = s.nextLine();
        int people = Integer.parseInt(Y);
        System.out.println("The total tip amount is " + ((int) (bill * tip) - (bill)));
        System.out.println("The total bill including tip is " + ((int) (bill * tip)));
        System.out.println("The tip per person is " + ((( (int) bill * tip) - (bill))) / people);
        System.out.println("The total per person is " + (((( (int) bill * tip))) / (people)));
        System.out.print("Name: Adib Miah ");
        System.out.print("Favorite Movie: Spiderman 2 ");
        s.close();
    }
}
