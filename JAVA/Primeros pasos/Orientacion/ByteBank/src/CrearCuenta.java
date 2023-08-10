public class CrearCuenta {

    public static void main(String[] args) {
        
        Cuenta primerCuenta= new Cuenta(1);
        primerCuenta.depositar(200);
        System.out.println(primerCuenta.getSaldo());
       
        primerCuenta.depositar(100);
        System.out.println(primerCuenta.getSaldo());
       
        Cuenta segundCuenta = new Cuenta(1);
        segundCuenta.depositar(50);

        System.out.println("Primer cuenta tiene "+ primerCuenta.getSaldo());
        System.out.println("Segunda cuenta tiene "+ segundCuenta.getSaldo());
        System.out.println(primerCuenta);
    }
}