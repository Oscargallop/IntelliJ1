import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        //System.out.println(numero);
        double numeroUsuario = 0;
        int intentos = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Escribe el numero:");
            numeroUsuario = teclado.nextInt();
            intentos++;
            if (numeroUsuario == numero) {
                System.out.println("adivinaste el numero en "+intentos+" intentos");
                break;
            }else {
                if (numeroUsuario > numero) {
                    System.out.println("El numero es menor");

                }else {
                    if (numeroUsuario < numero) {
                        System.out.println("El numero es mayor");
                    }

                }
            }
        }


        System.out.println(numero);

    }
}
