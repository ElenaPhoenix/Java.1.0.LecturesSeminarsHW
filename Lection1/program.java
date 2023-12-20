import java.util.Scanner;
/**
 * program
 */
public class program {

    public static void main(String[] args) {
        System.out.println("bye world");

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
    }
}
