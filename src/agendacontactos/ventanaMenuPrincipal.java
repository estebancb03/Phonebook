/*
    Descripción: Clase JFrame de la ventana principal
    Autor: Esteban Castañeda Blanco
*/
package agendacontactos;

import javax.swing.JOptionPane;

public class ventanaMenuPrincipal extends javax.swing.JFrame {

    //Se instancian clases
    eliminarTodosContactos etc = new eliminarTodosContactos();
    modeloDatosContactos mdc = new modeloDatosContactos();
    modeloDatosUsuarios mdu = new modeloDatosUsuarios();
    conexionBaseDeDatos cbd = new conexionBaseDeDatos();
    fechaSistema fs = new fechaSistema();
    
    //Constructor
    public ventanaMenuPrincipal() {
        
        initComponents();
        this.setLocationRelativeTo(null); //Centra el JFrame en la pantalla
        bloquearCamposTexto();
        bloquearOpcionesMenu(mdu.nivelUsuario);
    }

    //Métodos del programador
    
    //Metodo para bloquear campos texto
    public void bloquearCamposTexto(){
        
        jTextFieldNombre.setText(""+mdu.nombreUsuario);
        jTextFieldUserName.setText(""+mdu.loginUsuario);
        jTextFieldNivelUsuario.setText(""+mdu.nivelUsuario);
        jTextFieldFecha.setText(""+fs.formatoFecha());
        jTextFieldNombre.setEditable(false);
        jTextFieldUserName.setEditable(false);
        jTextFieldNivelUsuario.setEditable(false);
        jTextFieldFecha.setEditable(false);
    }
    
    //Método para eliminar todos los usuarios
    public void eliminaTodo(java.awt.event.ActionEvent e){
        
        etc.eliminarTodos();
    }
    
