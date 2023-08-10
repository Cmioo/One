public class TReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("45444332");
        diego.setTelefono("5566997744");

        Cuenta cuentaDiego = new Cuenta(2);
        cuentaDiego.titular= diego;

        System.out.println(cuentaDiego.titular.getDocumento());
        System.out.println(cuentaDiego.titular);
        System.out.println(diego);
    }    

}
