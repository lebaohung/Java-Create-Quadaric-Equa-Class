import java.util.Scanner;
public class TestQuadaricEquation {
    static double a, b, c;

    static void inputQuadaricEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        System.out.print("Enter c: ");
        c = scanner.nextDouble();
    }

    public static void main(String[] args) {
        inputQuadaricEquation();
        QuadaricEquation quadaricEquation = new QuadaricEquation(a, b, c);
        double delta = quadaricEquation.getDelta();
        if (delta < 0 ) {
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            System.out.println("The equation has only 1 root: " + quadaricEquation.getRoot1());
        } else {
            System.out.println("The equation has 2 roots: " + quadaricEquation.getRoot1()
                    + " and " + quadaricEquation.getRoot2());
        }
    }
}
