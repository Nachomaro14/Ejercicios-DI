
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Componentes extends javax.swing.JFrame {

    public Componentes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fileChooser = new javax.swing.JFileChooser();
        vistaPrevia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });
        fileChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fileChooserPropertyChange(evt);
            }
        });
        jPanel1.add(fileChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        vistaPrevia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(vistaPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 400, 330));

        jLabel1.setText("Si el archivo abierto es una imagen, se mostrará aquí:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 360, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        JFileChooser selectorArchivo = (JFileChooser)evt.getSource();
        String command = evt.getActionCommand();
        File archivoSeleccionado = selectorArchivo.getSelectedFile();
        String ruta = archivoSeleccionado.getAbsolutePath();
        String nombre = archivoSeleccionado.getName();
        if(command.equals(JFileChooser.APPROVE_SELECTION)){
            JOptionPane.showMessageDialog(null, "Ruta: " + ruta + "\n Archivo: " + nombre);
            if ((nombre != null) && nombre.toLowerCase().endsWith(".jpg") || nombre.toLowerCase().endsWith(".jpeg") || nombre.toLowerCase().endsWith(".gif") || nombre.toLowerCase().endsWith(".png")) {
                int w = vistaPrevia.getWidth();
                int h = vistaPrevia.getHeight();

                ImageIcon icon = new javax.swing.ImageIcon(ruta);

                Image img5 = icon.getImage() ;  
                Image newimg5 = img5.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH) ;  
                icon = new ImageIcon(newimg5);
                vistaPrevia.setIcon(icon);
            }
        }else if(command.equals(JFileChooser.CANCEL_SELECTION)){
            JOptionPane.showMessageDialog(this, "Selecciona un archivo");
        }
    }//GEN-LAST:event_fileChooserActionPerformed

    private void fileChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fileChooserPropertyChange
        
    }//GEN-LAST:event_fileChooserPropertyChange

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Componentes c = new Componentes();
                c.pack();
                c.setLocationRelativeTo(null);
                c.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel vistaPrevia;
    // End of variables declaration//GEN-END:variables
}