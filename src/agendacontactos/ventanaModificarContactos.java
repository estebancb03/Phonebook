/*
    Autor: Esteban Castañeda Blanco
    Descripción: Clase JFrame de la ventana de registro de contactos
*/
package agendacontactos;
import agendacontactos.fechaSistema;
import agendacontactos.modeloDatosContactos;
import javax.swing.JOptionPane;

public class ventanaModificarContactos extends javax.swing.JFrame {

    //Se instancian clases
    modeloDatosContactos mdc = new modeloDatosContactos();
    
    //Constructor
    public ventanaModificarContactos() {
        
        initComponents();
        this.setLocationRelativeTo(null); //Centra el JFrame en la pantalla
        cargarCombo();
        bloquearObjetos();
    }
    //--------------------------------------------------------------------------
    //Métodos del programador
    
    //Método para bloquear los campos texto
    public void bloquearObjetos(){
        
        jTextFieldNombre.setEditable(false);
        jTextFieldApellido1.setEditable(false);
        jTextFieldApellido2.setEditable(false);
        jTextFieldPais.setEditable(false);
        jComboBoxCategoria.setEnabled(false);
        jTextFieldFechaRegistro.setEditable(false);
        jTextFieldCumpleaños.setEditable(false);
        jTextFieldTelFijo.setEditable(false);
        jTextFieldTelMovil.setEditable(false);
        jTextFieldTelFax.setEditable(false);
        jTextFieldCorreo.setEditable(false);
        
        jButtonEditar.setEnabled(false);
        jButtonGuardarCambios.setEnabled(false);
    } //Fin del "bloquearObjetos"
    
    //Método para desbloquear los campos texto
    public void desbloquearObjetos(){
        
        jTextFieldNombre.setEditable(true);
        jTextFieldApellido1.setEditable(true);
        jTextFieldApellido2.setEditable(true);
        jTextFieldPais.setEditable(true);
        jComboBoxCategoria.setEditable(true);
        jTextFieldCumpleaños.setEditable(true);
        jTextFieldTelFijo.setEditable(true);
        jTextFieldTelMovil.setEditable(true);
        jTextFieldTelFax.setEditable(true);
        jTextFieldCorreo.setEditable(true);
        jButtonEditar.setEnabled(true);
        jButtonGuardarCambios.setEnabled(true);
    } //Fin del "desbloquearObjetos"
    
    //Método para limpiar campos texto
    public void limpiarCamposTexto(){
        
        jTextFieldId.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellido1.setText("");
        jTextFieldApellido2.setText("");
        jTextFieldPais.setText("");
        jTextFieldFechaRegistro.setText("");
        jTextFieldCumpleaños.setText("");
        jTextFieldTelFijo.setText("");
        jTextFieldTelMovil.setText("");
        jTextFieldTelFax.setText("");
        jTextFieldCorreo.setText("");
        jTextFieldId.requestFocus();
        jTextFieldId.setEditable(true);
    } //Fin de "limpiarCamposTexto"
    
    //Método para agregar items al jComboBox
    public void cargarCombo(){
        
        jComboBoxCategoria.setEnabled(false);
        jComboBoxCategoria.addItem("Trabajo");
        jComboBoxCategoria.addItem("Colegio");
        jComboBoxCategoria.addItem("Amigos");
        jComboBoxCategoria.addItem("Personal");
    } //Fin "cargarCombo"
    
