/*
    Descripción: Clase que contiene la lógica de la eliminación de todos los
                 contactos de la tabla CONTACTOS
    Autor: Esteban Castañeda Blanco
*/
package agendacontactos;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class eliminarTodosContactos {
    
    //Se instancian clases
    modeloDatosContactos mdc = new modeloDatosContactos();
    conexionBaseDeDatos cbd = new conexionBaseDeDatos();
    
    public void eliminarTodos(){
        
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM CONTACTOS";
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first(); //Ubica primer registro del "rs"
            if(rs != null){
                
                if(JOptionPane.showConfirmDialog(null,"Esta Seguro(a) de Eliminar Todos los Contactos?") == JOptionPane.OK_OPTION){
                    
                    if(mdc.eliminarTodos() == true){
                        
                        JOptionPane.showMessageDialog(null,"Los Contactos han Sido Eliminados","Infomacion",
                        JOptionPane.INFORMATION_MESSAGE,new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                    }
                    else{
                    
                        JOptionPane.showMessageDialog(null,"Los Contactos NO han Sido Eliminados","Advertencia",
                        JOptionPane.WARNING_MESSAGE,new javax.swing.ImageIcon(getClass().getResource("/Imagenes/advertencia.png")));
                    }
                }       
            }
            else{
                
                JOptionPane.showMessageDialog(null,"No hay contactos para eliminar","Error",JOptionPane.ERROR_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
            }
        }
        catch(Exception ex){
            
            System.out.println(ex);
        }
    }
}
