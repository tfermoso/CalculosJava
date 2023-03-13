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
                10. Salir
                """;
        do {
            System.out.println(MENU);
            opcion=leer.nextLine();
            switch (opcion){
                case "1":
                    System.out.println("Introduce los 10 números");
                    int[] numeros=new int[10];
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Numero "+i);
                        numeros[i]= leer.nextInt();
                        leer.nextLine();
                    }
                    calculos.setNumeros(numeros);
                    break;
                case "2":
                    System.out.println("La media es "+calculos.media());
                    break;
                case "10":
                    salir=true;
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
            }

        }while(!salir);

    }

}