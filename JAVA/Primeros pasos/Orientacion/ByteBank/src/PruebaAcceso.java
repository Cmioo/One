public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.saldo = 200;
        System.out.println(cuenta.saldo);
        cuenta.retirar(100);
        System.out.println(cuenta.saldo);
        cuenta.saldo = cuenta.saldo - 300;
        System.out.println(cuenta.saldo);

    }
    
}
