
public class TipoVariable{

    public static void main (String[] args) {
            System.out.println("Hola Mundo");

        int edad=28;
            System.out.println(edad);

        edad=47;
            System.out.println(edad);

        edad=46+88;
            System.out.println(edad);    

        double salario=1250.5;
            System.out.println(salario);
        
        salario=850;
            System.out.println(salario);

        salario=3.1415;
            System.out.println(salario);
        double salarioMitad= salario/2;
            System.out.println(salarioMitad);

        double variable1=230.89;
        //int variable1Entero=?  int variable1Entero= (int) variable1; se llama Cast, obligar a imprimir un valor, imprime en cosola en este caso solo un # entero

        int variable1Entero= (int) variable1;
        
            System.out.println(variable1Entero);

        double resultado = variable1 + variable1Entero;
            System.out.println(resultado);


    }
}
