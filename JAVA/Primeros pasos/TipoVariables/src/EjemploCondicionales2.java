public class EjemploCondicionales2 {
    public static void main(String[] args) {
        System.out.println("probando condicionales");
        int edad=21;
        int cantidadPersonas= 2;

        boolean esPareja = cantidadPersonas >1;
        boolean puedeEntrar = edad >= 18 && esPareja;

        System.out.println("El valor de la condición es:" + esPareja);

        if (puedeEntrar){
            System.out.println("Usted puede pasar");
            System.out.println("Bienvenido");
        }
        else{
            System.out.println("No puedes pasar");
            }

           }
        }
