public class PruebaAcceso {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(1);
        System.out.println(cuenta.getAgencia());
        cuenta.depositar(400);
        cuenta.retirar(300);
        System.out.println(cuenta.getSaldo());

    }
    
}
