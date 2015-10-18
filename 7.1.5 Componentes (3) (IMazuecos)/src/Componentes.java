
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Componentes extends javax.swing.JFrame {

    public Componentes() {
        initComponents();
        txt.setFont(new java.awt.Font("Tahoma", 0, 12));
        fuente.add(calibri);
        fuente.add(comicsans);
        fuente.add(timesnewroman); //Si queremos que se escoja una única fuente para el texto, tenemos que meter los radio en un group, para solo escoger uno a la vez.
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fuente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        tamano = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mayus = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        calibri = new javax.swing.JRadioButtonMenuItem();
        comicsans = new javax.swing.JRadioButtonMenuItem();
        timesnewroman = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jToolBar2.setRollover(true);

        jLabel1.setText("Tamaño  ");
        jToolBar2.add(jLabel1);

        tamano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        tamano.setText("12");
        tamano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanoActionPerformed(evt);
            }
        });
        tamano.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tamanoPropertyChange(evt);
            }
        });
        jToolBar2.add(tamano);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");

        mayus.setText("Todo a Mayúsculas");
        mayus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayusActionPerformed(evt);
            }
        });
        jMenu2.add(mayus);

        jMenu3.setText("Fuente");

        calibri.setSelected(true);
        calibri.setText("Calibri");
        calibri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calibriActionPerformed(evt);
            }
        });
        jMenu3.add(calibri);

        comicsans.setSelected(true);
        comicsans.setText("Comic Sans");
        comicsans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comicsansActionPerformed(evt);
            }
        });
        jMenu3.add(comicsans);

        timesnewroman.setSelected(true);
        timesnewroman.setText("Times New Roman");
        timesnewroman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesnewromanActionPerformed(evt);
            }
        });
        jMenu3.add(timesnewroman);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    //Este método de convertir en mayúsculas modifica el texto entero y no una selección parcial. No es óptimo, pero es una prueba de la función.
    private void mayusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayusActionPerformed
        if(mayus.isSelected() == true){
            String s = txt.getText();
            s = s.toUpperCase();
            txt.setText(s);
        }else{
            String s = txt.getText();
            s = s.toLowerCase();
            txt.setText(s);
        }
    }//GEN-LAST:event_mayusActionPerformed

    private void tamanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanoActionPerformed
        
    }//GEN-LAST:event_tamanoActionPerformed

    //Como con el método de mayus, este método de cmabiar el tamaño del texto modifica el texto al completo.
    private void tamanoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tamanoPropertyChange
        try{
            int i = Integer.parseInt(tamano.getText());
            if(i < 0){
                JOptionPane.showMessageDialog(null, "Por favor, elija un tamaño mayor de 0");
            }else if(i <= 500){
                txt.setFont(new java.awt.Font("Tahoma", 0, i));
            }else{
                JOptionPane.showMessageDialog(null, "Por favor, elija un tamaño menor de 500");
            }
            
        }catch(Exception e){
            tamano.setText("0");
        }
    }//GEN-LAST:event_tamanoPropertyChange

    private void calibriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calibriActionPerformed
        try{
            int i = Integer.parseInt(tamano.getText());
            if(calibri.isSelected() == true){
                txt.setFont(new java.awt.Font("Calibri", 0, i));
            }else{
                txt.setFont(new java.awt.Font("Tahoma", 0, i));
            }
        }catch(Exception e){
            tamano.setText("0");
        }
    }//GEN-LAST:event_calibriActionPerformed

    private void comicsansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comicsansActionPerformed
        try{
            int i = Integer.parseInt(tamano.getText());
            if(comicsans.isSelected() == true){
                txt.setFont(new java.awt.Font("Comic Sans", 0, i));
            }else{
                txt.setFont(new java.awt.Font("Tahoma", 0, i));
            }
        }catch(Exception e){
            tamano.setText("0");
        }
    }//GEN-LAST:event_comicsansActionPerformed

    private void timesnewromanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesnewromanActionPerformed
        try{
            int i = Integer.parseInt(tamano.getText());
            if(comicsans.isSelected() == true){
                txt.setFont(new java.awt.Font("Times New Roman", 0, i));
            }else{
                txt.setFont(new java.awt.Font("Tahoma", 0, i));
            }
        }catch(Exception e){
            tamano.setText("0");
        }
    }//GEN-LAST:event_timesnewromanActionPerformed

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
    private javax.swing.JRadioButtonMenuItem calibri;
    private javax.swing.JRadioButtonMenuItem comicsans;
    private javax.swing.ButtonGroup fuente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    public javax.swing.JCheckBoxMenuItem mayus;
    public javax.swing.JFormattedTextField tamano;
    private javax.swing.JRadioButtonMenuItem timesnewroman;
    public javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}