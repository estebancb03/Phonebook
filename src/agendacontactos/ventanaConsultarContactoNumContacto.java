/*
    Autor: Esteban Castañeda Blanco
    Descripción: clase JFrame para consultar un contacto mediante el 
                 "NUMEROCONTACTO"
 */
package agendacontactos;
import javax.swing.JOptionPane;

public class ventanaConsultarContactoNumContacto extends javax.swing.JFrame {

    //Se instancian clases 
    modeloDatosContactos mdc = new modeloDatosContactos();
    
    //Constructor
    public ventanaConsultarContactoNumContacto() {
        
        initComponents();
        this.setLocationRelativeTo(null); //Ubica el JFrame en el centro de la pantalla
        bloquearObjetos();
    }
//------------------------------------------------------------------------------
    //Métodos del programador
    //Método para bloquear objetos
    public void bloquearObjetos(){
        
        jTextFieldId.setEditable(false);
        jTextFieldNombre.setEditable(false);
        jTextFieldApellido1.setEditable(false);
        jTextFieldApellido2.setEditable(false);
        jTextFieldPais.setEditable(false);
        jTextFieldCategoria.setEditable(false);
        jTextFieldFechaRegistro.setEditable(false);
        jTextFieldCumpleaños.setEditable(false);
        jTextFieldTelFijo.setEditable(false);
        jTextFieldTelMovil.setEditable(false);
        jTextFieldTelFax.setEditable(false);
        jTextFieldCorreo.setEditable(false);
        jTextFieldNumContacto.requestFocus(); 
    } //Fin de "bloquearObjetos"
    
    //Método para bloquear objetos
    public void desbloquearObjetos(){
        
        jTextFieldNumContacto.setEditable(true);
        jTextFieldId.setEditable(true);
        jTextFieldNombre.setEditable(true);
        jTextFieldApellido1.setEditable(true);
        jTextFieldApellido2.setEditable(true);
        jTextFieldPais.setEditable(true);
        jTextFieldCategoria.setEditable(true);
        jTextFieldCumpleaños.setEditable(true);
        jTextFieldTelFijo.setEditable(true);
        jTextFieldTelMovil.setEditable(true);
        jTextFieldTelFax.setEditable(true);
        jTextFieldCorreo.setEditable(true);
    } //Fin de "desbloquearObjetos"
    
