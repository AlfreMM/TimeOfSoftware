package Facade;

public class GPS {
    public void Encender(){ System.out.println("GPS encendido");}
    public void FijarPosicion(){System.out.println("Fijando posición... ¡¡Posición fijada!!");}
    public Posicion ObtenerUltimaPosicion(){
            Posicion posicion = new Posicion();
            posicion.setLatitud("4.3");
            posicion.setLongitud("-0.3");
            posicion.setAltura("500");
            posicion.setCuando("2015-10-30 19:00");            
            return posicion;
    }
    public void Apagar(){System.out.println("GPS apagado");}
}