/*
    Autor: Esteban Castañeda Blanco
    Descripción: Clase JFrame de la ventana de modificación de usuarios
*/
package agendacontactos;
import javax.swing.JOptionPane;
        
public class ventanaModificarUsuario extends javax.swing.JFrame {
    
    //Se instancian clases
    modeloDatosUsuarios mdu = new modeloDatosUsuarios();
    
    //Constructor
    public ventanaModificarUsuario() {
        
        initComponents();
        this.setLocationRelativeTo(null); //Ubica el JFrame en el centro de la pantalla
        cargarComboNivel();
        bloquearObjetos();
        jTextFieldUserName.setEditable(true);
    }
    //--------------------------------------------------------------------------
    //Métodos del programador
    
    //Método para cargar el "jComboBoxNivel"
    public void cargarComboNivel(){
        
        jComboBoxNivel.addItem("Administrador");
        jComboBoxNivel.addItem("Operacional");
        jComboBoxNivel.addItem("Invitado");
    } //Fin de "cargarComboNivel"
    
    //Método para limpiar los campos texto
    public void limpiarCamposTexto(){
        
        jTextFieldCorreo.setText("");
        jTextFieldUserName.setText("");
        jTextFieldContraseña.setText("");
        jTextFieldFechaRegistro.setText("");
        jTextFieldNombre.setText("");
        jTextFieldId.setText("");
        jTextFieldUserName.requestFocus();
    } //Fin de "limpiarCamposTexto"
    
    //Método para bloquear objetos
    public void bloquearObjetos(){
        
        jTextFieldUserName.setEditable(false);
        jTextFieldContraseña.setEditable(false);
        jTextFieldNombre.setEditable(false);
        jTextFieldId.setEditable(false);
        jTextFieldFechaRegistro.setEditable(false);
        jComboBoxNivel.setEnabled(false);
        jTextFieldCorreo.setEditable(false);
        jButtonEditar.setEnabled(false);
        jButtonGuardarCambios.setEnabled(false);
    } //Fin de "bloquearObjetos"
    
    //Método para desbloquear objetos
    public void desbloquearObjetos(){
        
        jTextFieldContraseña.setEditable(true);
        jTextFieldNombre.setEditable(true);
        jTextFieldId.setEditable(true);
        jComboBoxNivel.setEnabled(true);
        jTextFieldCorreo.setEditable(true);
    } //Fin de "bloquearObjetos"
    