    //Método para limpiar campos texto
    public void limpiarCamposTexto(){
        
        jTextFieldNumContacto.setText("");
        jTextFieldId.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellido1.setText("");
        jTextFieldApellido2.setText("");
        jTextFieldPais.setText("");
        jTextFieldCumpleaños.setText("");
        jTextFieldTelFijo.setText("");
        jTextFieldTelMovil.setText("");
        jTextFieldTelFax.setText("");
        jTextFieldCorreo.setText("");
        jTextFieldNumContacto.requestFocus();
    } //Fin de "limpiarCamposTexto"
//------------------------------------------------------------------------------        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldApellido1 = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPais = new javax.swing.JTextField();
        jTextFieldApellido2 = new javax.swing.JTextField();
        jTextFieldFechaRegistro = new javax.swing.JTextField();
        jSeparatorPrincipal = new javax.swing.JSeparator();
        jTextFieldCumpleaños = new javax.swing.JTextField();
        jTextFieldTelFijo = new javax.swing.JTextField();
        jTextFieldTelMovil = new javax.swing.JTextField();
        jTextFieldTelFax = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido1 = new javax.swing.JLabel();
        jLabelApellido2 = new javax.swing.JLabel();
        jLabelPais = new javax.swing.JLabel();
        jLabelFechaRegistro = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelCumpleaños = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelTelFijo = new javax.swing.JLabel();
        jLabelTelMovil = new javax.swing.JLabel();
        jLabelFax = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jSeparatorPrincipal1 = new javax.swing.JSeparator();
        jTextFieldCategoria = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jLabelNumContacto = new javax.swing.JLabel();
        jTextFieldNumContacto = new javax.swing.JTextField();
        jSeparatorPrincipal3 = new javax.swing.JSeparator();
        jSeparatorPrincipal4 = new javax.swing.JSeparator();
        jSeparatorPrincipal5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de contactos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal1.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Consultar contacto (Número de contacto)");
        jPanelPrincipal1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 540, -1));

        jTextFieldApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido1ActionPerformed(evt);
            }
        });
        jPanelPrincipal1.add(jTextFieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        jPanelPrincipal1.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, -1));
        jPanelPrincipal1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, -1));
        jPanelPrincipal1.add(jTextFieldPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, -1));
        jPanelPrincipal1.add(jTextFieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 140, -1));
        jPanelPrincipal1.add(jTextFieldFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 140, -1));
        jPanelPrincipal1.add(jSeparatorPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 540, 10));
        jPanelPrincipal1.add(jTextFieldCumpleaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 140, -1));
        jPanelPrincipal1.add(jTextFieldTelFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, -1));
        jPanelPrincipal1.add(jTextFieldTelMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 140, -1));
        jPanelPrincipal1.add(jTextFieldTelFax, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 140, -1));
        jPanelPrincipal1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 200, -1));

        jLabelId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Identificación");
        jPanelPrincipal1.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 40));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        jPanelPrincipal1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));

        jLabelApellido1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelApellido1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido1.setText("Apellido #1");
        jPanelPrincipal1.add(jLabelApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 40));

        jLabelApellido2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelApellido2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido2.setText("Apellido #2");
        jPanelPrincipal1.add(jLabelApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 40));

        jLabelPais.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPais.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPais.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPais.setText("País");
        jPanelPrincipal1.add(jLabelPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 40));

        jLabelFechaRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaRegistro.setText("Registro");
        jPanelPrincipal1.add(jLabelFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 40));

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail");
        jPanelPrincipal1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, 40));

        jLabelCumpleaños.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCumpleaños.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCumpleaños.setText("Cumpleaños");
        jPanelPrincipal1.add(jLabelCumpleaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 40));

        jLabelCategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setText("Categoría");
        jPanelPrincipal1.add(jLabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 60));

        jLabelTelFijo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTelFijo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelFijo.setText("Tel. Fijo");
        jPanelPrincipal1.add(jLabelTelFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 40));

        jLabelTelMovil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTelMovil.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelMovil.setText("Tel. Móvil");
        jPanelPrincipal1.add(jLabelTelMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, 40));

        jLabelFax.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFax.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFax.setText("Fax");
        jPanelPrincipal1.add(jLabelFax, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 40));

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
        jPanelPrincipal1.add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 120, 50));

        jButtonBuscar.setBackground(new java.awt.Color(0, 0, 153));
        jButtonBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscaricono.png"))); // NOI18N
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
        jPanelPrincipal1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 250, 50));
        jPanelPrincipal1.add(jSeparatorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 250, 10));
        jPanelPrincipal1.add(jTextFieldCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 140, -1));

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
        jPanelPrincipal1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 130, 50));

        jLabelNumContacto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNumContacto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumContacto.setText("Número ");
        jPanelPrincipal1.add(jLabelNumContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 40));
        jPanelPrincipal1.add(jTextFieldNumContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, -1));
        jPanelPrincipal1.add(jSeparatorPrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 250, 10));
        jPanelPrincipal1.add(jSeparatorPrincipal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 250, 10));

        jSeparatorPrincipal5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelPrincipal1.add(jSeparatorPrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 10, 50));

        getContentPane().add(jPanelPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 610, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondowallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        
        if(JOptionPane.showConfirmDialog(null,"¿Está seguro de regresar al menú principal?") == JOptionPane.OK_OPTION){
            
            this.setVisible(false); //Cierra "ventanaConsultarContacto"
            new ventanaMenuPrincipal().setVisible(true); //Abre "ventanaMenuPrincipal"
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        
        limpiarCamposTexto();
        jTextFieldNumContacto.setEditable(true);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        if(jTextFieldNumContacto.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Faltan datos por completar...", "Error",JOptionPane.ERROR_MESSAGE,
            new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
            jTextFieldNumContacto.requestFocus();
        }
        else{
            
            if(mdc.buscarNumContacto(jTextFieldNumContacto.getText()) == true){
                
                jTextFieldNumContacto.setEditable(false);
                JOptionPane.showMessageDialog(null, "El contacto encontrado, se mostraran sus datos", "Informacion", 
                JOptionPane.INFORMATION_MESSAGE,new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                mdc.mostrarDatosNum(jTextFieldNumContacto.getText(),jTextFieldId,jTextFieldNombre,jTextFieldApellido1,jTextFieldApellido2, 
                jTextFieldPais,jTextFieldFechaRegistro,jTextFieldCumpleaños,jTextFieldCategoria,jTextFieldTelFijo,
                jTextFieldTelMovil,jTextFieldTelFax,jTextFieldCorreo);
            }
            else{
                
                JOptionPane.showMessageDialog(null, "El contacto NO encontrado", "Informacion", JOptionPane.INFORMATION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                jTextFieldNumContacto.setEditable(true);
                jTextFieldNumContacto.setText("");
                jTextFieldNumContacto.requestFocus();
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(ventanaConsultarContactoNumContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaConsultarContactoNumContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaConsultarContactoNumContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaConsultarContactoNumContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaConsultarContactoNumContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido1;
    private javax.swing.JLabel jLabelApellido2;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCumpleaños;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFax;
    private javax.swing.JLabel jLabelFechaRegistro;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumContacto;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelTelFijo;
    private javax.swing.JLabel jLabelTelMovil;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelPrincipal1;
    private javax.swing.JSeparator jSeparatorPrincipal;
    private javax.swing.JSeparator jSeparatorPrincipal1;
    private javax.swing.JSeparator jSeparatorPrincipal3;
    private javax.swing.JSeparator jSeparatorPrincipal4;
    private javax.swing.JSeparator jSeparatorPrincipal5;
    private javax.swing.JTextField jTextFieldApellido1;
    private javax.swing.JTextField jTextFieldApellido2;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldCumpleaños;
    private javax.swing.JTextField jTextFieldFechaRegistro;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumContacto;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldTelFax;
    private javax.swing.JTextField jTextFieldTelFijo;
    private javax.swing.JTextField jTextFieldTelMovil;
    // End of variables declaration//GEN-END:variables
} //Fin de "ventanaConsultarContactoNumContacto"
