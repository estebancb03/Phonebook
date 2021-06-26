/*
    Descripción: Clase que contiene la lógica que maneja los procesos sobre las
                 tabla "CONTACTOS" de la base de datos
    Autor: Esteban Castañeda Blanco
*/
package agendacontactos;
import java.sql.*;
import javax.swing.JOptionPane;

public class modeloDatosContactos {
    
    //Se instancian clases
    conexionBaseDeDatos cbd = new conexionBaseDeDatos(); //Instancia de la clase "conexionBaseDeDatos"
    static String categoriaContacto;
    
    /*Método que busca en la tabla de base de datos un id para ver si está o 
    no esta almacenado un contacto*/
    public boolean buscarId(String id){
        
        boolean encontrado = false;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS WHERE IDENTIFICACION = '"+id+"'";
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first(); //Ubica primer registro del "rs"
            if(rs != null){
                //Compara el parametro ide con el contenido del campo "id" 
                if (id.equals(rs.getString("IDENTIFICACION"))){
                    encontrado = true;
                    categoriaContacto = rs.getString("CATEGORIA");
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
    } //Fin del método "buscarId"
    
    /*Método que busca en la tabla de base de datos un número de contacto para 
    ver si está o no esta almacenado un contacto*/
    public boolean buscarNumContacto(String numeroContacto){
        
        boolean encontrado = false;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM contactos WHERE NUMEROCONTACTO = '"+numeroContacto+"'";
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first(); //Ubica primer registro del "rs"
            if(rs != null){
                //Compara el parametro ide con el contenido del campo "id" 
                if (numeroContacto.equals(rs.getString("NUMEROCONTACTO"))){
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
    } //Fin del método "buscarNumContacto"
    
    //Método que permite registrar un contacto en la tabla "CONTACTOS"
    public boolean ingresarContacto(String id, String nombre, String apellido1, String apellido2,
                            String pais, String fechaRegistro, String fechaCumpleaños, String categoria,
                            int telFijo, int telMovil, int telFax, String correo)
    {
        try{
            
            cbd.conectarBaseAgenda(); 
            String query = "INSERT INTO CONTACTOS (IDENTIFICACION,NOMBRE,APELLIDO1,APELLIDO2,PAIS,FECHAREGISTRO,FECHAANIVERSARIO,"
                           + "CATEGORIA,TELEFONOFIJO,TELEFONOMOVIL,TELEFONOFAX,CUENTACORREO) VALUES ('"+id+"','"+nombre+"','"+apellido1+"',"
                           + "'"+apellido2+"','"+pais+"','"+fechaRegistro+"','"+fechaCumpleaños+"','"+categoria+"','"+telFijo+"','"+telMovil+"',"
                           + "'"+telFax+"','"+correo+"')";
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
    } //Fin método "ingresarContacto"
    
    //Método que permite mostrar los datos de una id de la tabla
    public void mostrarDatosId(String id,
                            javax.swing.JTextField campoNumeroContacto,
                            javax.swing.JTextField campoNombre,
                            javax.swing.JTextField campoApellido1,
                            javax.swing.JTextField campoApellido2,
                            javax.swing.JTextField campoPais,
                            javax.swing.JTextField campoFechaRegistro,
                            javax.swing.JTextField campoFechaCumpleaños,
                            javax.swing.JTextField campoCategoria,
                            javax.swing.JTextField campoTelFijo,
                            javax.swing.JTextField campoTelMovil,
                            javax.swing.JTextField campoTelFax,
                            javax.swing.JTextField campoCuentaCorreo){
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS WHERE IDENTIFICACION = '"+id+"'";
            cbd.stmt.execute(query);
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();
            if(rs != null){
                
                if(id.equals(rs.getString("IDENTIFICACION"))){
                    
                    //Asigna a cada parámetro los campos de la tabla que están en el rs
                    campoNumeroContacto.setText(rs.getString("NUMEROCONTACTO"));
                    campoNombre.setText(rs.getString("NOMBRE"));
                    campoApellido1.setText(rs.getString("APELLIDO1"));
                    campoApellido2.setText(rs.getString("APELLIDO2"));
                    campoPais.setText(rs.getString("PAIS"));
                    campoFechaRegistro.setText(rs.getString("FECHAREGISTRO"));
                    campoFechaCumpleaños.setText(rs.getString("FECHAANIVERSARIO"));
                    campoCategoria.setText(rs.getString("CATEGORIA"));
                    campoTelFijo.setText(rs.getString("TELEFONOFIJO"));
                    campoTelMovil.setText(rs.getString("TELEFONOMOVIL"));
                    campoTelFax.setText(rs.getString("TELEFONOFAX"));
                    campoCuentaCorreo.setText(rs.getString("CUENTACORREO"));
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
    } //Fin de "mostrarDatosId"
    
    //Método que permite mostrar los datos de un número de contacto de la tabla
    public void mostrarDatosNum(String numeroContacto,
                            javax.swing.JTextField campoId,
                            javax.swing.JTextField campoNombre,
                            javax.swing.JTextField campoApellido1,
                            javax.swing.JTextField campoApellido2,
                            javax.swing.JTextField campoPais,
                            javax.swing.JTextField campoFechaRegistro,
                            javax.swing.JTextField campoFechaCumpleaños,
                            javax.swing.JTextField campoCategoria,
                            javax.swing.JTextField campoTelFijo,
                            javax.swing.JTextField campoTelMovil,
                            javax.swing.JTextField campoTelFax,
                            javax.swing.JTextField campoCuentaCorreo){
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS WHERE NUMEROCONTACTO = '"+numeroContacto+"'";
            cbd.stmt.execute(query);
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();
            if(rs != null){
                
                if(numeroContacto.equals(rs.getString("NUMEROCONTACTO"))){
                    
                    //Asigna a cada parámetro los campos de la tabla que están en el rs
                    campoId.setText(rs.getString("IDENTIFICACION"));
                    campoNombre.setText(rs.getString("NOMBRE"));
                    campoApellido1.setText(rs.getString("APELLIDO1"));
                    campoApellido2.setText(rs.getString("APELLIDO2"));
                    campoPais.setText(rs.getString("PAIS"));
                    campoFechaRegistro.setText(rs.getString("FECHAREGISTRO"));
                    campoFechaCumpleaños.setText(rs.getString("FECHAANIVERSARIO"));
                    campoCategoria.setText(rs.getString("CATEGORIA"));
                    campoTelFijo.setText(rs.getString("TELEFONOFIJO"));
                    campoTelMovil.setText(rs.getString("TELEFONOMOVIL"));
                    campoTelFax.setText(rs.getString("TELEFONOFAX"));
                    campoCuentaCorreo.setText(rs.getString("CUENTACORREO"));
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
    } //Fin de "mostrarDatosNum"
    
    /*Método que permite mostrar los datos de una identificación de la tabla
      tabla CONTACTOS al momento de modificar un contacto*/
    public void mostrarDatosModificar(String id,
                            javax.swing.JTextField campoNombre,
                            javax.swing.JTextField campoApellido1,
                            javax.swing.JTextField campoApellido2,
                            javax.swing.JTextField campoPais,
                            javax.swing.JTextField campoFechaRegistro,
                            javax.swing.JTextField campoFechaCumpleaños,
                            javax.swing.JTextField campoTelFijo,
                            javax.swing.JTextField campoTelMovil,
                            javax.swing.JTextField campoTelFax,
                            javax.swing.JTextField campoCuentaCorreo,
                            javax.swing.JComboBox comboCategoria){
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS WHERE IDENTIFICACION = '"+id+"'";
            cbd.stmt.execute(query);
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();
            if(rs != null){
                
                if(id.equals(rs.getString("IDENTIFICACION"))){
                    
                    //Asigna a cada parámetro los campos de la tabla que están en el rs
                    campoNombre.setText(rs.getString("NOMBRE"));
                    campoApellido1.setText(rs.getString("APELLIDO1"));
                    campoApellido2.setText(rs.getString("APELLIDO2"));
                    campoPais.setText(rs.getString("PAIS"));
                    campoFechaRegistro.setText(rs.getString("FECHAREGISTRO"));
                    campoFechaCumpleaños.setText(rs.getString("FECHAANIVERSARIO"));
                    campoTelFijo.setText(rs.getString("TELEFONOFIJO"));
                    campoTelMovil.setText(rs.getString("TELEFONOMOVIL"));
                    campoTelFax.setText(rs.getString("TELEFONOFAX"));
                    campoCuentaCorreo.setText(rs.getString("CUENTACORREO"));
                    comboCategoria.setSelectedItem(rs.getString("CATEGORIA"));
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
    } //Fin de "mostrarDatosMoficar"
    
    /*Método que permite eliminar un contacto de la tabla CONTACTOS de base de 
      datos por medio de su id*/
    public boolean eliminarDatos(String id){
        
        boolean borrado = true;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "DELETE FROM CONTACTOS WHERE IDENTIFICACION = '"+id+"'";
            cbd.stmt.execute(query);//ejecuta la instruccion que esta en query
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
    } //Fin de "eliminarDatos"
    
    //Método que permite eliminar todos los contactos almacenados en la base de datos
    public boolean eliminarTodos(){
        
        boolean borrado = true;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "DELETE FROM CONTACTOS";
            cbd.stmt.execute(query);//ejecuta la instruccion que esta en query
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
    } //Fin de "eliminarTodos"
    
    //Metodo que permite modificar los datos de un contacto
    public boolean modificarDatos(String id,String nuevoNombre, String nuevoApellido1, String nuevoApellido2, String nuevoPais,
                             String nuevoCumpleaños, String nuevaCategoria, String nuevoTelFijo, String nuevoTelMovil,
                             String nuevoTelFax, String nuevoCorreo){
        try{
            
            cbd.conectarBaseAgenda();
            String query = "UPDATE CONTACTOS SET NOMBRE = '"+nuevoNombre+"',APELLIDO1 = '"+nuevoApellido1+"',APELLIDO2 = '"+nuevoApellido2+"',"
                           + "PAIS = '"+nuevoPais+"',FECHAANIVERSARIO= '"+nuevoCumpleaños+"',CATEGORIA= '"+nuevaCategoria+"',"
                           + "TELEFONOFIJO = '"+nuevoTelFijo+"',TELEFONOMOVIL = '"+nuevoTelMovil+"',TELEFONOFAX = '"+nuevoTelFax+"',"
                           + "CUENTACORREO = '"+nuevoCorreo+"' WHERE IDENTIFICACION = '"+id+"'";
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
    } //Fin de "modificarDatos"
    
    //
    public void cargarComboContactos(javax.swing.JComboBox comboContactos){
        
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS";
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();
            if(rs != null){
                
                do{
                    
                    comboContactos.addItem(rs.getString("IDENTIFICACION"));
                    rs.next();
                }while(rs != null);
            }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        finally{
            
            try{
                
                cbd.connect.close();
            }
            catch(Exception e){}
        }
    }
    
} //Fin de "modeloDatosContactos"
