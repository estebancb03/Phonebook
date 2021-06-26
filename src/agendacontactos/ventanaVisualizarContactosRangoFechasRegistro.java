/*
    Autor: Esteban Castañeda Blanco
    Descripción: clase JFrame para visualizar contactos de acuerdo a un nombre
 */
package agendacontactos;
import javax.swing.JOptionPane;

public class ventanaVisualizarContactosRangoFechasRegistro extends javax.swing.JFrame {

    //Se instancian clases 
    modeloDatosVisualizar mdv = new modeloDatosVisualizar();
    
    //Constructor
    public ventanaVisualizarContactosRangoFechasRegistro() {
        
        initComponents();
        this.setLocationRelativeTo(null); //Ubica el JFrame en el centro de la pantalla
        jTextFieldFechaInicio.requestFocus();
    }
//------------------------------------------------------------------------------
    //Métodos del programador
    
//------------------------------------------------------------------------------        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jSeparatorPrincipal = new javax.swing.JSeparator();
        jButtonAtras = new javax.swing.JButton();
        jSeparatorPrincipal2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContactosRangoFechas = new javax.swing.JTable();
        jButtonLimpiar = new javax.swing.JButton();
        jTextFieldFechaInicio = new javax.swing.JTextField();
        jSeparatorPrincipal5 = new javax.swing.JSeparator();
        jButtonBuscar = new javax.swing.JButton();
        jSeparatorPrincipal6 = new javax.swing.JSeparator();
        jSeparatorPrincipal7 = new javax.swing.JSeparator();
        jLabelFechaFin = new javax.swing.JLabel();
        jLabelFechaInicio = new javax.swing.JLabel();
        jTextFieldFechaFin = new javax.swing.JTextField();
        jSeparatorPrincipal8 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparatorPrincipal1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de contactos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal1.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Visualizar contactos por rango de fecha de registro");
        jPanelPrincipal1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 530, -1));
        jPanelPrincipal1.add(jSeparatorPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 610, 10));

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
        jPanelPrincipal1.add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, 40));
        jPanelPrincipal1.add(jSeparatorPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 550, 20));

        jTableContactosRangoFechas.setBackground(new java.awt.Color(0, 0, 0));
        jTableContactosRangoFechas.setForeground(new java.awt.Color(255, 255, 255));
        jTableContactosRangoFechas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido ", "Identificación", "Categoría", "Fecha Registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableContactosRangoFechas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTableContactosRangoFechas);

        jPanelPrincipal1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 550, 190));

        jButtonLimpiar.setBackground(new java.awt.Color(204, 0, 0));
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
        jPanelPrincipal1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 180, 40));

        jTextFieldFechaInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelPrincipal1.add(jTextFieldFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, 30));

        jSeparatorPrincipal5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelPrincipal1.add(jSeparatorPrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 10, 40));

        jButtonBuscar.setBackground(new java.awt.Color(204, 0, 0));
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
        jPanelPrincipal1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 190, 40));

        jSeparatorPrincipal6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelPrincipal1.add(jSeparatorPrincipal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 10, 50));
        jPanelPrincipal1.add(jSeparatorPrincipal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 550, 10));

        jLabelFechaFin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFechaFin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaFin.setText("Fecha de fin");
        jPanelPrincipal1.add(jLabelFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, 50));

        jLabelFechaInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaInicio.setText("Fecha de inicio");
        jPanelPrincipal1.add(jLabelFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 50));

        jTextFieldFechaFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelPrincipal1.add(jTextFieldFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 140, 30));

        jSeparatorPrincipal8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelPrincipal1.add(jSeparatorPrincipal8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 10, 40));

        getContentPane().add(jPanelPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 610, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondowallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jSeparatorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 260, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        
        if(JOptionPane.showConfirmDialog(null,"¿Está seguro de regresar al menú principal?") == JOptionPane.OK_OPTION){
            
            this.setVisible(false); //Cierra "ventanaConsultarContacto"
            new ventanaMenuPrincipal().setVisible(true); //Abre "ventanaMenuPrincipal"
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        
        new ventanaVisualizarContactosRangoFechasRegistro().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        if(jTextFieldFechaInicio.getText().equals("") || jTextFieldFechaFin.getText().equals("")){
            
            JOptionPane.showMessageDialog(null,"Faltan datos por rellenar","Error",JOptionPane.ERROR_MESSAGE,
            new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png")));
            jTextFieldFechaInicio.requestFocus();
        }
        else{
            
            mdv.cargarTablaContactosRangoFechas(jTableContactosRangoFechas,jTextFieldFechaInicio.getText(),jTextFieldFechaFin.getText());
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaVisualizarContactosRangoFechasRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaVisualizarContactosRangoFechasRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaVisualizarContactosRangoFechasRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaVisualizarContactosRangoFechasRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                
                new ventanaVisualizarContactosRangoFechasRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFechaFin;
    private javax.swing.JLabel jLabelFechaInicio;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelPrincipal1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorPrincipal;
    private javax.swing.JSeparator jSeparatorPrincipal1;
    private javax.swing.JSeparator jSeparatorPrincipal2;
    private javax.swing.JSeparator jSeparatorPrincipal5;
    private javax.swing.JSeparator jSeparatorPrincipal6;
    private javax.swing.JSeparator jSeparatorPrincipal7;
    private javax.swing.JSeparator jSeparatorPrincipal8;
    private javax.swing.JTable jTableContactosRangoFechas;
    private javax.swing.JTextField jTextFieldFechaFin;
    private javax.swing.JTextField jTextFieldFechaInicio;
    // End of variables declaration//GEN-END:variables
} //Fin de "ventanaConsultarContactoId"
