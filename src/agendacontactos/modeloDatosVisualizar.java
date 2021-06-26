/*
    Descripción: Clase que contiene la lógica que maneja los procesos sobre las
                 tabla "CONTACTOS" y "USUARIOS" de la base de datos para 
                 las funciones de visualizar
    Autor: Esteban Castañeda Blanco
*/
package agendacontactos;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class modeloDatosVisualizar {
    
    //Se instancian clases
    conexionBaseDeDatos cbd = new conexionBaseDeDatos(); //Instancia de la clase "conexionBaseDeDatos"
    
    //Método para agregar una linea a las tablas
    public void agregarNuevaLinea(javax.swing.JTable tabla){
        
        DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        Object nuevaLinea [] = {"", "", "", "", ""}; //Las comillas dobles dependen las columnas que se reporten en la tabla
        dtm.addRow(nuevaLinea);
    }
    
    //Método que carga la tabla de todos los usuarios
    public void cargarTablaTodosUsuarios(javax.swing.JTable tablaTodosUsuarios){
        
        int linea = 0;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM USUARIOS ORDER BY NIVELUSUARIO";
            ResultSet rs = cbd.stmt.executeQuery(query);
            //Aqui se ejecuta la instruccion de SQL y los resultados los guarda en la variabl rs
            rs.first();
            if(rs != null){ 
                
                do{
                    
                    tablaTodosUsuarios.setValueAt(rs.getString("LOGINUSUARIO"), linea, 0);
                    tablaTodosUsuarios.setValueAt(rs.getString("IDENTIFICACION"), linea, 1);
                    tablaTodosUsuarios.setValueAt(rs.getString("NOMBREUSUARIO"), linea, 2);
                    tablaTodosUsuarios.setValueAt(rs.getString("NIVELUSUARIO"), linea, 3);
                    tablaTodosUsuarios.setValueAt(rs.getString("FECHAREGISTRO"), linea, 4);
                    linea++;
                    if(linea >= 4){
                        
                        agregarNuevaLinea(tablaTodosUsuarios);
                    }
                    rs.next();
                }while(rs!=null);
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
    }
    
    //Método que carga la tabla de todos los contactos
    public void cargarTablaTodosContactos(javax.swing.JTable tablaTodosContactos){
        
        int linea = 0;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS ORDER BY NUMEROCONTACTO";
            ResultSet rs = cbd.stmt.executeQuery(query);
            //Aqui se ejecuta la instruccion de SQL y los resultados los guarda en la variabl rs
            rs.first();
            if(rs != null){ 
                
                do{
                    
                    tablaTodosContactos.setValueAt(rs.getString("IDENTIFICACION"), linea, 0);
                    tablaTodosContactos.setValueAt(rs.getString("NOMBRE"), linea, 1);
                    tablaTodosContactos.setValueAt(rs.getString("APELLIDO1"), linea, 2);
                    tablaTodosContactos.setValueAt(rs.getString("PAIS"), linea, 3);
                    tablaTodosContactos.setValueAt(rs.getString("TELEFONOMOVIL"), linea, 4);
                    linea++;
                    if(linea >= 4){
                        
                        agregarNuevaLinea(tablaTodosContactos);
                    }
                    rs.next();
                }while(rs!=null);
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
    }
    
    //Método que carga la tabla de contactos por un determinado nombre
    public void cargarTablaContactosNombre(javax.swing.JTable tablaContactosNombre, String nombreContacto){
        
        int linea = 0;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS WHERE NOMBRE LIKE '"+nombreContacto+"%'";
            ResultSet rs = cbd.stmt.executeQuery(query);
            //Aqui se ejecuta la instruccion de SQL y los resultados los guarda en la variabl rs
            rs.first();
            if(rs != null){ 
                
                do{
                    
                    tablaContactosNombre.setValueAt(rs.getString("NOMBRE"), linea, 0);
                    tablaContactosNombre.setValueAt(rs.getString("APELLIDO1"), linea, 1);
                    tablaContactosNombre.setValueAt(rs.getString("APELLIDO2"), linea, 2);
                    tablaContactosNombre.setValueAt(rs.getString("FECHAANIVERSARIO"), linea, 3);
                    tablaContactosNombre.setValueAt(rs.getString("FECHAREGISTRO"), linea, 4);
                    linea++;
                    if(linea >= 4){
                        
                        agregarNuevaLinea(tablaContactosNombre);
                    }
                    rs.next();
                }while(rs!=null);
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
    }
    
    //Método que carga la tabla de usuarios por un determinado nivel
    public void cargarTablaUsuariosNivel(javax.swing.JTable tablaUsuariosNivel, String nivelUsuario){
        
        int linea = 0;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM USUARIOS WHERE NIVELUSUARIO LIKE '"+nivelUsuario+"%'";
            ResultSet rs = cbd.stmt.executeQuery(query);
            //Aqui se ejecuta la instruccion de SQL y los resultados los guarda en la variabl rs
            rs.first();
            if(rs != null){ 
                
                do{
                    
                    tablaUsuariosNivel.setValueAt(rs.getString("LOGINUSUARIO"), linea, 0);
                    tablaUsuariosNivel.setValueAt(rs.getString("NOMBREUSUARIO"), linea, 1);
                    tablaUsuariosNivel.setValueAt(rs.getString("IDENTIFICACION"), linea, 2);
                    tablaUsuariosNivel.setValueAt(rs.getString("FECHAREGISTRO"), linea, 3);
                    tablaUsuariosNivel.setValueAt(rs.getString("NIVELUSUARIO"), linea, 4);
                    linea++;
                    if(linea >= 4){
                        
                        agregarNuevaLinea(tablaUsuariosNivel);
                    }
                    rs.next();
                }while(rs!=null);
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
    }
    
    //Método que carga la tabla de usuarios por un determinado nivel
    public void cargarTablaContactosCategoria(javax.swing.JTable tablaContactosCategoria, String categoriaContacto){
        
        int linea = 0;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS WHERE CATEGORIA LIKE '"+categoriaContacto+"%'";
            ResultSet rs = cbd.stmt.executeQuery(query);
            //Aqui se ejecuta la instruccion de SQL y los resultados los guarda en la variabl rs
            rs.first();
            if(rs != null){ 
                
                do{
                    
                    tablaContactosCategoria.setValueAt(rs.getString("NOMBRE"), linea, 0);
                    tablaContactosCategoria.setValueAt(rs.getString("APELLIDO1"), linea, 1);
                    tablaContactosCategoria.setValueAt(rs.getString("TELEFONOFIJO"), linea, 2);
                    tablaContactosCategoria.setValueAt(rs.getString("TELEFONOMOVIL"), linea, 3);
                    tablaContactosCategoria.setValueAt(rs.getString("CATEGORIA"), linea, 4);
                    linea++;
                    if(linea >= 4){
                        
                        agregarNuevaLinea(tablaContactosCategoria);
                    }
                    rs.next();
                }while(rs!=null);
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
    }
    
    //Método que carga la tabla de contactos por un determinado nombre
    public void cargarTablaContactosCumpleaños(javax.swing.JTable tablaContactosCumpleaños, String fechaCumpleños){
        
        int linea = 0;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS WHERE FECHAANIVERSARIO LIKE '"+fechaCumpleños+"%'";
            ResultSet rs = cbd.stmt.executeQuery(query);
            //Aqui se ejecuta la instruccion de SQL y los resultados los guarda en la variabl rs
            rs.first();
            if(rs != null){ 
                
                do{
                    
                    tablaContactosCumpleaños.setValueAt(rs.getString("NOMBRE"), linea, 0);
                    tablaContactosCumpleaños.setValueAt(rs.getString("APELLIDO2"), linea, 1);
                    tablaContactosCumpleaños.setValueAt(rs.getString("IDENTIFICACION"), linea, 2);
                    tablaContactosCumpleaños.setValueAt(rs.getString("CATEGORIA"), linea, 3);
                    tablaContactosCumpleaños.setValueAt(rs.getString("FECHAANIVERSARIO"), linea, 4);
                    linea++;
                    if(linea >= 4){
                        
                        agregarNuevaLinea(tablaContactosCumpleaños);
                    }
                    rs.next();
                }while(rs!=null);
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
    }
    
    //Método que carga la tabla de contactos por un determinado rango entre fechas de registro
    public void cargarTablaContactosRangoFechas(javax.swing.JTable tablaContactosRangoFechas, String fechaInicio, String fechaFin){
        
        int linea = 0;
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS WHERE FECHAREGISTRO BETWEEN '"+fechaInicio+"' AND '"+fechaFin+"'";
            ResultSet rs = cbd.stmt.executeQuery(query);
            //Aqui se ejecuta la instruccion de SQL y los resultados los guarda en la variabl rs
            rs.first();
            if(rs != null){ 
                
                do{
                    
                    tablaContactosRangoFechas.setValueAt(rs.getString("NOMBRE"), linea, 0);
                    tablaContactosRangoFechas.setValueAt(rs.getString("APELLIDO1"), linea, 1);
                    tablaContactosRangoFechas.setValueAt(rs.getString("IDENTIFICACION"), linea, 2);
                    tablaContactosRangoFechas.setValueAt(rs.getString("CATEGORIA"), linea, 3);
                    tablaContactosRangoFechas.setValueAt(rs.getString("FECHAREGISTRO"), linea, 4);
                    linea++;
                    if(linea >= 4){
                        
                        agregarNuevaLinea(tablaContactosRangoFechas);
                    }
                    rs.next();
                }while(rs!=null);
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
    }
}
