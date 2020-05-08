package Proxy;

public class PatternProxy 
{
	public static void main(String[] args) 
	{
		InformacionProxy proxy1 = new InformacionProxy("Alfredo"); 
		proxy1.MostrarInformacion();
		InformacionProxy proxy2 = new InformacionProxy("Administrador"); 
		proxy2.MostrarInformacion();
	} 	
}