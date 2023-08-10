public class PruebaConstructor {
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta(555);
        Cuenta cuenta2 = new Cuenta(2);
        System.out.println(cuenta);
        System.out.println(cuenta2);
        // Se puede obtener el dato desde la clase de "Cuenta" porque es un valor estatico
        System.out.println(Cuenta.getTotal());
    }
}
