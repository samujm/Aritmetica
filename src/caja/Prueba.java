
package caja;

public class Prueba {
    public static void main(String[] args) {
        int cAncho = 3;
        int cAlto = 2;
        int cProfundo = 6;
        
        Caja cajaN = new Caja();
        cajaN.ancho = cAncho;
        cajaN.alto = cAlto;
        cajaN.profundo = cProfundo;
        int resultado = cajaN.calcularVolumen();
        
        System.out.println("resultado volumen de caja 1: " + resultado);

        Caja cajaN2 = new Caja(2, 4, 6);
        System.out.println("resultado volumen de caja 2: " + cajaN2.calcularVolumen());
    }
}
