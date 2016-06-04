package arraylist;
import java.util.ArrayList;
import Clases.persona;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Persona_frm extends javax.swing.JFrame {
    
    ArrayList<persona> array = new ArrayList<persona>();

    public Persona_frm() {
        initComponents();
    }

        
    public void guardar_datos(String cedula, String nombre, String apellidos){
        array.add(new persona(cedula, nombre, apellidos));
    }
    
    public void limpiar(){
        cedula.setText("");
        nombre.setText("");
        apellidos.setText("");
    }
    
    public void mostrar_array(){
        DefaultTableModel model = (DefaultTableModel) tabla_mostrar.getModel();
        int fila = 0;
        for(int i = 0; i < array.size(); i++){
            model.setRowCount(fila+1);
            model.setValueAt(array.get(i).getCedula(), fila, 0);
            model.setValueAt(array.get(i).getNombre(), fila, 1);
            model.setValueAt(array.get(i).getApellidos(), fila, 2);
            fila++;
        }
    }
    
    public void editar(String cedula, String nombre, String apellidos){
        String valor;
        int indice;
        valor = JOptionPane.showInputDialog("Digite LA CEDULA A EDITAR");
        if(validar_existencia_array(valor)){
            indice = obtener_posicion_cedula(Integer.parseInt(valor));
            array.get(indice).setNombre(nombre);
            array.get(indice).setApellidos(apellidos);
        }else{
            JOptionPane.showMessageDialog(null, "NO EXISTE LA CEDULA");
        }
    }
    
    public int obtener_posicion_cedula(int cedula){
        int c = 0;
        for(int i = 0; i < array.size(); i++){
            if(Integer.valueOf(array.get(i).getCedula()) == cedula){
                c = i;
                break;   
            }
        }
        return c;
    }

    public boolean validar_existencia_array(String cedula){
        boolean ok = false;
        for(int i = 0; i < array.size(); i++){
            if(array.get(i).getCedula().equals(cedula)){
                ok = true;
                break;
            }
        }
        return ok;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        agregar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        mostrar_btn = new javax.swing.JButton();
        limpiar_btn = new javax.swing.JButton();
        editar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_mostrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("CEDULA");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("APELLIDOS");

        agregar_btn.setText("AGREGAR");
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });

        eliminar_btn.setText("ELIMINAR");

        mostrar_btn.setText("MOSTAR");
        mostrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_btnActionPerformed(evt);
            }
        });

        limpiar_btn.setText("LIMPIAR");
        limpiar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_btnActionPerformed(evt);
            }
        });

        editar_btn.setText("EDITAR");
        editar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_btnActionPerformed(evt);
            }
        });

        salir_btn.setText("SALIR");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        tabla_mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDOS"
            }
        ));
        jScrollPane1.setViewportView(tabla_mostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(nombre))))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(mostrar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(salir_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limpiar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar_btn)
                    .addComponent(eliminar_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrar_btn)
                    .addComponent(limpiar_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar_btn)
                    .addComponent(salir_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_btnActionPerformed
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_limpiar_btnActionPerformed

    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_btnActionPerformed
        // TODO add your handling code here:
        this.guardar_datos(cedula.getText(), nombre.getText(), apellidos.getText());
        this.limpiar();
    }//GEN-LAST:event_agregar_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salir_btnActionPerformed

    private void mostrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_btnActionPerformed
        // TODO add your handling code here:
        this.mostrar_array();
    }//GEN-LAST:event_mostrar_btnActionPerformed

    private void editar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_btnActionPerformed
        // TODO add your handling code here:
        this.editar(cedula.getText(), nombre.getText(), apellidos.getText());
        this.limpiar();
    }//GEN-LAST:event_editar_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Persona_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persona_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persona_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persona_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Persona_frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_btn;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton editar_btn;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar_btn;
    private javax.swing.JButton mostrar_btn;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTable tabla_mostrar;
    // End of variables declaration//GEN-END:variables
}
