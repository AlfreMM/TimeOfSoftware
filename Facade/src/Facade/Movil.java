package Facade;

public class Movil {
    GPS Gps;
    WiFi Wifi;
    public void ConectarAWifi(String name){
        Wifi = new WiFi();
        Wifi.Encender();
        Wifi.Conectar(name);
    }
    public void DesconectarDeWifi(){
        Wifi.Desconectar();
        Wifi.Apagar();
    }
    public Posicion ObtenerPosicion(){
        Posicion posicion;
        Gps = new GPS();
        Gps.Encender();
        Gps.FijarPosicion();
        posicion = Gps.ObtenerUltimaPosicion();
        Gps.Apagar();
        return posicion;
    }            
}