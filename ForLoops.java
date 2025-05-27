public class ForLoops {
    public static void main(String[] args) {

        System.out.println("*****");
        //Escribe un bucle for que imprima números del 1 al 10
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("*****");
        //Escribe un bucle for que imprima "¡Hola FemCoders!" 5 veces
        for (int j = 0; j < 5; j++) {
            System.out.println("¡Hola FemCoders!");
        }
        System.out.println("*****");
        //Escribe un bucle for que imprima la tabla de multiplicar del número 7 (del 1 al 10)
        for (int k = 1; k < 11; k++) {
            System.out.println("7 x " + k + " = " + (7 * k));
        }
        System.out.println("*****");
        //Escribe un bucle for que imprima números del 10 al 1 
        for (int l = 10; l > 0; l--) {
            System.out.println(l);
        }
        System.out.println("*****");
        //Escribe un bucle for que imprima los 10 primeros números impares
        for (int m = 1; m < 20; m += 2) {
            System.out.println(m);
        }
        System.out.println("*****");
        //Escribe un bucle for que encuentre el número más pequeño que sea mayor a 20 y que sea divisible para 8, usando 'break'.
        //Imprime: El número más pequeño mayor de 20 que es divisible para 8 es <result>
        int result = 0;
        for (int a = 21; true; a++) {
            if (a % 8 == 0) {
                result = a;
                break;
            }
        }
        System.out.println(result);
        System.out.println("*****");
        //Escribe un bucle for que imprima números pares del 1 al 20 saltando los números impares usando 'continue'
        for (int b = 1; b <= 20; b++) {
            if (b % 2 != 0) {
                continue;
            }
            System.out.print(b + " ");
        }
    }
}