/*
    Autor: Esteban Castañeda Blanco
    Descripción: Clase JFrame de la ventana de registro de usuarios
*/
package agendacontactos;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
        
public class ventanaEliminarUsuario extends javax.swing.JFrame {
    
    //Se instancian clases
    modeloDatosUsuarios mdu = new modeloDatosUsuarios();
    conexionBaseDeDatos cbd = new conexionBaseDeDatos();
    
    //Constructor
    public ventanaEliminarUsuario() {
        
        initComponents();
        this.setLocationRelativeTo(null); //Ubica el JFrame en el centro de la pantalla
        bloquearObjetos();
    }
    //--------------------------------------------------------------------------
    //Métodos del programador
    
    //Metodo para bloquear objetos
    public void bloquearObjetos(){
        
        jTextFieldContraseña.setEditable(false);
        jTextFieldNombre.setEditable(false);
        jTextFieldId.setEditable(false);
        jTextFieldNivelUsuario.setEditable(false);
        jTextFieldFechaRegistro.setEditable(false);
        jTextFieldCorreo.setEditable(false);
        jButtonEliminar.setEnabled(false);
    } //Fin de "bloquearObjetos"
    
    //Método para limpiar los campos texto
    public void limpiarCamposTexto(){
        
        jTextFieldNivelUsuario.setText("");
        jTextFieldCorreo.setText("");
        jTextFieldUserName.setText("");
        jTextFieldContraseña.setText("");
        jTextFieldNombre.setText("");
        jTextFieldId.setText("");
        jTextFieldFechaRegistro.setText("");
        jButtonEliminar.setEnabled(false);
        jTextFieldUserName.setEditable(true);
        jTextFieldUserName.requestFocus();
    } //Fin de "limpiarCamposTexto"
    
    //Metodo para eliminar un usuario
    public void eliminaUsuario(java.awt.event.ActionEvent e){
        
        try{
            
            cbd.conectarBaseAgenda();
            String query = "SELECT * FROM contactos";
            ResultSet rs = cbd.stmt.executeQuery(query);
            //rs.first(); //Ubica primer registro del "rs"
            if(rs != null){
                
                if(JOptionPane.showConfirmDialog(null,"¿Está seguro de eliminar este usuario?") == JOptionPane.OK_OPTION){
                    
                    if(mdu.eliminarDatosUsuario(jTextFieldUserName.getText()) == true){
                        
                        JOptionPane.showMessageDialog(null,"El usuario ha sido eliminado correctamente","Infomacion",JOptionPane.INFORMATION_MESSAGE,
                        new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                        limpiarCamposTexto();
                    }
                    else{
                        
                        JOptionPane.showMessageDialog(null,"El usuario NO ha sido eliminado","Advertencia",JOptionPane.WARNING_MESSAGE,
                        new javax.swing.ImageIcon(getClass().getResource("/Imagenes/advertencia.png")));
                    }
                }
            }
            else{
                
                JOptionPane.showMessageDialog(null,"No hay usuarios para eliminar","Error",JOptionPane.ERROR_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
            }
        }
        catch(Exception ex){
            
            System.out.println(ex);
        }
    }
    
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldContraseña = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelNivel = new javax.swing.JLabel();
        jLabelFechaRegistro = new javax.swing.JLabel();
        jTextFieldFechaRegistro = new javax.swing.JTextField();
        jSeparatorPrincipal1 = new javax.swing.JSeparator();
        jButtonEliminar = new javax.swing.JButton();
        jButtonAtras1 = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jSeparatorPrincipal4 = new javax.swing.JSeparator();
        jSeparatorPrincipal5 = new javax.swing.JSeparator();
        jSeparatorPrincipal3 = new javax.swing.JSeparator();
        jSeparatorPrincipal2 = new javax.swing.JSeparator();
        jTextFieldNivelUsuario = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonEliminar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contactos");
        setMinimumSize(new java.awt.Dimension(380, 508));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Eliminar usuario");
        jPanel1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, -1));

