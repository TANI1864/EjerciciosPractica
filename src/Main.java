import java.util.Random;
import java.util.Scanner;

class DadoDelDestino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int vidas = 5;
        int puntos = 0;

        while (vidas > 0 && puntos <= 10) {
            System.out.println("Presiona Enter para lanzar el dado");
            scanner.nextLine();

            int dado = random.nextInt(6) + 1;
            System.out.println("Tu dado ha caido en: " + dado);

            if (dado == 1) {
                vidas--;
                System.out.println("Haz perdido una vida. Tus vidas restantes son: " + vidas);
            } else if (dado == 6) {
                puntos += 3;
                System.out.println("¡Haz ganado 3 puntos!Tus puntos totales son: " + puntos);
            } else if (dado == 2 || dado == 4) {
                puntos += 1;
                System.out.println("¡Haz ganado 1 punto!Tus puntos totales son: " + puntos);
            } else {
                System.out.println("No pasó nada.Tus puntos totales son: " + puntos);
            }
        }


        if (vidas == 0) {
            System.out.println("¡Te quedaste sin vidas! El juego Finalizo.");
        } else {
            System.out.println("¡Has alcanzado más de 10 puntos! ¡Ganaste!");
        }

    }
}
