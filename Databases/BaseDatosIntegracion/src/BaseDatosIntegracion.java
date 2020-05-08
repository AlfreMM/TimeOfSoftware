import java.sql.*;

public class BaseDatosIntegracion {

	public static void main(String[] args) 
	{
		try
        { 
        	
        	Connection conn1 = null;
            String userName = "root";
            String password = "alfredo";
            
            String url = "jdbc:mysql://localhost:3306/libreria";

            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conn1 = DriverManager.getConnection (url, userName, password);
            Statement instruccion1 = conn1.createStatement();
             
            ResultSet tabla1 = instruccion1.executeQuery("SELECT count(*) FROM libros");
            tabla1.next();
            int tamanio = tabla1.getInt(1);

            ResultSet tabla = instruccion1.executeQuery("SELECT * FROM libros");

            String matriz [] [] = new String [tamanio][5];                     

            int i = 0;
            while(tabla.next())
            {
                 matriz [i][0] = tabla.getString(1);
                 matriz [i][1] = tabla.getString(2);
                 matriz [i][2] = tabla.getString(3);
                 matriz [i][3] = tabla.getString(4);
                 i = i + 1;
            }

            Connection conn2 = null;
            url = "jdbc:mysql://localhost:3306/proveedor";

            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conn2 = DriverManager.getConnection (url, userName, password);
            Statement instruccion2 = conn2.createStatement();

            Float precio;
            ResultSet tabla2;
            String consulta2;
            for (i= 0; i <tamanio; i++)
            {    
                 consulta2 = "SELECT preciototal FROM precios WHERE id_libro = " + matriz[i][2];
                 tabla2 = instruccion2.executeQuery(consulta2);
                 tabla2.next();
                 
                 precio = tabla2.getFloat(1);
                 matriz [i][4] = precio.toString();
            }    

            for (i= 0; i <tamanio; i++)
            {
                 System.out.print(matriz[i][3]+ ":" + matriz[i][1] + "\t" + matriz[i][4] + "\n");
                
            }
             
        }
        catch (Exception e)
        {
            System.err.println ("Cannot connect to database server");
        }
	}
}