    /*Método para bloquear opciones de la agenda según el rango o nivel que poseea
    el usuario*/
    public void bloquearOpcionesMenu(String nivelUsuario){
        
        if(nivelUsuario.equals("Administrador")){
            
            jMenuItemUsuariosRegistrar.setEnabled(true);
            jMenuItemUsuariosModificar.setEnabled(true);
            jMenuItemUsuariosEliminar.setEnabled(true);
            jMenuItemContactosRegistrar.setEnabled(true);
            jMenuItemContactosConsultarId.setEnabled(true);
            jMenuItemContactosConsultarNum.setEnabled(true);
            jMenuItemContactosModificar.setEnabled(true);
            jMenuItemContactosEliminarContacto.setEnabled(true);
            jMenuItemContactosEliminarTodos.setEnabled(true);
            jMenuItemVisualizarUsuarios.setEnabled(true);
            jMenuItemVisualizarUsuariosNivel.setEnabled(true);
            jMenuItemVisualizarTodos.setEnabled(true);
            jMenuItemVisualizarCategoria.setEnabled(true);
            jMenuItemVisualizarCumpleaños.setEnabled(true);
            jMenuItemVisualizarRangoFecha.setEnabled(true);
            jMenuItemVisualizarNombre.setEnabled(true);
            jMenuItemCerrarSesion.setEnabled(true);
            jMenuItemSalir.setEnabled(true);
        }
        else{
            
            if(nivelUsuario.equals("Operacional")){
                
                jMenuItemUsuariosRegistrar.setEnabled(false);
                jMenuItemUsuariosModificar.setEnabled(false);
                jMenuItemUsuariosEliminar.setEnabled(false);
                jMenuItemContactosRegistrar.setEnabled(true);
                jMenuItemContactosConsultarId.setEnabled(true);
                jMenuItemContactosConsultarNum.setEnabled(true);
                jMenuItemContactosModificar.setEnabled(true);
                jMenuItemContactosEliminarContacto.setEnabled(false);
                jMenuItemContactosEliminarTodos.setEnabled(false);
                jMenuItemVisualizarUsuarios.setEnabled(true);
                jMenuItemVisualizarUsuariosNivel.setEnabled(true);
                jMenuItemVisualizarTodos.setEnabled(true);
                jMenuItemVisualizarCategoria.setEnabled(true);
                jMenuItemVisualizarCumpleaños.setEnabled(true);
                jMenuItemVisualizarRangoFecha.setEnabled(true);
                jMenuItemVisualizarNombre.setEnabled(true);
                jMenuItemCerrarSesion.setEnabled(true);
                jMenuItemSalir.setEnabled(true);
            }
            else{
                
                if(nivelUsuario.equals("Invitado")){
                    
                    jMenuItemUsuariosRegistrar.setEnabled(false);
                    jMenuItemUsuariosModificar.setEnabled(false);
                    jMenuItemUsuariosEliminar.setEnabled(false);
                    jMenuItemContactosRegistrar.setEnabled(false);
                    jMenuItemContactosConsultarId.setEnabled(true);
                    jMenuItemContactosConsultarNum.setEnabled(true);
                    jMenuItemContactosModificar.setEnabled(false);
                    jMenuItemContactosEliminarContacto.setEnabled(false);
                    jMenuItemContactosEliminarTodos.setEnabled(false);
                    jMenuItemVisualizarUsuarios.setEnabled(true);
                    jMenuItemVisualizarUsuariosNivel.setEnabled(true);
                    jMenuItemVisualizarTodos.setEnabled(true);
                    jMenuItemVisualizarCategoria.setEnabled(true);
                    jMenuItemVisualizarCumpleaños.setEnabled(true);
                    jMenuItemVisualizarRangoFecha.setEnabled(true);
                    jMenuItemVisualizarNombre.setEnabled(true);
                    jMenuItemCerrarSesion.setEnabled(true);
                    jMenuItemSalir.setEnabled(true);
                }
            }
        }
    }
    
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldUserName2 = new javax.swing.JTextField();
        jPanelPrincipal1 = new javax.swing.JPanel();
        jSeparatorPrincipal1 = new javax.swing.JSeparator();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelDescripcionTexto = new javax.swing.JPanel();
        jLabelTituloDescripcion = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabelNombre = new javax.swing.JLabel();
        jLabelNivelUsuario = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldNivelUsuario = new javax.swing.JTextField();
        jLabelImgDescripcion1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemUsuariosRegistrar = new javax.swing.JMenuItem();
        jMenuItemUsuariosModificar = new javax.swing.JMenuItem();
        jMenuItemUsuariosEliminar = new javax.swing.JMenuItem();
        jMenuContactos = new javax.swing.JMenu();
        jMenuItemContactosRegistrar = new javax.swing.JMenuItem();
        jMenuItemContactosConsultarNum = new javax.swing.JMenuItem();
        jMenuItemContactosConsultarId = new javax.swing.JMenuItem();
        jMenuItemContactosModificar = new javax.swing.JMenuItem();
        jMenuItemContactosEliminarContacto = new javax.swing.JMenuItem();
        jMenuItemContactosEliminarTodos = new javax.swing.JMenuItem();
        jMenuReportes = new javax.swing.JMenu();
        jMenuItemVisualizarUsuarios = new javax.swing.JMenuItem();
        jMenuItemVisualizarUsuariosNivel = new javax.swing.JMenuItem();
        jMenuItemVisualizarTodos = new javax.swing.JMenuItem();
        jMenuItemVisualizarCategoria = new javax.swing.JMenuItem();
        jMenuItemVisualizarCumpleaños = new javax.swing.JMenuItem();
        jMenuItemVisualizarRangoFecha = new javax.swing.JMenuItem();
        jMenuItemVisualizarNombre = new javax.swing.JMenuItem();
        jMenuAbandonar = new javax.swing.JMenu();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();