    public void modificarDatos(java.awt.event.ActionEvent evt){
        
        if(jTextFieldUserName.getText().equals("")|| jTextFieldId.getText().equals("")
            || jTextFieldNombre.getText().equals("")|| jTextFieldCorreo.getText().equals("")
            || jTextFieldCorreo.getText().equals("") || jTextFieldFechaRegistro.getText().equals("")
            || jTextFieldContraseña.getText().equals(""))
        {
            
            JOptionPane.showMessageDialog(null, "Faltan datos por completar...", "Error", JOptionPane.ERROR_MESSAGE,
            new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
        }
        else{
            
            String nivel = "";
            nivel = String.valueOf(jComboBoxNivel.getSelectedItem()); 
            if(mdu.modificarDatosUsuario(jTextFieldUserName.getText(),jTextFieldId.getText(),jTextFieldNombre.getText(),
               jTextFieldCorreo.getText(),nivel,jTextFieldContraseña.getText()) == true)
            {
                
               JOptionPane.showMessageDialog(null,"El usuario ha sido modificado correctamente","Información",JOptionPane.INFORMATION_MESSAGE,
               new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png"))); 
               limpiarCamposTexto();
               bloquearObjetos();
               jTextFieldUserName.setEditable(true);
            }
            else{
                
                JOptionPane.showMessageDialog(null,"El usuario NO ha sido modificado","Información",JOptionPane.INFORMATION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
            }
        }
    } //Fin de "modificarDatos"
    
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelNivel = new javax.swing.JLabel();
        jComboBoxNivel = new javax.swing.JComboBox<String>();
        jSeparatorPrincipal1 = new javax.swing.JSeparator();
        jButtonGuardarCambios = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jSeparatorPrincipal4 = new javax.swing.JSeparator();
        jSeparatorPrincipal5 = new javax.swing.JSeparator();
        jSeparatorPrincipal3 = new javax.swing.JSeparator();
        jSeparatorPrincipal2 = new javax.swing.JSeparator();
        jButtonAtras = new javax.swing.JButton();
        jTextFieldContraseña = new javax.swing.JTextField();
        jSeparatorPrincipal6 = new javax.swing.JSeparator();
        jButtonEditar = new javax.swing.JButton();
        jLabelEmail1 = new javax.swing.JLabel();
        jTextFieldFechaRegistro = new javax.swing.JTextField();
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
        jLabelTitulo.setText("Modificar usuario");
        jPanel1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, -1));

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
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, -1));

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail");
        jPanel1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 40));
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 200, -1));

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
        jPanel1.add(jLabelNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 50));

        jPanel1.add(jComboBoxNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 150, 30));
        jPanel1.add(jSeparatorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 10));

        jButtonGuardarCambios.setBackground(new java.awt.Color(0, 102, 0));
        jButtonGuardarCambios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciosesion.png"))); // NOI18N
        jButtonGuardarCambios.setText("Guardar cambios");
        jButtonGuardarCambios.setBorder(null);
        jButtonGuardarCambios.setBorderPainted(false);
        jButtonGuardarCambios.setContentAreaFilled(false);
        jButtonGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 280, 40));

        jButtonBuscar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultarcontacto.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 140, 40));

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
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 140, 40));
        jPanel1.add(jSeparatorPrincipal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 280, 20));
        jPanel1.add(jSeparatorPrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 280, 20));
        jPanel1.add(jSeparatorPrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 280, 10));

        jSeparatorPrincipal2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparatorPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 10, 80));

        jButtonAtras.setBackground(new java.awt.Color(204, 0, 0));
        jButtonAtras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasicono.png"))); // NOI18N
        jButtonAtras.setText("Atrás");
        jButtonAtras.setBorder(null);
        jButtonAtras.setBorderPainted(false);
        jButtonAtras.setContentAreaFilled(false);
        jButtonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 140, 40));

        jTextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, -1));
        jPanel1.add(jSeparatorPrincipal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 280, 10));

        jButtonEditar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificaricono.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setBorder(null);
        jButtonEditar.setBorderPainted(false);
        jButtonEditar.setContentAreaFilled(false);
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 140, 40));

        jLabelEmail1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmail1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail1.setText("Registro");
        jPanel1.add(jLabelEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 50));

        jTextFieldFechaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 320, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondowallpaper2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jButtonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCambiosActionPerformed
        modificarDatos(evt);
    }//GEN-LAST:event_jButtonGuardarCambiosActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        if(jTextFieldUserName.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Faltan datos por completar...", "Error", JOptionPane.ERROR_MESSAGE,
            new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
            jTextFieldId.requestFocus();
        }
        else{
            
            if(mdu.buscarLogin(jTextFieldUserName.getText()) == true){
                
                jTextFieldUserName.setEnabled(false);
                jButtonEditar.setEnabled(true);
                jButtonGuardarCambios.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Usuario encontrado, se mostrarán sus datos", "Informacion", 
                JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                mdu.mostrarDatosModificarLogin(jTextFieldUserName.getText(),jTextFieldId,jTextFieldNombre,jTextFieldFechaRegistro,
                                      jTextFieldCorreo,jComboBoxNivel,jTextFieldContraseña,jComboBoxNivel);
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Usuario NO encontrado", "Informacion", JOptionPane.INFORMATION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                jTextFieldUserName.setEditable(true);
                jTextFieldUserName.setText("");
                jTextFieldUserName.requestFocus();
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        
        limpiarCamposTexto();
        bloquearObjetos();
        jTextFieldUserName.setEditable(true);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        
        if(JOptionPane.showConfirmDialog(null,"¿Está seguro de regresar al menú principal?") == JOptionPane.OK_OPTION){
            
            this.setVisible(false); //Cierra "ventanaRegistrarUsuario"
            new ventanaMenuPrincipal().setVisible(true); //Abre "ventanaMenuPrincipal"
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        desbloquearObjetos();
    }//GEN-LAST:event_jButtonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new ventanaModificarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonGuardarCambios;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmail1;
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
    private javax.swing.JSeparator jSeparatorPrincipal6;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldFechaRegistro;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
} //Fin de "ventanaModificarUsuario"
