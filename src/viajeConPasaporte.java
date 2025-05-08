import java.util.Scanner;

public class viajeConPasaporte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese su edad: ");
        int edadViajero = sc.nextInt();

        System.out.print("ingrese un numero como 1(tiene pasaporte) o 0(No tiene pasaporte): ");
        int pasaporteViajero = sc.nextInt();

        if (edadViajero > 18 && pasaporteViajero == 1) {
            System.out.println("puedes viajar");
        } else {
            System.out.println("No puede viajar");
        }
    }
}