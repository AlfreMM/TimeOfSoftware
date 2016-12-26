package Proxy;

public class InformacionReal implements Informacion
{
	@Override public void MostrarInformacion() 
	{
		System.out.println("Esta es la información contenida en sujeto real."); 
	}
}