        jTextFieldUserName2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUserName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserName2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de contactos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal1.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelPrincipal1.add(jSeparatorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 430, 10));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Menú Principal");
        jPanelPrincipal1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, -1));

        jPanelDescripcionTexto.setBackground(new java.awt.Color(0, 0, 0));
        jPanelDescripcionTexto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloDescripcion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTituloDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloDescripcion.setText("¡Bienvenido de nuevo!");
        jPanelDescripcionTexto.add(jLabelTituloDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, -1));
        jPanelDescripcionTexto.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 360, 20));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        jPanelDescripcionTexto.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 30));

        jLabelNivelUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNivelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNivelUsuario.setText("Nivel");
        jPanelDescripcionTexto.add(jLabelNivelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 50, 30));

        jLabelUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario");
        jPanelDescripcionTexto.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 30));

        jLabelFecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText("Fecha");
        jPanelDescripcionTexto.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 60, 30));

        jTextFieldUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        jPanelDescripcionTexto.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 240, 30));

        jTextFieldFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });
        jPanelDescripcionTexto.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 240, 30));

        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanelDescripcionTexto.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 240, 30));

        jTextFieldNivelUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNivelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNivelUsuarioActionPerformed(evt);
            }
        });
        jPanelDescripcionTexto.add(jTextFieldNivelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 240, 30));

        jPanelPrincipal1.add(jPanelDescripcionTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 420, 270));

        jLabelImgDescripcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descrpcionproyecto.png"))); // NOI18N
        jPanelPrincipal1.add(jLabelImgDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 250));

        getContentPane().add(jPanelPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 600, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondowallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 480));

        jMenuBarPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBarPrincipal.setBorder(null);
        jMenuBarPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBarPrincipal.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        jMenuUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        jMenuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jMenuUsuarios.setText("Usuarios");
        jMenuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemUsuariosRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemUsuariosRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemUsuariosRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jMenuItemUsuariosRegistrar.setText("Registrar usuario");
        jMenuItemUsuariosRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemUsuariosRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosRegistrarActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemUsuariosRegistrar);

        jMenuItemUsuariosModificar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemUsuariosModificar.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemUsuariosModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificaricono.png"))); // NOI18N
        jMenuItemUsuariosModificar.setText("Modificar usuario");
        jMenuItemUsuariosModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemUsuariosModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosModificarActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemUsuariosModificar);

        jMenuItemUsuariosEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemUsuariosEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemUsuariosEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminardatosicono.png"))); // NOI18N
        jMenuItemUsuariosEliminar.setText("Eliminar usuario");
        jMenuItemUsuariosEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemUsuariosEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosEliminarActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemUsuariosEliminar);

        jMenuBarPrincipal.add(jMenuUsuarios);

        jMenuContactos.setBackground(new java.awt.Color(0, 0, 0));
        jMenuContactos.setForeground(new java.awt.Color(255, 255, 255));
        jMenuContactos.setText("Contactos");
        jMenuContactos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemContactosRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemContactosRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemContactosRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarcontacto.png"))); // NOI18N
        jMenuItemContactosRegistrar.setText("Registrar contactos");
        jMenuItemContactosRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemContactosRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContactosRegistrarActionPerformed(evt);
            }
        });
        jMenuContactos.add(jMenuItemContactosRegistrar);

        jMenuItemContactosConsultarNum.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemContactosConsultarNum.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemContactosConsultarNum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultarcontacto.png"))); // NOI18N
        jMenuItemContactosConsultarNum.setText("Consultar contacto por número de contacto");
        jMenuItemContactosConsultarNum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemContactosConsultarNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContactosConsultarNumActionPerformed(evt);
            }
        });
        jMenuContactos.add(jMenuItemContactosConsultarNum);

        jMenuItemContactosConsultarId.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemContactosConsultarId.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemContactosConsultarId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultarcontacto.png"))); // NOI18N
        jMenuItemContactosConsultarId.setText("Consultar contacto por identificación de contacto");
        jMenuItemContactosConsultarId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemContactosConsultarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContactosConsultarIdActionPerformed(evt);
            }
        });
        jMenuContactos.add(jMenuItemContactosConsultarId);

        jMenuItemContactosModificar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemContactosModificar.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemContactosModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificaricono.png"))); // NOI18N
        jMenuItemContactosModificar.setText("Modificar un contacto por número de contacto");
        jMenuItemContactosModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemContactosModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContactosModificarActionPerformed(evt);
            }
        });
        jMenuContactos.add(jMenuItemContactosModificar);

        jMenuItemContactosEliminarContacto.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemContactosEliminarContacto.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemContactosEliminarContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminardatosicono.png"))); // NOI18N
        jMenuItemContactosEliminarContacto.setText("Eliminar contacto por identificación");
        jMenuItemContactosEliminarContacto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemContactosEliminarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContactosEliminarContactoActionPerformed(evt);
            }
        });
        jMenuContactos.add(jMenuItemContactosEliminarContacto);

        jMenuItemContactosEliminarTodos.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemContactosEliminarTodos.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemContactosEliminarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminardatosicono.png"))); // NOI18N
        jMenuItemContactosEliminarTodos.setText("Eliminar todos los contactos");
        jMenuItemContactosEliminarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemContactosEliminarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContactosEliminarTodosActionPerformed(evt);
            }
        });
        jMenuContactos.add(jMenuItemContactosEliminarTodos);

        jMenuBarPrincipal.add(jMenuContactos);

        jMenuReportes.setBackground(new java.awt.Color(0, 0, 0));
        jMenuReportes.setForeground(new java.awt.Color(255, 255, 255));
        jMenuReportes.setText("Visualizar");
        jMenuReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemVisualizarUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemVisualizarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemVisualizarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visualizarcontacto.png"))); // NOI18N
        jMenuItemVisualizarUsuarios.setText("Visualizar usuarios");
        jMenuItemVisualizarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemVisualizarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarUsuariosActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemVisualizarUsuarios);

        jMenuItemVisualizarUsuariosNivel.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemVisualizarUsuariosNivel.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemVisualizarUsuariosNivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visualizarcontacto.png"))); // NOI18N
        jMenuItemVisualizarUsuariosNivel.setText("Visualizar usuarios por nivel");
        jMenuItemVisualizarUsuariosNivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemVisualizarUsuariosNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarUsuariosNivelActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemVisualizarUsuariosNivel);

        jMenuItemVisualizarTodos.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemVisualizarTodos.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemVisualizarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visualizarcontacto.png"))); // NOI18N
        jMenuItemVisualizarTodos.setText("Visualizar todos los contactos");
        jMenuItemVisualizarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemVisualizarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarTodosActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemVisualizarTodos);

        jMenuItemVisualizarCategoria.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemVisualizarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemVisualizarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visualizarcontacto.png"))); // NOI18N
        jMenuItemVisualizarCategoria.setText("Visualizar contactos por categoría");
        jMenuItemVisualizarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemVisualizarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarCategoriaActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemVisualizarCategoria);

        jMenuItemVisualizarCumpleaños.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemVisualizarCumpleaños.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemVisualizarCumpleaños.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visualizarcontacto.png"))); // NOI18N
        jMenuItemVisualizarCumpleaños.setText("Visualizar contactos por cumpleaños");
        jMenuItemVisualizarCumpleaños.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemVisualizarCumpleaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarCumpleañosActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemVisualizarCumpleaños);

        jMenuItemVisualizarRangoFecha.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemVisualizarRangoFecha.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemVisualizarRangoFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visualizarcontacto.png"))); // NOI18N
        jMenuItemVisualizarRangoFecha.setText("Visualizar contactos por rango de fecha");
        jMenuItemVisualizarRangoFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemVisualizarRangoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarRangoFechaActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemVisualizarRangoFecha);

        jMenuItemVisualizarNombre.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemVisualizarNombre.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemVisualizarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visualizarcontacto.png"))); // NOI18N
        jMenuItemVisualizarNombre.setText("Visualizar contactos por nombre");
        jMenuItemVisualizarNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemVisualizarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarNombreActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemVisualizarNombre);

        jMenuBarPrincipal.add(jMenuReportes);

        jMenuAbandonar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuAbandonar.setForeground(new java.awt.Color(255, 255, 255));
        jMenuAbandonar.setText("Abandonar");
        jMenuAbandonar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemCerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/saliricono.png"))); // NOI18N
        jMenuItemCerrarSesion.setText("Cerrar sesión");
        jMenuItemCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuAbandonar.add(jMenuItemCerrarSesion);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalir.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItemSalir.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/saliricono.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuAbandonar.add(jMenuItemSalir);

        jMenuBarPrincipal.add(jMenuAbandonar);

        setJMenuBar(jMenuBarPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemUsuariosRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosRegistrarActionPerformed
        
        this.setVisible(false);
        new ventanaRegistrarUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosRegistrarActionPerformed

    private void jMenuItemUsuariosModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosModificarActionPerformed
        
        this.setVisible(false);
        new ventanaModificarUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosModificarActionPerformed

    private void jMenuItemUsuariosEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosEliminarActionPerformed
        
        this.setVisible(false);
        new ventanaEliminarUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosEliminarActionPerformed

    private void jMenuItemContactosRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContactosRegistrarActionPerformed
       
        this.setVisible(false); //Oculta "ventanaMenuPrincipal"
        new ventanaRegistrarContactos().setVisible(true); //Muestra "ventanaRegistrarContactos"
    }//GEN-LAST:event_jMenuItemContactosRegistrarActionPerformed

    private void jMenuItemContactosConsultarNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContactosConsultarNumActionPerformed
        
        this.setVisible(false);
        new ventanaConsultarContactoNumContacto().setVisible(true);
    }//GEN-LAST:event_jMenuItemContactosConsultarNumActionPerformed

    private void jMenuItemContactosConsultarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContactosConsultarIdActionPerformed
        
        this.setVisible(false); //Oculta "ventanaMenuPrincipal"
        new ventanaConsultarContactoId().setVisible(true); //Muestra "ventanaConsultarContactoId"
    }//GEN-LAST:event_jMenuItemContactosConsultarIdActionPerformed

    private void jMenuItemContactosModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContactosModificarActionPerformed
        
        this.setVisible(false);
        new ventanaModificarContactos().setVisible(true);
    }//GEN-LAST:event_jMenuItemContactosModificarActionPerformed

    private void jMenuItemContactosEliminarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContactosEliminarContactoActionPerformed
        
        this.setVisible(false); //Oculta "ventanaMenuPrincipal"
        new ventanaEliminarContacto().setVisible(true); //Muestra "ventanaEliminarContacto"
    }//GEN-LAST:event_jMenuItemContactosEliminarContactoActionPerformed

    private void jMenuItemContactosEliminarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContactosEliminarTodosActionPerformed
        
        eliminaTodo(evt); //Invoca al método que elimina todos los contactos
    }//GEN-LAST:event_jMenuItemContactosEliminarTodosActionPerformed

    private void jMenuItemVisualizarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarUsuariosActionPerformed
        
        this.setVisible(false); //Oculta "ventanaMenuPrincipal"
        new ventanaVisualizarTodosUsuarios().setVisible(true); //Muestra "ventanaVisualizarTodosUsuarios"
    }//GEN-LAST:event_jMenuItemVisualizarUsuariosActionPerformed

    private void jMenuItemVisualizarUsuariosNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarUsuariosNivelActionPerformed
        
        this.setVisible(false); //Oculta "ventanaMenuPrincipal"
        new ventanaVisualizarUsuariosNivel().setVisible(true); //Muestra "ventanaVisualizarUsuariosNivel"
    }//GEN-LAST:event_jMenuItemVisualizarUsuariosNivelActionPerformed

    private void jMenuItemVisualizarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarTodosActionPerformed
        
        this.setVisible(false); //Oculta "ventanaMenuPrincipal"
        new ventanaVisualizarTodosContactos().setVisible(true); //Muestra "ventanaVisualizarTodosContactos"
    }//GEN-LAST:event_jMenuItemVisualizarTodosActionPerformed

    private void jMenuItemVisualizarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarCategoriaActionPerformed
        
        this.setVisible(false); //Oculta "ventanaMenuPrincipal"
        new ventanaVisualizarContactosCategoria().setVisible(true); //Muestra "ventanaVisualizarContactosCategoria"
    }//GEN-LAST:event_jMenuItemVisualizarCategoriaActionPerformed

    private void jMenuItemVisualizarCumpleañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarCumpleañosActionPerformed
        
        this.setVisible(false); //Oculta "ventanaMenuPrincipal"
        new ventanaVisualizarContactosCumpleaños().setVisible(true); //Muestra "ventanaVisualizarContactosCumpleaños"
    }//GEN-LAST:event_jMenuItemVisualizarCumpleañosActionPerformed

    private void jMenuItemVisualizarRangoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarRangoFechaActionPerformed
        
        this.setVisible(false); //Oculta "ventanaMenuPrincipal"
        new ventanaVisualizarContactosRangoFechasRegistro().setVisible(true); //Muestra "ventanaVisualizarContactosRangoFechasRegistro"
    }//GEN-LAST:event_jMenuItemVisualizarRangoFechaActionPerformed

    private void jMenuItemVisualizarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarNombreActionPerformed
        
        this.setVisible(false); //Oculta "ventanaMenuPrincipal"
        new ventanaVisualizarContactosRangoFechasRegistro().setVisible(true); //Muestra "ventanaVisualizarContactosRangoFechasRegistro"
    }//GEN-LAST:event_jMenuItemVisualizarNombreActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        
        JOptionPane.showMessageDialog(null, "La agenda de contactos ha sido abandonada", "Informacion", JOptionPane.INFORMATION_MESSAGE,
                                      new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed
        
        JOptionPane.showMessageDialog(null, "Sesión cerrada, ¡Hasta la próxima " + mdu.loginUsuario + "!","Información",
        JOptionPane.INFORMATION_MESSAGE,new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion.png")));
        this.setVisible(false);
        new ventanaInicioSesion().setVisible(true);
    }//GEN-LAST:event_jMenuItemCerrarSesionActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jTextFieldUserName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserName2ActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldNivelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNivelUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNivelUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new ventanaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelImgDescripcion1;
    private javax.swing.JLabel jLabelNivelUsuario;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloDescripcion;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenuAbandonar;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuContactos;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemContactosConsultarId;
    private javax.swing.JMenuItem jMenuItemContactosConsultarNum;
    private javax.swing.JMenuItem jMenuItemContactosEliminarContacto;
    private javax.swing.JMenuItem jMenuItemContactosEliminarTodos;
    private javax.swing.JMenuItem jMenuItemContactosModificar;
    private javax.swing.JMenuItem jMenuItemContactosRegistrar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemUsuariosEliminar;
    private javax.swing.JMenuItem jMenuItemUsuariosModificar;
    private javax.swing.JMenuItem jMenuItemUsuariosRegistrar;
    private javax.swing.JMenuItem jMenuItemVisualizarCategoria;
    private javax.swing.JMenuItem jMenuItemVisualizarCumpleaños;
    private javax.swing.JMenuItem jMenuItemVisualizarNombre;
    private javax.swing.JMenuItem jMenuItemVisualizarRangoFecha;
    private javax.swing.JMenuItem jMenuItemVisualizarTodos;
    private javax.swing.JMenuItem jMenuItemVisualizarUsuarios;
    private javax.swing.JMenuItem jMenuItemVisualizarUsuariosNivel;
    private javax.swing.JMenu jMenuReportes;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JPanel jPanelDescripcionTexto;
    private javax.swing.JPanel jPanelPrincipal1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparatorPrincipal1;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNivelUsuario;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JTextField jTextFieldUserName2;
    // End of variables declaration//GEN-END:variables
} //Fin de "ventanaMenuPrincipal"
