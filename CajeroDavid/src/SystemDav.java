import java.util.Scanner;

public class SystemDav {
    private static char Cuenta1235;
    private static boolean balance;

    public static void main(String[] args) {
        System.out.println("Bienvenido al Banco Deivid");
        Scanner read = new Scanner(System.in);
        String pin=read.next();
        if (Cuenta1235 == '1235') {
            boolean valid;
            do {
                System.out.println("Please enter card Number");
                int tarjeta = Scanner.nextInt();
            } while (!valid);
            String password;
            boolean pValid = false;
            double balance;
            do {
                System.out.println(" Ingrese su pass");
                password = Scanner.next();
                if (Cuenta1235.(password == true)) {
                    pValid = true;
                    break;
                } else {
                    System.out.println("Password erronea");
                }
            } while (!pValid);
            boolean valid2 = true;
            while (valid2) {
                System.out.println("ingrese la cantidad que requiere [2] para salir al menu principal.");
                balance = Scanner.nextDouble();
                if (balance == 2) {
                    valid2 = false;
                    break;
                }
                if (balance >= 1001) {
                    System.out.println("Esta cantidad excede la cantidad máxima que puede retirar por transacción");
                }
                if (balance > 1000) {
                    System.out.println("Esta cantidad  retirara todo su balance");
                }

                double balances = Cuenta1235.(password, balance);


            }
        }

    Scanner sc = new Scanner(System.in);
    }
}