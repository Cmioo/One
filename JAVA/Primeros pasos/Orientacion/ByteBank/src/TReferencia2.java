public class TReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "45444332";

        Cuenta cuentaDiego = new Cuenta();
        cuentaDiego.agencia=1;
        cuentaDiego.titular= diego;

        System.out.println(cuentaDiego.titular.documento);
        System.out.println(cuentaDiego.titular);
        System.out.println(diego);
    }    

}
