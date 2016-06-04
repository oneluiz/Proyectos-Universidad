    public void buscar_arreglo(){
        String cod = JOptionPane.showInputDialog("DIGITE EL CONSEGUTIVO A BUSCAR");
        if(cod.equals("") || cod.equals("null")){
            JOptionPane.showMessageDialog(null, "DIGITE UN DATO","OPERACION CANCELAR",JOptionPane.ERROR_MESSAGE);
        }else{
            int consec = Integer.parseInt(cod);
            if(contador > 0){
                for(int i = 0; i < contador; i++){
                    if(user[i].getConsecutivo() == consec){
                        cedula_txt.setText(String.valueOf(user[i].getCedula()));
                        nombre_txt.setText(String.valueOf(user[i].getNombre()));
                        telefono_txt.setText(String.valueOf(user[i].getTelefono()));
                    }
                }
            }else{
            
            }
        }
    }
    
        int consecutivo = 0;
    String cedula ="";
    String nombre ="";
    String apellidos="";
    public int getConsecutivo() {
        return consecutivo;
    }
    
    
    
    
    
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import Clases.usua;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class formulario_arreglo extends javax.swing.JFrame {

   int contador = 0;
   int consecutivo = 1;
   usua user[] = new usua[3];
           
    
    public formulario_arreglo() {
        initComponents();
    }
public void almacenar_arreglo(String ced,String nom,String tel){
if (contador>=3){
JOptionPane.showMessageDialog(null,"no se puede ingresar mas datos");

}else{

    usua datos = new usua();
datos.setconsecutivo(consecutivo);
datos.setcedula(ced);
datos.setnombre(nom);
datos.settelefono(tel);
user [contador] = datos;
consecutivo++;
contador++;
}
}
public void limpiar (){

cedula_txt.setText("");
nombre_txt.setText("");
telefono_txt.setText("");
} 
public void mostrar(){
DefaultTableModel model = (DefaultTableModel) tabla_tbl.getModel();
int fila = 0;
for(int i = 0;i<contador;i++){
model.setRowCount(fila+1);
model.setValueAt(user[i].getconsecutivo(),i,0);
model.setValueAt(user[i].getcedula(),i,1);
model.setValueAt(user[i].getnombre(),i,2);
model.setValueAt(user[i].gettelefono(),i,3);
fila++;
}
}
public void busca_arreglo(){
String cod=JOptionPane.showInputDialog("DIGITE EL CONSECUTIVO A BUSCAR");
if(cod.equals("")||cod.equals("null")){
    JOptionPane.showMessageDialog(null, "DIGITE UN DATO","OPERACION CANCELAR",JOptionPane.ERROR_MESSAGE);
}else{
    int consec= Integer.parseInt(cod);
    if (contador >0){
        for (int i=0; i < contador;i++);
        if(user[1].getconsecutivo()==consec){
            int i = 0;
            cedula_txt.setText(String.valueOf(user[i].getcedula()));
             nombre_txt.setText(String.valueOf(user[i].getnombre()));
               telefono_txt.setText(String.valueOf(user[i].gettelefono()));
        }
        
    }
}
}
public void eliminar_del_arreglo(){
   usua arreglo_temporal[]=new usua[contador-1];
   int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el consecutivo a eliminar"));
    if (c <=contador){
   for (int i=0;i<contador;i++){
   if (c== user [i].getconsecutivo()){
       continue;
   }else{
       if (user [i].getconsecutivo()<c)
       arreglo_temporal[i]=user [i];
       if (user[i].getconsecutivo()>c){
       user[i].setconsecutivo(consecutivo);
       arreglo_temporal[i-1]=user[i];
      }
         }
        }
      }
   } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cedula_txt = new javax.swing.JTextField();
        nombre_txt = new javax.swing.JTextField();
        telefono_txt = new javax.swing.JTextField();
        agregar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        mostrar_btn = new javax.swing.JButton();
        limpiar_btn = new javax.swing.JButton();
        buscar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("cedula");

        jLabel2.setText("nombre");

        jLabel3.setText("telefono");

        cedula_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_txtActionPerformed(evt);
            }
        });

        agregar_btn.setText("AGREGAR");
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });

        eliminar_btn.setText("ELIMINAR");
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        mostrar_btn.setText("MOSTRAR");
        mostrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_btnActionPerformed(evt);
            }
        });

        limpiar_btn.setText("LIMPIAR");

        buscar_btn.setText("BUSCAR");
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        salir_btn.setText("SALIR");

        tabla_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CONSECUTIVO", "CEDULA", "NOMBRE", "TELEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_tbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cedula_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(nombre_txt)
                    .addComponent(telefono_txt))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregar_btn)
                    .addComponent(limpiar_btn))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminar_btn)
                    .addComponent(buscar_btn))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrar_btn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(salir_btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cedula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar_btn)
                    .addComponent(eliminar_btn)
                    .addComponent(mostrar_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar_btn)
                    .addComponent(buscar_btn)
                    .addComponent(salir_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        


    private void cedula_txtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
       
    }                                          

    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {                                            
      almacenar_arreglo(cedula_txt.getText(),nombre_txt.getText(),telefono_txt.getText());
      limpiar();
    }                                           

    private void mostrar_btnActionPerformed(java.awt.event.ActionEvent evt) {                                            
       mostrar ();
    }                                           

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        eliminar_del_arreglo();
        
    }                                            

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
            java.util.logging.Logger.getLogger(formulario_arreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario_arreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario_arreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario_arreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario_arreglo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton agregar_btn;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JTextField cedula_txt;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar_btn;
    private javax.swing.JButton mostrar_btn;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTable tabla_tbl;
    private javax.swing.JTextField telefono_txt;
    // End of variables declaration                   
}


    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
