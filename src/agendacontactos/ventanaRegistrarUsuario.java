/*
    Autor: Esteban Castañeda Blanco
    Descripción: Clase JFrame de la ventana de registro de usuarios
*/
package agendacontactos;
import javax.swing.JOptionPane;
import java.awt.*;
        
public class ventanaRegistrarUsuario extends javax.swing.JFrame {
    
    //Se instancian clases
    fechaSistema fecha = new fechaSistema();
    modeloDatosUsuarios mdu = new modeloDatosUsuarios();
    
    //Constructor
    public ventanaRegistrarUsuario() {
        
        initComponents();
        this.setLocationRelativeTo(null); //Ubica el JFrame en el centro de la pantalla
        cargarComboNivel();
        desplegarFechaSistema();
    }
    //--------------------------------------------------------------------------
    //Métodos del programador
    //Método para cargar el "jComboBoxNivel"
    public void cargarComboNivel(){
        
        jComboBoxNivel.addItem("Administrador");
        jComboBoxNivel.addItem("Operacional");
        jComboBoxNivel.addItem("Invitado");
    } //Fin método "cargarComboNivel"
    
    //Método que despliega la fecha del sistema
    public void desplegarFechaSistema(){
        
        jTextFieldFechaRegistro.setEditable(false);
        jTextFieldFechaRegistro.setText(""+fecha.formatoFecha());
    } //Fin del método "desplegarFechaSistema"
    
    //Método para limpiar los campos texto
    public void limpiarCamposTexto(){
        
        jTextFieldCorreo.setText("");
        jTextFieldUserName.setText("");
        jPasswordFieldContraseña.setText("");
        jTextFieldNombre.setText("");
        jTextFieldId.setText("");
        jTextFieldCorreo.requestFocus();
    }
    
    //Método para ingresar un contacto
    public void ingresarDatosUusario(java.awt.event.ActionEvent e){
        
        if(jTextFieldUserName.getText().equals("")|| jTextFieldId.getText().equals("")
            || jTextFieldNombre.getText().equals("")|| jTextFieldFechaRegistro.getText().equals("")
            || jTextFieldCorreo.getText().equals("") || jPasswordFieldContraseña.getText().equals(""))
        {
            
            JOptionPane.showMessageDialog(null, "Falatan datos por completar...", "Error", JOptionPane.ERROR_MESSAGE,
            new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
        }
        else{
            
            if(mdu.buscarLogin(jTextFieldUserName.getText()) == true){
                
                JOptionPane.showMessageDialog(null, "Username ya registrado", "Error", JOptionPane.ERROR_MESSAGE,
                 new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
            }
            else{
                
                String nivelUsuario = "";
                nivelUsuario = String.valueOf(jComboBoxNivel.getSelectedItem());
                //Asigna a direccion lo que el usuario selecciono en el combo
                if(mdu.ingresarUsuario(jTextFieldUserName.getText(),jTextFieldId.getText(),
                jTextFieldNombre.getText(),jTextFieldFechaRegistro.getText(),
                jTextFieldCorreo.getText(),nivelUsuario,jPasswordFieldContraseña.getText()) == true)
                {
                        
                    JOptionPane.showMessageDialog(null, "El usuario fue registrado correctamente...","Información",
                    JOptionPane.INFORMATION_MESSAGE,new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                }
                else{
                    
                    JOptionPane.showMessageDialog(null, "El usuario no pudo ser registrado","Advertencia",
                    JOptionPane.WARNING_MESSAGE,new javax.swing.ImageIcon(getClass().getResource("/Imagenes/advertencia.png")));
                }
            }
        }   
    } //Fin del método "ingresarDatosUsuario"
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
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jLabelNivel = new javax.swing.JLabel();
        jComboBoxNivel = new javax.swing.JComboBox<String>();
        jLabelFechaRegistro = new javax.swing.JLabel();
        jTextFieldFechaRegistro = new javax.swing.JTextField();
        jSeparatorPrincipal1 = new javax.swing.JSeparator();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jSeparatorPrincipal4 = new javax.swing.JSeparator();
        jSeparatorPrincipal5 = new javax.swing.JSeparator();
        jSeparatorPrincipal3 = new javax.swing.JSeparator();
        jSeparatorPrincipal2 = new javax.swing.JSeparator();
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
        jLabelTitulo.setText("Registrar usuario");
        jPanel1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, -1));

        jLabelId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Identificación");
        jPanel1.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 40));

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 150, -1));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 40));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 150, -1));

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail");
        jPanel1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 40));
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 200, -1));

        jLabelUsername.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setText("Username");
        jPanel1.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 40));

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, -1));

        jLabelContraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraseña.setText("Contraseña");
        jPanel1.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));

        jPasswordFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, -1));

        jLabelNivel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNivel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNivel.setText("Nivel");
        jPanel1.add(jLabelNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 50));

        jPanel1.add(jComboBoxNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 150, 30));

        jLabelFechaRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaRegistro.setText("Registro");
        jPanel1.add(jLabelFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 40));
        jPanel1.add(jTextFieldFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 150, -1));
        jPanel1.add(jSeparatorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 10));

        jButtonRegistrar.setBackground(new java.awt.Color(0, 102, 0));
        jButtonRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registraricono.png"))); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.setBorder(null);
        jButtonRegistrar.setBorderPainted(false);
        jButtonRegistrar.setContentAreaFilled(false);
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, 50));

        jButtonLimpiar.setBackground(new java.awt.Color(0, 0, 153));
        jButtonLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiaricono.png"))); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.setBorder(null);
        jButtonLimpiar.setBorderPainted(false);
        jButtonLimpiar.setContentAreaFilled(false);
        jButtonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 120, 50));

        jButtonAtras.setBackground(new java.awt.Color(204, 0, 0));
        jButtonAtras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasicono.png"))); // NOI18N
        jButtonAtras.setText("Atrás");
        jButtonAtras.setBorder(null);
        jButtonAtras.setBorderPainted(false);
        jButtonAtras.setContentAreaFilled(false);
        jButtonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 120, 50));
        jPanel1.add(jSeparatorPrincipal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 260, 20));
        jPanel1.add(jSeparatorPrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, 20));
        jPanel1.add(jSeparatorPrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 260, 10));

        jSeparatorPrincipal2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparatorPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 10, 50));

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

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
        ingresarDatosUusario(evt);
        limpiarCamposTexto();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        
        if(JOptionPane.showConfirmDialog(null,"¿Está seguro de regresar al menú principal?") == JOptionPane.OK_OPTION){
            this.setVisible(false); //Cierra "ventanaRegistrarUsuario"
            new ventanaMenuPrincipal().setVisible(true); //Abre "ventanaMenuPrincipal"
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
       
        limpiarCamposTexto();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jPasswordFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new ventanaRegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxNivel;
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
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JSeparator jSeparatorPrincipal1;
    private javax.swing.JSeparator jSeparatorPrincipal2;
    private javax.swing.JSeparator jSeparatorPrincipal3;
    private javax.swing.JSeparator jSeparatorPrincipal4;
    private javax.swing.JSeparator jSeparatorPrincipal5;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldFechaRegistro;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
} //Fin de "ventanaRegistrarUsuarios"
