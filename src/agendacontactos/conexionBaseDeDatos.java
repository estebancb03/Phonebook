/*
    Descripción: Clase que hace la conexión con la base de datos
    Autor: Esteban Castañeda Blanco
*/
package agendacontactos;
import java.sql.*;

//Método para establecer conexión por medio de una cadena de conexión
public class conexionBaseDeDatos {
    
    //Define los parámetros de base de datos,login,password,url
    static String baseContactos = "agendacontactos";
    static String login = "root";
    static String password = "ercb03042001";
    static String url = "jdbc:mysql://localhost/"+baseContactos;
    public static Connection connect = null;
    public static Statement stmt;
    //Procedimiento para conertar "baseContactos" con MySQL
    public void conectarBaseAgenda(){
    
        try{
            
            Class.forName("com.mysql.jdbc.Driver"); //Se indica la conexión con la "baseContactos"
            connect = DriverManager.getConnection(url,login,password);
            //Mediante el "stmtAgendaContactos" se realizarán los comandos sobre la tabla de la base de datos
            stmt = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            if(connect != null){ //Condicional que comprueba la conexión con la base de datos
                
                System.out.println("Conexion con Base de Datos "+ connect + " Correcta...");
            }    
        }
        catch(SQLException e){
            
            System.out.println(e); //Muestra la exception
        }
        catch(ClassNotFoundException e){
            
            System.out.println(e); //Muestra la exception
        }
    } //Fin de "conectarBaseAgenda"
}
