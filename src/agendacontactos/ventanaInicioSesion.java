/*
    Autor: Esteban Castañeda Blanco
    Descripción: Clase JFrame de la ventana de inicio de sesión de usuarios
*/
package agendacontactos;
import javax.swing.JOptionPane;
        
public class ventanaInicioSesion extends javax.swing.JFrame {
    
    //Se instancian clases
    modeloDatosUsuarios mdu = new modeloDatosUsuarios();
    
    //Constructor
    public ventanaInicioSesion() {
        
        initComponents();
        this.setLocationRelativeTo(null); //Ubica el JFrame en el centro de la pantalla
    }
    //--------------------------------------------------------------------------
    //Métodos del programador
    
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jSeparatorPrincipal5 = new javax.swing.JSeparator();
        jSeparatorPrincipal3 = new javax.swing.JSeparator();
        jLabelUsuarioAvatar = new javax.swing.JLabel();
        jButtonIniciarSesion = new javax.swing.JButton();
        jSeparatorPrincipal6 = new javax.swing.JSeparator();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        jLabelId1 = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contactos");
        setMinimumSize(new java.awt.Dimension(380, 508));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelar.setBackground(new java.awt.Color(0, 102, 0));
        jButtonCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminardatosicono.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 260, 70));
        jPanel1.add(jSeparatorPrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 260, 10));
        jPanel1.add(jSeparatorPrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 260, 10));

        jLabelUsuarioAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarioavatar.png"))); // NOI18N
        jLabelUsuarioAvatar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelUsuarioAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 130, 210));

        jButtonIniciarSesion.setBackground(new java.awt.Color(0, 102, 0));
        jButtonIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciosesion.png"))); // NOI18N
        jButtonIniciarSesion.setText("Iniciar sesión");
        jButtonIniciarSesion.setBorder(null);
        jButtonIniciarSesion.setBorderPainted(false);
        jButtonIniciarSesion.setContentAreaFilled(false);
        jButtonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 260, 70));
        jPanel1.add(jSeparatorPrincipal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 260, 20));

        jTextFieldUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 160, 30));

        jLabelId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Contraseña");
        jPanel1.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 50));

        jLabelId1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelId1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId1.setText("Usuario");
        jPanel1.add(jLabelId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 50));

        jPasswordFieldContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondowallpaper2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        JOptionPane.showMessageDialog(null, "La agenda de contactos ha sido abandonada", "Informacion", JOptionPane.INFORMATION_MESSAGE,
                                      new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        if(jTextFieldUserName.getText().equals("") || jPasswordFieldContraseña.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Faltan datos por completar...", "Error", JOptionPane.ERROR_MESSAGE,
            new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
        }
        else{
            
            if(mdu.buscarUsuario(jTextFieldUserName.getText(),jPasswordFieldContraseña.getText()) == true){
                
                JOptionPane.showMessageDialog(null, "¡Bienvenido de nuevo, " + mdu.loginUsuario + "!","Información",
                JOptionPane.INFORMATION_MESSAGE,new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                this.setVisible(false);
                new ventanaMenuPrincipal().setVisible(true);
            }
            else{
                
                JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos","Información",
                JOptionPane.INFORMATION_MESSAGE,new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                jTextFieldUserName.setText("");
                jPasswordFieldContraseña.setText("");
                //jCTextFieldUserName.requestFocus();
            }
        }
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void jCTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextFieldUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelId1;
    private javax.swing.JLabel jLabelUsuarioAvatar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorPrincipal3;
    private javax.swing.JSeparator jSeparatorPrincipal5;
    private javax.swing.JSeparator jSeparatorPrincipal6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
} //Fin de "ventanaInicioSesion"