    //Método que modifica los datos en un registro
    public void modificarDatos(java.awt.event.ActionEvent evt){
        
        if(jTextFieldId.getText().equals("")|| jTextFieldNombre.getText().equals("")
           || jTextFieldApellido1.getText().equals("")|| jTextFieldApellido2.getText().equals("")
           || jTextFieldPais.getText().equals("") || jTextFieldFechaRegistro.getText().equals("")
           || jTextFieldCumpleaños.getText().equals("") || jTextFieldTelFijo.getText().equals("")
           || jTextFieldTelMovil.getText().equals("") || jTextFieldTelFax.getText().equals("")
           || jTextFieldCorreo.getText().equals(""))
        {
            
            JOptionPane.showMessageDialog(null, "Faltan datos por completar...", "Error", JOptionPane.ERROR_MESSAGE,
            new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
        }
        else{
            
            String categoria = "";
            categoria = String.valueOf(jComboBoxCategoria.getSelectedItem()); 
            if(mdc.modificarDatos(jTextFieldId.getText(), jTextFieldNombre.getText(),jTextFieldApellido1.getText(),jTextFieldApellido2.getText(), 
               jTextFieldPais.getText(),jTextFieldCumpleaños.getText(),categoria,
               jTextFieldTelFijo.getText(),jTextFieldTelMovil.getText(),
               jTextFieldTelFax.getText(),jTextFieldCorreo.getText()) == true)
            {
                
               JOptionPane.showMessageDialog(null,"Contacto ha sido modificado correctamente","Información",JOptionPane.INFORMATION_MESSAGE,
               new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
               jComboBoxCategoria.setSelectedItem("");
            }
            else{
                
                JOptionPane.showMessageDialog(null,"El contacto NO ha sido modificado","Información",JOptionPane.INFORMATION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
            }
        }
    } //Fin de "modificarDatos"
    //--------------------------------------------------------------------------

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jComboBoxCategoria = new javax.swing.JComboBox<>();
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
        jButtonEditar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jSeparatorPrincipal1 = new javax.swing.JSeparator();
        jSeparatorPrincipal2 = new javax.swing.JSeparator();
        jSeparatorPrincipal3 = new javax.swing.JSeparator();
        jSeparatorPrincipal4 = new javax.swing.JSeparator();
        jButtonBuscar = new javax.swing.JButton();
        jSeparatorPrincipal5 = new javax.swing.JSeparator();
        jButtonGuardarCambios = new javax.swing.JButton();
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
        jLabelTitulo.setText("Modificar contacto");
        jPanelPrincipal1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, -1));
        jPanelPrincipal1.add(jTextFieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, -1));
        jPanelPrincipal1.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, -1));
        jPanelPrincipal1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, -1));
        jPanelPrincipal1.add(jTextFieldPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 140, -1));
        jPanelPrincipal1.add(jTextFieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));
        jPanelPrincipal1.add(jTextFieldFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 140, -1));
        jPanelPrincipal1.add(jSeparatorPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 430, 10));
        jPanelPrincipal1.add(jTextFieldCumpleaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 140, -1));
        jPanelPrincipal1.add(jTextFieldTelFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 140, -1));
        jPanelPrincipal1.add(jTextFieldTelMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, -1));
        jPanelPrincipal1.add(jTextFieldTelFax, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 140, -1));
        jPanelPrincipal1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 200, -1));

        jPanelPrincipal1.add(jComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, 30));

        jLabelId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Identificación");
        jPanelPrincipal1.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 40));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        jPanelPrincipal1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 40));

        jLabelApellido1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelApellido1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido1.setText("Apellido #1");
        jPanelPrincipal1.add(jLabelApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));

        jLabelApellido2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelApellido2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido2.setText("Apellido #2");
        jPanelPrincipal1.add(jLabelApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 40));

        jLabelPais.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPais.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPais.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPais.setText("País");
        jPanelPrincipal1.add(jLabelPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 40));

        jLabelFechaRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaRegistro.setText("Registro");
        jPanelPrincipal1.add(jLabelFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 40));

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail");
        jPanelPrincipal1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 40));

        jLabelCumpleaños.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCumpleaños.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCumpleaños.setText("Cumpleaños");
        jPanelPrincipal1.add(jLabelCumpleaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 40));

        jLabelCategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setText("Categoría");
        jPanelPrincipal1.add(jLabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 50));

        jLabelTelFijo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTelFijo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelFijo.setText("Tel. Fijo");
        jPanelPrincipal1.add(jLabelTelFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 40));

        jLabelTelMovil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTelMovil.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelMovil.setText("Tel. Móvil");
        jPanelPrincipal1.add(jLabelTelMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 40));

        jLabelFax.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFax.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFax.setText("Fax");
        jPanelPrincipal1.add(jLabelFax, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, 40));

        jButtonEditar.setBackground(new java.awt.Color(0, 102, 0));
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
        jPanelPrincipal1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 120, 50));

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
        jPanelPrincipal1.add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 130, 50));

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
        jPanelPrincipal1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 120, 50));
        jPanelPrincipal1.add(jSeparatorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 250, 20));

        jSeparatorPrincipal2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelPrincipal1.add(jSeparatorPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 10, 100));
        jPanelPrincipal1.add(jSeparatorPrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 250, 20));
        jPanelPrincipal1.add(jSeparatorPrincipal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 250, 20));

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
        jPanelPrincipal1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 130, 50));
        jPanelPrincipal1.add(jSeparatorPrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 250, 20));

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
        jPanelPrincipal1.add(jButtonGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 250, 50));

        getContentPane().add(jPanelPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 610, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondowallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        
        if(JOptionPane.showConfirmDialog(null,"¿Está seguro de regresar al menú principal?") == JOptionPane.OK_OPTION){
            
            this.setVisible(false); //Cierra "ventanaRegistroContacto"
            new ventanaMenuPrincipal().setVisible(true); //Abre "ventanaMenuPrincipal"
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        
        limpiarCamposTexto();
        bloquearObjetos();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        jComboBoxCategoria.setEnabled(true);
        desbloquearObjetos();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        if(jTextFieldId.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Faltan datos por completar...", "Error", JOptionPane.ERROR_MESSAGE,
                    new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
            jTextFieldId.requestFocus();
        }
        else{
            
            if(mdc.buscarId(jTextFieldId.getText()) == true){
                
                jTextFieldId.setEditable(false);
                jButtonEditar.setEnabled(true);
                jButtonGuardarCambios.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Contacto encontrado, se mostrarán sus datos", "Informacion",
                JOptionPane.INFORMATION_MESSAGE,new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                mdc.mostrarDatosModificar(jTextFieldId.getText(),jTextFieldNombre,jTextFieldApellido1,jTextFieldApellido2, 
                jTextFieldPais,jTextFieldFechaRegistro,jTextFieldCumpleaños,jTextFieldTelFijo,
                jTextFieldTelMovil,jTextFieldTelFax,jTextFieldCorreo,jComboBoxCategoria);
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Contacto NO encontrado", "Informacion", JOptionPane.INFORMATION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
                //cargarCombo();
                jTextFieldId.setEditable(true);
                jTextFieldId.setText("");
                jTextFieldId.requestFocus();
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCambiosActionPerformed
        
        modificarDatos(evt);
        limpiarCamposTexto();
        bloquearObjetos();
        jTextFieldId.setEditable(true);
    }//GEN-LAST:event_jButtonGuardarCambiosActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaModificarContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaModificarContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaModificarContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaModificarContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new ventanaModificarContactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonGuardarCambios;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
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
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelTelFijo;
    private javax.swing.JLabel jLabelTelMovil;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelPrincipal1;
    private javax.swing.JSeparator jSeparatorPrincipal;
    private javax.swing.JSeparator jSeparatorPrincipal1;
    private javax.swing.JSeparator jSeparatorPrincipal2;
    private javax.swing.JSeparator jSeparatorPrincipal3;
    private javax.swing.JSeparator jSeparatorPrincipal4;
    private javax.swing.JSeparator jSeparatorPrincipal5;
    private javax.swing.JTextField jTextFieldApellido1;
    private javax.swing.JTextField jTextFieldApellido2;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldCumpleaños;
    private javax.swing.JTextField jTextFieldFechaRegistro;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldTelFax;
    private javax.swing.JTextField jTextFieldTelFijo;
    private javax.swing.JTextField jTextFieldTelMovil;
    // End of variables declaration//GEN-END:variables
} //Fin de "ventanaModificarContactos"
