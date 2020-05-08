package Proxy;

public class InformacionProxy implements Informacion
{
	private InformacionReal real;
	private String codigo;
	public InformacionProxy(String codigo)
	{ 
		this.codigo = codigo; 
	} 
	
	@Override public void MostrarInformacion() 
	{
		if(codigo.equalsIgnoreCase("administrador"))
		{ 
			System.out.println("¡¡Accedido con éxito!!"); 
			real = new InformacionReal(); 
			real.MostrarInformacion();
		}
		else
		{ 
			System.out.println("No tiene permisos para acceder.");
		} 
	}
}