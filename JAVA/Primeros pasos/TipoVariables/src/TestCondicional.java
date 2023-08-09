public class TestCondicional {
    public static void main(String[] args) {
        System.out.println("probando condicionales");
        int edad=16;
        int cantidadP= 1;

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
            System.out.println("Bienvenido");
        }
        else{
            if (cantidadP >=2){
                System.out.println("No eres mayor de edad, pero estas acompañado");
            }
            else{
            System.out.println("No puedes pasar");
            }
    
        }
    }

}
