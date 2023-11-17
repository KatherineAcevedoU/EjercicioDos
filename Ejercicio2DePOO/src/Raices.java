public class Raices { 

    private double a; 
    private double b;
    private double c;

    public Raices(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    private double mostrarDiscriminante(){

        double discriminante = Math.sqrt((Math.pow(b, 2)) - (4 * a * c));

        return discriminante; 

    }

    private boolean tieneRaiz(){

       return mostrarDiscriminante() == 0;

    }

    private boolean tieneRaices(){

        return mostrarDiscriminante() > 0;

    }

    private void obtenerRaiz(){

        double respuesta = (-(b) ) / (2 * a);
    
        System.out.println("El resultado de la ecuacion es: " + respuesta);

    }

    private void obtenerRaices(){

        double respuesta1 = (-(b) + mostrarDiscriminante()) / (2 * a);
        double respuesta2 = (-(b) - mostrarDiscriminante()) / (2 * a);               

        System.out.println("El primer resultado de la ecuacion es: " + respuesta1);
        System.out.println("El segundo resultado de la ecuacion es: " + respuesta2);
            
    }

    public void calcular(){

        if (tieneRaiz()) {

            System.out.println("La ecuacion tiene una unica solucion real.");

            obtenerRaiz();
        
        } else if(tieneRaices()) {

            System.out.println("La ecuacion tiene dos soluciones reales.");

            obtenerRaices();
        
        } else{

            System.out.println("La ecuacion cuadratica no tiene solucion!.");

        }

    }



    
    
}
