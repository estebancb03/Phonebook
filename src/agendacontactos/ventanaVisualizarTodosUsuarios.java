/*
    Autor: Esteban Castañeda Blanco
    Descripción: clase JFrame para consultar un contacto mediante la 
                 "IDENTIFICACIÓN"
 */
package agendacontactos;
import javax.swing.JOptionPane;

public class ventanaVisualizarTodosUsuarios extends javax.swing.JFrame {

    //Se instancian clases 
    modeloDatosVisualizar mdv = new modeloDatosVisualizar();
    
    //Constructor
    public ventanaVisualizarTodosUsuarios() {
        
        initComponents();
        this.setLocationRelativeTo(null); //Ubica el JFrame en el centro de la pantalla
        mdv.cargarTablaTodosUsuarios(jTableTodosUsuarios);
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
        jSeparatorPrincipal1 = new javax.swing.JSeparator();
        jSeparatorPrincipal2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTodosUsuarios = new javax.swing.JTable();
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
        jLabelTitulo.setText("Visualizar todos los usuarios");
        jPanelPrincipal1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 410, -1));
        jPanelPrincipal1.add(jSeparatorPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 10));

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
        jPanelPrincipal1.add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 550, 40));
        jPanelPrincipal1.add(jSeparatorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 550, 10));
        jPanelPrincipal1.add(jSeparatorPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 550, 20));

        jTableTodosUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        jTableTodosUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jTableTodosUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Identificación", "Nombre", "Nivel", "Fecha de registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTodosUsuarios.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTableTodosUsuarios);

        jPanelPrincipal1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 550, 260));

        getContentPane().add(jPanelPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 610, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondowallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        
        if(JOptionPane.showConfirmDialog(null,"¿Está seguro de regresar al menú principal?") == JOptionPane.OK_OPTION){
            
            this.setVisible(false); //Cierra "ventanaConsultarContacto"
            new ventanaMenuPrincipal().setVisible(true); //Abre "ventanaMenuPrincipal"
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaVisualizarTodosUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaVisualizarTodosUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaVisualizarTodosUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaVisualizarTodosUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new ventanaVisualizarTodosUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelPrincipal1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorPrincipal;
    private javax.swing.JSeparator jSeparatorPrincipal1;
    private javax.swing.JSeparator jSeparatorPrincipal2;
    private javax.swing.JTable jTableTodosUsuarios;
    // End of variables declaration//GEN-END:variables
} //Fin de "ventanaConsultarContactoId"
