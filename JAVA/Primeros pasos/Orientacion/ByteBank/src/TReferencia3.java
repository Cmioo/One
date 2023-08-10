public class TReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDiego = new Cuenta(2);
        Cliente cliente = new Cliente();
        cuentaDiego.setTitular(cliente);

        System.out.println(cuentaDiego.titular);
        System.out.println(cuentaDiego.getTitular());


    }    
}