        jLabelId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Identificación");
        jPanel1.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 40));

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 150, -1));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));
        jPanel1.add(jTextFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, -1));

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail");
        jPanel1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 40));
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 200, -1));

        jLabelUsername.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setText("Username");
        jPanel1.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 40));

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 150, -1));

        jLabelContraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraseña.setText("Contraseña");
        jPanel1.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 40));

        jLabelNivel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNivel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNivel.setText("Nivel");
        jPanel1.add(jLabelNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 60));

        jLabelFechaRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaRegistro.setText("Registro");
        jPanel1.add(jLabelFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 40));

        jTextFieldFechaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 150, -1));
        jPanel1.add(jSeparatorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 10));

        jButtonEliminar.setBackground(new java.awt.Color(0, 102, 0));
        jButtonEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminardatosicono.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setBorder(null);
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.setContentAreaFilled(false);
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 130, 50));

        jButtonAtras1.setBackground(new java.awt.Color(204, 0, 0));
        jButtonAtras1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAtras1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasicono.png"))); // NOI18N
        jButtonAtras1.setText("Atrás");
        jButtonAtras1.setBorder(null);
        jButtonAtras1.setBorderPainted(false);
        jButtonAtras1.setContentAreaFilled(false);
        jButtonAtras1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 50));

        jButtonLimpiar.setBackground(new java.awt.Color(0, 0, 153));
        jButtonLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiaricono.png"))); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.setBorder(null);
        jButtonLimpiar.setBorderPainted(false);
        jButtonLimpiar.setContentAreaFilled(false);
        jButtonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 130, 50));
        jPanel1.add(jSeparatorPrincipal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 280, 20));
        jPanel1.add(jSeparatorPrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 280, 20));
        jPanel1.add(jSeparatorPrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 280, 10));

        jSeparatorPrincipal2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparatorPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 10, 100));

        jTextFieldNivelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNivelUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNivelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 150, -1));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, -1));

        jButtonEliminar1.setBackground(new java.awt.Color(0, 102, 0));
        jButtonEliminar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscaricono.png"))); // NOI18N
        jButtonEliminar1.setText("Buscar");
        jButtonEliminar1.setToolTipText("");
        jButtonEliminar1.setBorder(null);
        jButtonEliminar1.setBorderPainted(false);
        jButtonEliminar1.setContentAreaFilled(false);
        jButtonEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondowallpaper2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        
        eliminaUsuario(evt);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras1ActionPerformed
       
        if(JOptionPane.showConfirmDialog(null,"¿Está seguro de regresar al menú principal?") == JOptionPane.OK_OPTION){
            
            this.setVisible(false); //Cierra "ventanaRegistrarUsuario"
            new ventanaMenuPrincipal().setVisible(true); //Abre "ventanaMenuPrincipal"
        }
    }//GEN-LAST:event_jButtonAtras1ActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        
        limpiarCamposTexto();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jTextFieldNivelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNivelUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNivelUsuarioActionPerformed

    private void jButtonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminar1ActionPerformed
        
        if(jTextFieldUserName.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Faltan datos por completar...", "Error", JOptionPane.ERROR_MESSAGE,
            new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
            jTextFieldId.requestFocus();
        }
        else{
            
            if(mdu.buscarLogin(jTextFieldUserName.getText()) == true){
                jTextFieldUserName.setEditable(false);
                jButtonEliminar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Usuario encontrado, se mostrarán sus datos", "Informacion", 
                JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                mdu.mostrarDatosLogin(jTextFieldUserName.getText(),jTextFieldId,jTextFieldFechaRegistro,jTextFieldNombre,
                                      jTextFieldCorreo,jTextFieldNivelUsuario,jTextFieldContraseña);
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Usuario NO encontrado", "Informacion", JOptionPane.INFORMATION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                jTextFieldUserName.setEditable(true);
                jTextFieldUserName.setText("");
                jTextFieldUserName.requestFocus();
            }
        }
    }//GEN-LAST:event_jButtonEliminar1ActionPerformed

    private void jTextFieldFechaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new ventanaEliminarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminar1;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFechaRegistro;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparatorPrincipal1;
    private javax.swing.JSeparator jSeparatorPrincipal2;
    private javax.swing.JSeparator jSeparatorPrincipal3;
    private javax.swing.JSeparator jSeparatorPrincipal4;
    private javax.swing.JSeparator jSeparatorPrincipal5;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldFechaRegistro;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNivelUsuario;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
} //Fin de "ventanaEliminarUsuario"
