/**
 * @author Daniel.Augusto
 *
 */
public class CalculoMedia {

    public static void main(String args[]) {
        Notas();
        Resultado();
    }

    public static void Resultado() {
        System.out.println("**** Resultado ****");
        int num1 = 7;
        int num2 = 5;
        int num3 = 4;
        int num4 = 8;

        int num5 = (7 + 5 + 4 + 8)/4;
        System.out.println(num5);
    }

    private static void Notas() {
        System.out.println("**** Notas ****");

        int num1 = 7;
        int num2 = 5;
        int num3 = 4;
        int num4 = 8;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);}
}











