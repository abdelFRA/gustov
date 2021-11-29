package ventanas;
import Clases.Bebidas;
import Clases.Carta;
import Clases.Platos;
import Controlador.bd_Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
/**
 *
 * @author Frank
 */
public class frm_Menu extends javax.swing.JFrame {

   
    public frm_Menu() {
        initComponents();
        setSize(694,794);
        setResizable(false);
        setTitle("Menu");
        setLocationRelativeTo(null);
        //para evitar que el programa finalice al cerrar la interfaz de registro de usuario
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }

     //cambiar la imagen del logo de la taza 
    //Inicio
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
        return retValue;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox_Ceviche = new javax.swing.JComboBox<String>();
        jComboBox_CdePescado = new javax.swing.JComboBox<String>();
        jComboBox_LomoSaltado = new javax.swing.JComboBox<String>();
        jComboBox_AConMariscos = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox_GaseosaPersonal = new javax.swing.JComboBox<String>();
        jComboBox_GaseosaLitroMedio = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PICANTE DE POLLO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bs/. 20");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CHARQUEKAN");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Bs/. 25");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PIQUE MACHO ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bs/. 30");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PAILITA");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Bs/. 25");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        jComboBox_Ceviche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_Ceviche, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jComboBox_CdePescado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_CdePescado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jComboBox_LomoSaltado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_LomoSaltado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jComboBox_AConMariscos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_AConMariscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("PLATOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("MENU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("BEBIDAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("GASEOSAS");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("PERSONAL");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("1 1/2 Litro");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Bs/. 3");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Bs/. 8");
        jLabel37.setToolTipText("");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, 20));

        jComboBox_GaseosaPersonal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_GaseosaPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        jComboBox_GaseosaLitroMedio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_GaseosaLitroMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("TERMINAR ORDEN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/whatsapp_96px.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 100, 110));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //variables para recuperar datos
        String txt = "";
        int comboBox=0,comboBox1=0,comboBox2=0,comboBox3=0,comboBox4=0,comboBox5=0,comboBox6=0,comboBox7=0;
        int comboBox8=0,comboBox9=0,comboBox10=0,comboBox11=0,comboBox12=0,comboBox13=0,comboBox14=0;
        int cantidad = 0;
        double precio= 0;
        double monto= 0;
        int numerocarta=0;     
        Platos platos1 = new Platos();
        Carta carta1 = new Carta();
        Platos platos2 = new Platos();
        Carta carta2 = new Carta();
        Platos platos3 = new Platos();
        Carta carta3 = new Carta();
        Platos platos4 = new Platos();
        Carta carta4 = new Carta();
      
        Platos platos8 = new Platos();
        Carta carta8 = new Carta();
        Bebidas bebida1 = new Bebidas();
        Carta carta9 = new Carta ();
        Bebidas bebida2 = new Bebidas();
        Carta carta10 = new Carta ();
        Bebidas bebida3 = new Bebidas();
        Carta carta11 = new Carta ();
        Bebidas bebida4 = new Bebidas();
        Carta carta12 = new Carta ();
        Bebidas bebida5 = new Bebidas();
        Carta carta13 = new Carta ();
        Bebidas bebida6 = new Bebidas();
        Carta carta14 = new Carta ();
        Bebidas bebida7 = new Bebidas();
        Carta carta15 = new Carta ();
        //se obtiene el indice del comboBox
        if(jComboBox_Ceviche.getSelectedIndex()> 0){
            comboBox= jComboBox_Ceviche.getSelectedIndex();
            if (comboBox==1) {
                txt = "PICANTE POLLO";
                cantidad = 1;
                precio = 20;
                int numero = 1;
            } else if (comboBox==2) {
                txt = "PICANTE POLLO";
                cantidad = 2;
                precio = 20;
            }else if (comboBox==3) {
                txt = "PICANTE POLLO";
                cantidad = 3;
                precio = 20;
            }else if (comboBox==4) {
                txt = "PICANTE POLLO";
                cantidad = 4;
                precio = 20;
            }else if (comboBox==5) {
                txt = "PICANTE POLLO";
                cantidad = 5;
                precio = 20;
            }
            else if (comboBox==6) {
                txt = "PICANTE POLLO";
                cantidad = 6;
                precio = 20;
            }else if (comboBox==7) {
                txt = "PICANTE POLLO";
                cantidad = 7;
                precio = 20;
            }else if (comboBox==8) {
                txt = "PICANTE POLLO";
                cantidad = 8;
                precio = 20;
            }
            //ingresando datos a la clase
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            //iNGRESANDO DATOS A LA CLASE
            platos1.setDescripcion(txt);
            carta1.setDescripcion(txt);
            platos1.setCantidad(cantidad);
            carta1.setCantidad(cantidad);
            platos1.setPrecio(precio);
            carta1.setPrecio(precio);
            platos1.setMonto(monto);
            carta1.setMonto(monto);
            if ( con.insertarPlato(platos1)&con.insertarPedido(carta1) ) {
                //JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //segundo comboBOx
        if(jComboBox_CdePescado.getSelectedIndex()>0){
            comboBox1= jComboBox_CdePescado.getSelectedIndex();
            if (comboBox1==1) {
                txt = "CHARQUEKAN";
                cantidad = 1;
                precio = 25;
            } else if (comboBox1==2) {
                txt = "CHARQUEKAN";
                cantidad = 2;
                precio = 25;
            }else if (comboBox1==3) {
                txt = "CHARQUEKAN";
                cantidad = 3;
                precio = 25;
            }else if (comboBox1==4) {
                txt = "CHARQUEKAN";
                cantidad = 4;
                precio = 25;
            }else if (comboBox1==5) {
                txt = "CHARQUEKAN";
                cantidad = 5;
                precio = 25;
            }
            else if (comboBox1==6) {
                txt = "CHARQUEKAN";
                cantidad = 6;
                precio = 25;
            }else if (comboBox1==7) {
                txt = "CHARQUEKAN";
                cantidad = 7;
                precio = 25;
            }else if (comboBox1==8) {
                txt = "CHARQUEKAN";
                cantidad = 8;
                precio = 25;
            }

            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos2.setDescripcion(txt);
            carta2.setDescripcion(txt);
            platos2.setCantidad(cantidad);
            carta2.setCantidad(cantidad);
            platos2.setPrecio(precio);
            carta2.setPrecio(precio);
            platos2.setMonto(monto);
            carta2.setMonto(monto);
            if ( con.insertarPlato(platos2)&con.insertarPedido(carta2) ) {
               // JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //tercer combobox
        if(jComboBox_LomoSaltado.getSelectedIndex()>0){
            comboBox2= jComboBox_LomoSaltado.getSelectedIndex();
            if (comboBox2==1) {
                txt = "PIQUE MACHO";
                cantidad = 1;
                precio = 30;
            } else if (comboBox2==2) {
                txt = "PIQUE MACHO";
                cantidad = 2;
                precio = 30;
            }else if (comboBox2==3) {
                txt = "PIQUE MACHO";
                cantidad = 3;
                precio = 30;
            }else if (comboBox2==4) {
                txt = "PIQUE MACHO";
                cantidad = 4;
                precio = 30;
            }else if (comboBox2==5) {
                txt = "PIQUE MACHO";
                cantidad = 5;
                precio = 30;
            }
            else if (comboBox2==6) {
                txt = "PIQUE MACHO";
                cantidad = 6;
                precio = 30;
            }else if (comboBox2==7) {
                txt = "PIQUE MACHO";
                cantidad = 7;
                precio = 30;
            }else if (comboBox2==8) {
                txt = "PIQUE MACHO";
                cantidad = 8;
                precio = 30;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos3.setDescripcion(txt);
            carta3.setDescripcion(txt);
            platos3.setCantidad(cantidad);
            carta3.setCantidad(cantidad);
            platos3.setPrecio(precio);
            carta3.setPrecio(precio);
            platos3.setMonto(monto);
            carta3.setMonto(monto);
            if ( con.insertarPlato(platos3)&con.insertarPedido(carta3) ) {
               //JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //cuarto combobox
        if(jComboBox_AConMariscos.getSelectedIndex()>0){
            comboBox3=jComboBox_AConMariscos.getSelectedIndex();
            if (comboBox3==1) {
                txt = "PAILITA";
                cantidad = 1;
                precio = 25;
            } else if (comboBox3==2) {
                txt = "PAILITA";
                cantidad = 2;
                precio = 25;
            }else if (comboBox3==3) {
                txt = "PAILITA";
                cantidad = 3;
                precio = 25;
            }else if (comboBox3==4) {
                txt = "PAILITA";
                cantidad = 4;
                precio = 25;
            }else if (comboBox3==5) {
                txt = "PAILITA";
                cantidad = 5;
                precio = 25;
            }
            else if (comboBox3==6) {
                txt = "PAILITA";
                cantidad = 6;
                precio = 25;
            }else if (comboBox3==7) {
                txt = "PAILITA";
                cantidad = 7;
                precio = 25;
            }else if (comboBox3==8) {
                txt = "PAILITA";
                cantidad = 8;
                precio = 25;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos4.setDescripcion(txt);
            carta4.setDescripcion(txt);
            platos4.setCantidad(cantidad);
            carta4.setCantidad(cantidad);
            platos4.setPrecio(precio);
            carta4.setPrecio(precio);
            platos4.setMonto(monto);
            carta4.setMonto(monto);
            if ( con.insertarPlato(platos4)&con.insertarPedido(carta4) ) {
               // JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        
        //doceavo combobox
        if(jComboBox_GaseosaPersonal.getSelectedIndex()>0){
            comboBox11=jComboBox_GaseosaPersonal.getSelectedIndex();
            if (comboBox11==1) {
                txt = "GASEOSA PERSONAL";
                cantidad = 1;
                precio = 3;
            } else if (comboBox11==2) {
                txt = "GASEOSA PERSONAL";
                cantidad = 2;
                precio = 3;
            }else if (comboBox11==3) {
                txt = "GASEOSA PERSONAL";
                cantidad = 3;
                precio = 3;
            }else if (comboBox11==4) {
                txt = "GASEOSA PERSONAL";
                cantidad = 4;
                precio = 3;
            }else if (comboBox11==5) {
                txt = "GASEOSA PERSONAL";
                cantidad = 5;
                precio = 3;
            }
            else if (comboBox11==6) {
                txt = "GASEOSA PERSONAL";
                cantidad = 6;
                precio = 3;
            }else if (comboBox11==7) {
                txt = "GASEOSA PERSONAL";
                cantidad = 7;
                precio = 3;
            }else if (comboBox11==8) {
                txt = "GASEOSA PERSONAL";
                cantidad = 8;
                precio = 3;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida4.setDescripcion(txt);
            carta12.setDescripcion(txt);
            bebida4.setCantidad(cantidad);
            carta12.setCantidad(cantidad);
            bebida4.setPrecio(precio);
            carta12.setPrecio(precio);
            bebida4.setMonto(monto);
            carta12.setMonto(monto);
            if (con.insertarBebida(bebida4)&con.insertarPedido(carta12) ) {
              //  JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //treceavo combobox
        if(jComboBox_GaseosaLitroMedio.getSelectedIndex()>0){
            comboBox12=jComboBox_GaseosaLitroMedio.getSelectedIndex();
            if (comboBox12==1) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 1;
                precio = 8;
            } else if (comboBox12==2) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 2;
                precio = 8;
            }else if (comboBox12==3) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 3;
                precio = 8;
            }else if (comboBox12==4) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 4;
                precio = 8;
            }else if (comboBox12==5) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 5;
                precio = 8;
            }
            else if (comboBox12==6) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 6;
                precio = 8;
            }else if (comboBox12==7) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 7;
                precio = 8;
            }else if (comboBox12==8) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 8;
                precio = 8;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida5.setDescripcion(txt);
            carta13.setDescripcion(txt);
            bebida5.setCantidad(cantidad);
            carta13.setCantidad(cantidad);
            bebida5.setPrecio(precio);
            carta13.setPrecio(precio);
            bebida5.setMonto(monto);
            carta13.setMonto(monto);
            if (con.insertarBebida(bebida5)&con.insertarPedido(carta13) ) {
               // JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
       

        if (comboBox==0 && comboBox1==0 && comboBox2==0 && comboBox3==0 && comboBox4==0 && comboBox5==0 && comboBox6==0 && comboBox7==0
                && comboBox8==0 && comboBox9==0 && comboBox10==0 && comboBox11==0 && comboBox12==0 && comboBox13==0 && comboBox14==0) {
            JOptionPane.showMessageDialog(null, "NO PUEDES TERMINAR COMPRA SIN HABER ELEGIDO ALGUN PLATO/BEBIDA DEL MENU");
        }else{
            JOptionPane.showMessageDialog(null, "Pedido Registrado Correctamente");
            frm_Orden orden = new frm_Orden();
            orden.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
         jButton1.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        
         jButton1.setBackground(new Color(60,63,65));
    }//GEN-LAST:event_jButton1MouseExited

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
            java.util.logging.Logger.getLogger(frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_AConMariscos;
    private javax.swing.JComboBox<String> jComboBox_CdePescado;
    private javax.swing.JComboBox<String> jComboBox_Ceviche;
    private javax.swing.JComboBox<String> jComboBox_GaseosaLitroMedio;
    private javax.swing.JComboBox<String> jComboBox_GaseosaPersonal;
    private javax.swing.JComboBox<String> jComboBox_LomoSaltado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
