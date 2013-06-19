package ayudastrabajo;

import java.io.File;
import java.io.FileFilter;
import javax.swing.DefaultComboBoxModel;

public class AyudasTrabajo extends javax.swing.JFrame {

  public AyudasTrabajo() {
    initComponents();
    llenarCombo();
  }

  private void llenarCombo() {

    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    cmbListado.setModel(modeloCombo);

    String sDirectorio = ".";
    File f = new File(sDirectorio);
    String texto = null;
    if (f.exists()) { // El directorio existe
      File[] ficheros = f.listFiles(new Filtro(".xml"));
      //File[] ficheros = f.listFiles();
      for (int x = 0; x < ficheros.length; x++) {
        cmbListado.addItem(ficheros[x].getName());
      }
    } else { // Directorio no existe
      lblSalida.setText("<html><h1>Directorio no existe</h1></html>");
    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    cmbListado = new javax.swing.JComboBox();
    lblSalida = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    cmbListado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

    lblSalida.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblSalida.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    lblSalida.setFocusable(false);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(cmbListado, 0, 380, Short.MAX_VALUE)
          .addComponent(lblSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(cmbListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AyudasTrabajo().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox cmbListado;
  private javax.swing.JLabel lblSalida;
  // End of variables declaration//GEN-END:variables
}
