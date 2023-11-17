import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        double valorA, valorB, valorC;
        int repeticiones = 0;
          
        System.out.println("Ingrese los valores de la ecuacion ax^2+bx+c");
        System.out.println("");

        while(repeticiones < 3){

            try {
              
               System.out.println("Ingrese el coeficiente de X^2.");
               valorA = Double.parseDouble(entrada.nextLine());
               System.out.println("Ingrese el coeficiente de X");
               valorB =  Double.parseDouble(entrada.nextLine());
               System.out.println("Ingrese el termino constante.");
               valorC =  Double.parseDouble(entrada.nextLine());

               Raices ecuacion = new Raices(valorA, valorB, valorC);

               ecuacion.calcular();

               repeticiones = 3;

            } catch (java.lang.NumberFormatException e) {

                System.out.println("Ingrese valores numericos.");
                System.out.println();

                repeticiones++;

                if(repeticiones == 3){

                  System.out.println("Error! se intento varias veces.");

                }
            }

        }
        
        entrada.close();

    }
}
