public class PruebaMetodos {
    public static void main(String[] args) {

        Cuenta miCuenta = new Cuenta(1);
        System.out.println(miCuenta); 
        miCuenta.depositar(300);

        miCuenta.depositar(200);
        System.out.println("El saldo de miCuenta es " + miCuenta.getSaldo());

        miCuenta.retirar(100);
        System.out.println("El saldo de miCuenta es " + miCuenta.getSaldo());

        Cuenta cuentaJimena= new Cuenta(1);
        cuentaJimena.depositar(1000);
        System.out.println("El saldo de cuentaJimena es " + cuentaJimena.getSaldo());
        cuentaJimena.transferir(400, miCuenta);
        System.out.println("El saldo de cuentaJimena es " + cuentaJimena.getSaldo());
        System.out.println("el saldo de miCuenta es " + miCuenta.getSaldo());        
        
    }
    
}
