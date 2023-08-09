public class CrearCuenta {

    public static void main(String[] args) {
        
        Cuenta primerCuenta= new Cuenta();
        primerCuenta.saldo=200;
        System.out.println(primerCuenta.saldo);
       
        primerCuenta.saldo +=100;
        System.out.println(primerCuenta.saldo);
       
        Cuenta segundCuenta = primerCuenta;
        segundCuenta.saldo = 50;

        System.out.println("Primer cuenta tiene "+ primerCuenta.saldo);
        System.out.println("Segunda cuenta tiene "+ segundCuenta.saldo);
        System.out.println(primerCuenta);
    }
}