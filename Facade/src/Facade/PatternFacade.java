package Facade;

public class PatternFacade {
    public static void main(String[] args) {
        Movil movil = new Movil();
        movil.ConectarAWifi("WifiDePrueba");
        movil.DesconectarDeWifi();
        Posicion posicion = movil.ObtenerPosicion();
        System.out.println("Posición GPS " + posicion.getCuando() + 
        		":\nPunto: " + posicion.getLatitud() + "," +
        		posicion.getLongitud() + "\nAltura: " + 
        		posicion.getAltura());
    }
}