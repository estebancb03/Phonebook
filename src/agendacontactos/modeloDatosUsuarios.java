/*
    Descripción: Clase que contiene la lógica que maneja los procesos sobre las
                 tabla "usuarios "de la base de datos
    Autor: Esteban Castañeda Blanco
*/
package agendacontactos;
import java.sql.*;

public class modeloDatosUsuarios {
    
    //Se instancian clases
    conexionBaseDeDatos cbd = new conexionBaseDeDatos();
    
    //Variables para todo el proyecto
    static String loginUsuario;
    static String nivelUsuario;
    static String nombreUsuario;
    
    /*Método que busca en la tabla de base de datos un login para ver si está o 
    no esta almacenado un usuario*/
    public boolean buscarLogin(String login){
        
        boolean encontrado = false;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM usuarios WHERE LOGINUSUARIO = '"+login+"'";
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first(); //Ubica primer registro del "rs"
            if(rs != null){
                
                //Compara el parametro ide con el contenido del campo "id" 
                if (login.equals(rs.getString("LOGINUSUARIO"))){
                    
                    encontrado = true;
                }
            }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        finally{
            
            try{
                
                cbd.connect.close(); //cierra la "cbd"
            }
            catch(Exception e){}
        }
        return encontrado;
    } //Fin del método "buscarLogin"
    
    //Método que permite registrar un usuario en la "USUARIOS"
    public boolean ingresarUsuario(String login, String id, String nombre, String fechaRegistro,
                            String cuentaCorreo, String nivelUsuario, String password){
        try{
            
            cbd.conectarBaseAgenda(); 
            String query = "INSERT INTO USUARIOS (LOGINUSUARIO,IDENTIFICACION,NOMBREUSUARIO,FECHAREGISTRO,CUENTACORREO,NIVELUSUARIO,PASSWORD) "
                           + "VALUES ('"+login+"','"+id+"','"+nombre+"','"+fechaRegistro+"','"+cuentaCorreo+"','"+nivelUsuario+"','"+password+"')";
            cbd.stmt.execute(query); 
        }
        catch(Exception e){
            
            System.out.println(e);
            return false;
        }
        finally{
            
            try{
                
                cbd.connect.close();
            }
            catch(Exception e){}
        }
        return true;
    } //Fin método "ingresarUsuario"
    
    //Método que permite mostrar los datos de una identificación de usuario la tabla "USUARIOS"
    public void mostrarDatosLogin(String login,
                            javax.swing.JTextField campoId,
                            javax.swing.JTextField campoNombre,
                            javax.swing.JTextField campoFechaRegistro,
                            javax.swing.JTextField campoCuentaCorreo,
                            javax.swing.JTextField campoNivelUsuario,
                            javax.swing.JTextField campoContraseña){
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM USUARIOS WHERE LOGINUSUARIO = '"+login+"'";
            cbd.stmt.execute(query);
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();
            if(rs != null){
                
                if(login.equals(rs.getString("LOGINUSUARIO"))){
                    
                    //Asigna a cada parámetro los campos de la tabla que están en el rs
                    campoId.setText(rs.getString("IDENTIFICACION"));
                    campoNombre.setText(rs.getString("NOMBREUSUARIO"));
                    campoFechaRegistro.setText(rs.getString("FECHAREGISTRO"));
                    campoCuentaCorreo.setText(rs.getString("CUENTACORREO"));
                    campoNivelUsuario.setText(rs.getString("NIVELUSUARIO"));
                    campoContraseña.setText(rs.getString("PASSWORD"));
                }
            }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        finally{
            
            try{
                
                cbd.connect.close(); //Cierra la bd
            } 
            catch(Exception e){}
        }
    } //Fin de "mostrarDatosLogin"
    
    //Método que permite mostrar los datos de una identificación de la tabla clientes
    public void mostrarDatosModificarLogin(String login,
                            javax.swing.JTextField campoId,
                            javax.swing.JTextField campoNombre,
                            javax.swing.JTextField campoFechaRegistro,
                            javax.swing.JTextField campoCuentaCorreo,
                            javax.swing.JComboBox campoNivelUsuario,
                            javax.swing.JTextField campoContraseña,
                            javax.swing.JComboBox comboNivel){
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM USUARIOS WHERE LOGINUSUARIO = '"+login+"'";
            cbd.stmt.execute(query);
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();
            if(rs != null){
                
                if(login.equals(rs.getString("LOGINUSUARIO"))){
                    
                    //Asigna a cada parámetro los campos de la tabla que están en el rs
                    campoId.setText(rs.getString("IDENTIFICACION"));
                    campoNombre.setText(rs.getString("NOMBREUSUARIO"));
                    campoFechaRegistro.setText(rs.getString("FECHAREGISTRO"));
                    campoCuentaCorreo.setText(rs.getString("CUENTACORREO"));
                    campoContraseña.setText(rs.getString("PASSWORD"));
                    comboNivel.setSelectedItem(rs.getString("NIVELUSUARIO"));
                }
            }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        finally{
            
            try{
                
                cbd.connect.close(); //Cierra la bd
            } 
            catch(Exception e){}
        }
    } //Fin de "mostrarDatosLogin"
    
    //Método que permite eliminar un usuario de la tabla "USUARIOS" de base de datos
    public boolean eliminarDatosUsuario(String login){
        
        boolean borrado = true;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "DELETE FROM USUARIOS WHERE LOGINUSUARIO = '"+login+"'";
            cbd.stmt.execute(query);//Ejecuta la instruccion que esta en query
        }
        catch(Exception e){
            
            System.out.println(e);
            borrado = false;
        }
        finally{
            
            try{
                
                cbd.connect.close();
            }
            catch(Exception e){}
        }
        return borrado;
    } //Fin de "eliminarDatosUsuario"
    
    //Método que permite modificar los datos de un usuario
    public boolean modificarDatosUsuario(String loginUsuario, String id, String nombre,
                                         String correo,String nivel, String contraseña){
        try{
            
            cbd.conectarBaseAgenda();
            String query = "UPDATE USUARIOS SET IDENTIFICACION = '"+id+"',NOMBREUSUARIO = '"+nombre+"',CUENTACORREO = '"+correo+"',"
                           + "NIVELUSUARIO = '"+nivel+"',PASSWORD = '"+contraseña+"'  WHERE LOGINUSUARIO = '"+loginUsuario+"'";
            cbd.stmt.execute(query); //Ejecuta la instruccion que esta en query
        }
        catch(Exception e){
            
            System.out.println(e);
            return false;
        }
        finally{
            
            try{
                
                cbd.connect.close();
            }
            catch(Exception e){}
        }
        return true;
    }
    
    //Método para buscar un usuario
    public boolean buscarUsuario(String login, String password){
        
        boolean encontrado = false;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM USUARIOS WHERE LOGINUSUARIO = '"+login+"' AND PASSWORD = '"+password+"'";
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first(); //Ubica primer registro del "rs"
            if(rs != null){
                 
                if (login.equals(rs.getString("LOGINUSUARIO")) && password.equals(rs.getString("PASSWORD"))){
                    
                    encontrado = true;
                    loginUsuario = rs.getString("LOGINUSUARIO");
                    nivelUsuario = rs.getString("NIVELUSUARIO");
                    nombreUsuario = rs.getString("NOMBREUSUARIO");
                }
            }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        finally{
            
            try{
                
                cbd.connect.close(); //cierra la "cbd"
            }
            catch(Exception e){}
        }
        return encontrado;
    } //Fin del método "buscarLogin"
    
} //Fin de "modeloDatosUsuarios"