package Facade;

public class WiFi {
    private String wifiname;
    public void Encender(){ System.out.println("WiFi encendida");}
    public void Conectar(String name){ wifiname = name; System.out.println("Conectado a Wifi: " + name);}
    public void Desconectar(){ System.out.println("Desconectado de WiFi: " + wifiname);}
    public void Apagar() {System.out.println("WiFi apagada");}
}