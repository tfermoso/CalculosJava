import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        Calculos calculos= new Calculos();
        String opcion;
        boolean salir=false;
        String MENU= """
                Menú Cálculos
                1. Introducir números
                2. Mostrar suma
                3. Mostrar media
                4. Mostrar array de números
                10. Salir
                """;
        do {
            System.out.println(MENU);
            opcion=leer.nextLine();
            switch (opcion) {
                case "1" -> {
                    System.out.println("Introduce los 10 números");
                    int[] numeros = new int[10];
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Numero " + i);
                        numeros[i] = leer.nextInt();
                        leer.nextLine();
                    }
                    calculos.setNumeros(numeros);
                }
                case "2" -> System.out.println("La suma es: ");
                case "3" -> System.out.println("La media es " + calculos.media());
                case "4" -> System.out.println(calculos);
                case "10" -> salir = true;
                default -> System.out.println("Opcion no válida");
            }

        }while(!salir);

    }

}