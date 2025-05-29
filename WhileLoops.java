import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        System.out.println("*****");
        int randomNumber = 0;
        while (randomNumber != 7) {
            randomNumber = getRandomNumber(10);
            System.out.println(randomNumber);
        }
        System.out.println("Fin del bucle.");
        System.out.println("*****");

        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        int generatedNumber = 0;
        while (generatedNumber <=70) {
            generatedNumber = getRandomNumber(100);
            System.out.println(generatedNumber);
        }
        System.out.println("Fin del bucle.");
        System.out.println("*****");
        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber
        Scanner scan = new Scanner(System.in);

        int secretNumber = getRandomNumber(100); // Generamos el número secreto entre 1 y 100
        int userTry;

        do {
            System.out.print("Ingresa tu numero: ");
            userTry = scan.nextInt(); // Leemos el intento del usuario

            if (userTry < secretNumber) {
                System.out.println("El número es mayor. Intenta de nuevo!");
            } else if (userTry > secretNumber) {
                System.out.println("El número es menor. Intenta de nuevo!");
            }
        } while (userTry != secretNumber); // El bucle continúa mientras el intento no sea el número secreto

        System.out.println("¡Felicidades! Has adivinado el número " + secretNumber + "!");
        System.out.println("Fin del bucle.");
        System.out.println("*****");

        scan.close(); // Es buena práctica cerrar el Scanner cuando ya no se necesita
    }


    /**
     * Function name: getRandomNumber
     *
     * @param number (int)
     * @return (int)
     *
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){

        return (int)(Math.random() * number) + 1;
    }
}


