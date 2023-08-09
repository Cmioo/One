public class EjCrearCuenta {

    public static void main(String[] args) {
        // Variable        =   valor
        //Java genera un id siempre que se genera una nueva cuenta -> 123ABC, es la referencia en la memoria donde se encuentra
        Cuenta primerCuenta= new Cuenta();
        primerCuenta.saldo=1000;
        //primerCuenta.pais="Mexico"; no va a compilar porque no cuenta con ese variable dentro de la clase

        System.out.println(primerCuenta.saldo);
        
        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 50000;
        System.out.println(segundaCuenta.saldo);
        System.out.println(primerCuenta.agencia);

        if( primerCuenta == segundaCuenta){
            System.out.println("Son el mismo objeto");
        }else{
            System.out.println("son diferentes");
        }
    }
}


//Al usar new, inicializa todas las variables, es por ello que si no se le asigna algun valor, sera 0 y nule para el string
//Si se asigna un valor en el archivo cuenta, sera el valor por default. ej. agencia=2; Si no se le asigna algun valor, solo arrojara 2.
