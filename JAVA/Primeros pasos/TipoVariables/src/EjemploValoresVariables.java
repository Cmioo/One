public class EjemploValoresVariables {
    public static void main(String[] args) {
        
        int numero1=5;
        int numero2=9;
        System.out.println(numero2);

        numero2 = numero1; //5
        System.out.println(numero2);

        numero1=88;
        System.out.println(numero2);
        //seguira imprimiendo 5, no tiene memoria para modificar la operación

        

    }
    
}
