package main.webapp; 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/articulo")
public class Articulo {
	@GET
	@Produces("application/xml")
	public String ReadAll() {
		return "<Articulos>" + "<IDArticulo>" + "1" + "</IDArticulo>" + 
				"<IDArticulo>" + "2" + "</IDArticulo>" + "</Articulos>";
	}
 
	@Path("{id}")
	@GET
	@Produces("application/xml")
	public String ReadOne(@PathParam("id") int idarticulo) {
		switch(idarticulo)
		{
			case 1:
				return "<Articulo>" + "<Nombre>" + "Servicios REST" 	
					+ "</Nombre>" + "<Autor>" + "Alfredo" + "</Autor>" + "</Articulo>";
			case 2:
				return "<Articulo>" + "<Nombre>" + "La mejor comida para perros"
					+ "</Nombre>" + "<Autor>" + "Leo" + "</Autor>" + "</Articulo>";
			default:
				return "<Articulo>Not found</Articulo>";
		}
	}
}