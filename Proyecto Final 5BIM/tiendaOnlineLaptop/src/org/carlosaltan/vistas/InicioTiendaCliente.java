/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.carlosaltan.vistas;

/**
 *
 * @author Carlos Altán
 */
public class InicioTiendaCliente extends javax.swing.JFrame {

    /**
     * Creates new form InicioTiendaCliente
     */
    private static VistaCompra instanciaCompra = null;
    private static VerClientes instaClientes = null;
    
    public InicioTiendaCliente() {
        initComponents();
     //   lookAndFeel(); 
        setLocationRelativeTo(null);

    }
    /**
     * metodo con instancia compra 
     * @return  getinstanciaCompra
     */
     private synchronized VistaCompra getInstanciaCompra(){
        if (instanciaCompra == null){
            instanciaCompra = new VistaCompra();  
           instanciaCompra.setVisible(true);
           jEscritorioPrin.add(instanciaCompra);
        }else if (instanciaCompra.isVisible() == false){
            instanciaCompra.setVisible(true);
        //    jEscritorioPrin.add(instanciaDoctor); 
        }
        instanciaCompra.show();
        return instanciaCompra; 
    }
     /**
      * Metodo para instancia ver clientes
      * @return instanciaClientes
      */
      private synchronized VerClientes getVerClientes(){
        if (instaClientes == null){
            instaClientes = new VerClientes();  
           instaClientes.setVisible(true);
           jEscritorioPrin.add(instaClientes);
        }else if (instaClientes.isVisible() == false){
            instaClientes.setVisible(true);
        
        }
        instaClientes.show();
        return instaClientes; 
    }

    public void lookAndFeel(){
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioTiendaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioTiendaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioTiendaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioTiendaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorioPrin = new javax.swing.JDesktopPane();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEscritorioPrin.setBackground(new java.awt.Color(204, 204, 0));
        jEscritorioPrin.setForeground(new java.awt.Color(204, 204, 0));

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/carlosaltan/recursos/laptop kkk.jpg"))); // NOI18N

        jEscritorioPrin.setLayer(Back, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorioPrin.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jEscritorioPrinLayout = new javax.swing.GroupLayout(jEscritorioPrin);
        jEscritorioPrin.setLayout(jEscritorioPrinLayout);
        jEscritorioPrinLayout.setHorizontalGroup(
            jEscritorioPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioPrinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addContainerGap(1238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioPrinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
        );
        jEscritorioPrinLayout.setVerticalGroup(
            jEscritorioPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioPrinLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(Back)
                .addGap(15, 15, 15))
        );

        jMenu1.setText("Compras");

        jMenuItem1.setText("Comprar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Ver Compras");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEscritorioPrin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEscritorioPrin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Login login = new Login(); 
        this.dispose();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_BackActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        getInstanciaCompra(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        getVerClientes(); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JDesktopPane jEscritorioPrin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
