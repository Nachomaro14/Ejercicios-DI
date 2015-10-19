import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.applet.AudioClip;
import javax.swing.JOptionPane;

public class Componentes extends javax.swing.JFrame {

    public Componentes() {
        initComponents();
        
        grupoButtons.add(buttonP1);
        grupoButtons.add(buttonP2);
        grupoButtons.add(buttonP3);
        grupoButtons.add(buttonP4);
        
        int w1 = f1.getWidth();
        int h1 = f1.getHeight();
        
        ImageIcon icon1 = new javax.swing.ImageIcon(getClass().getResource("icoCampo.jpg"));
        
        Image img1 = icon1.getImage() ;  
        Image newimg1 = img1.getScaledInstance(w1, h1, java.awt.Image.SCALE_SMOOTH) ;  
        icon1 = new ImageIcon(newimg1);
        f1.setIcon(icon1);
        
        ImageIcon icon2 = new javax.swing.ImageIcon(getClass().getResource("icoCiudad.jpg"));
        
        Image img2 = icon2.getImage() ;  
        Image newimg2 = img2.getScaledInstance(w1, h1, java.awt.Image.SCALE_SMOOTH) ;  
        icon2 = new ImageIcon(newimg2);
        f2.setIcon(icon2);
        
        ImageIcon icon3 = new javax.swing.ImageIcon(getClass().getResource("icoMontana.jpg"));
        
        Image img3 = icon3.getImage() ;  
        Image newimg3 = img3.getScaledInstance(w1, h1, java.awt.Image.SCALE_SMOOTH) ;  
        icon3 = new ImageIcon(newimg3);
        f3.setIcon(icon3);
        
        ImageIcon icon4 = new javax.swing.ImageIcon(getClass().getResource("icoPlaya.jpg"));
        
        Image img4 = icon4.getImage() ;  
        Image newimg4 = img4.getScaledInstance(w1, h1, java.awt.Image.SCALE_SMOOTH) ;  
        icon4 = new ImageIcon(newimg4);
        f4.setIcon(icon4);
        
        int ww1 = p1.getWidth();
        int hh1 = p1.getHeight();
        
        ImageIcon icon5 = new javax.swing.ImageIcon(getClass().getResource("icoVaquero.jpg"));
        
        Image img5 = icon5.getImage() ;  
        Image newimg5 = img5.getScaledInstance(ww1, hh1, java.awt.Image.SCALE_SMOOTH) ;  
        icon5 = new ImageIcon(newimg5);
        p1.setIcon(icon5);
        
        ImageIcon icon6 = new javax.swing.ImageIcon(getClass().getResource("icoAstronauta.png"));
        
        Image img6 = icon6.getImage() ;  
        Image newimg6 = img6.getScaledInstance(ww1, hh1, java.awt.Image.SCALE_SMOOTH) ;  
        icon6 = new ImageIcon(newimg6);
        p2.setIcon(icon6);
        
        ImageIcon icon7 = new javax.swing.ImageIcon(getClass().getResource("icoProgramador.png"));
        
        Image img7 = icon7.getImage() ;  
        Image newimg7 = img7.getScaledInstance(ww1, hh1, java.awt.Image.SCALE_SMOOTH) ;  
        icon7 = new ImageIcon(newimg7);
        p3.setIcon(icon7);
        
        ImageIcon icon8 = new javax.swing.ImageIcon(getClass().getResource("icoCocinero.jpg"));
        
        Image img8 = icon8.getImage() ;  
        Image newimg8 = img8.getScaledInstance(ww1, hh1, java.awt.Image.SCALE_SMOOTH) ;  
        icon8 = new ImageIcon(newimg8);
        p4.setIcon(icon8);
        
        ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("Default.jpg"));
        
        Image fot = fota.getImage();  
        Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
        fota = new ImageIcon(newfot);
        foto.setIcon(fota);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoButtons = new javax.swing.ButtonGroup();
        segundaParte = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        panelColor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRojo = new javax.swing.JButton();
        btnAzul = new javax.swing.JButton();
        btnAmarillo = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnBoton = new javax.swing.JToggleButton();
        txtEstado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inteligente = new javax.swing.JRadioButton();
        agradable = new javax.swing.JRadioButton();
        divertido = new javax.swing.JRadioButton();
        btnResumen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTexto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mayus = new javax.swing.JCheckBox();
        btnLeer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        buttonP1 = new javax.swing.JRadioButton();
        buttonP2 = new javax.swing.JRadioButton();
        buttonP3 = new javax.swing.JRadioButton();
        buttonP4 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        f2 = new javax.swing.JButton();
        f3 = new javax.swing.JButton();
        f4 = new javax.swing.JButton();
        f1 = new javax.swing.JButton();
        btnBigote = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btnSegunda = new javax.swing.JButton();

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelColor.setBackground(new java.awt.Color(255, 255, 255));
        panelColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelColor.setToolTipText("Este panel cambiará de color al pulsar los botones.");

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        panelColorLayout.setVerticalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jPanel4.add(panelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 80));

        jLabel2.setText("Cambia el color del JPanel pulsando los botones:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnRojo.setText("Rojo");
        btnRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRojoActionPerformed(evt);
            }
        });
        jPanel4.add(btnRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        btnAzul.setText("Azul");
        btnAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzulActionPerformed(evt);
            }
        });
        jPanel4.add(btnAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        btnAmarillo.setText("Amarillo");
        btnAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmarilloActionPerformed(evt);
            }
        });
        jPanel4.add(btnAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel4.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jLabel3.setText("-------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        btnBoton.setText("BOTÓN");
        btnBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotonActionPerformed(evt);
            }
        });
        jPanel4.add(btnBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 80, 80));

        txtEstado.setText("Estado del botón: SIN PULSAR");
        jPanel4.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel4.setText("-------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        inteligente.setText("Inteligente");
        jPanel4.add(inteligente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        agradable.setText("Agradable");
        agradable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agradableActionPerformed(evt);
            }
        });
        jPanel4.add(agradable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        divertido.setText("Divertido");
        jPanel4.add(divertido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        btnResumen.setText("Resumen");
        btnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenActionPerformed(evt);
            }
        });
        jPanel4.add(btnResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel5.setText("Selecciona tus cualidades:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, -1));
        jPanel4.add(txtTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 240, -1));

        jLabel6.setText("Escribe un texto breve:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        mayus.setText("Mayúsculas");
        jPanel4.add(mayus, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        jPanel4.add(btnLeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        javax.swing.GroupLayout segundaParteLayout = new javax.swing.GroupLayout(segundaParte.getContentPane());
        segundaParte.getContentPane().setLayout(segundaParteLayout);
        segundaParteLayout.setHorizontalGroup(
            segundaParteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        segundaParteLayout.setVerticalGroup(
            segundaParteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 230, 250));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Personaje"));

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setOpaque(true);

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.setOpaque(true);

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p3.setOpaque(true);

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.setOpaque(true);

        buttonP1.setBackground(new java.awt.Color(255, 255, 204));

        buttonP2.setBackground(new java.awt.Color(102, 102, 255));

        buttonP3.setBackground(new java.awt.Color(153, 255, 153));

        buttonP4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(buttonP1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(buttonP2)
                        .addGap(79, 79, 79)
                        .addComponent(buttonP3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonP4)
                        .addGap(48, 48, 48))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonP1)
                    .addComponent(buttonP2)
                    .addComponent(buttonP3)
                    .addComponent(buttonP4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 150));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fondo"));

        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });

        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });

        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 410, 110));

        btnBigote.setBackground(new java.awt.Color(255, 51, 51));
        btnBigote.setText("BIGOTE");
        btnBigote.setOpaque(true);
        btnBigote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBigoteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBigote, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 220, 110));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCIONE UNO DE LOS FONDOS PARA MODIFICAR LA IMAGEN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 390, 100));

        btnSegunda.setText("Segunda Parte");
        btnSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegundaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSegunda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        if(buttonP1.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CampoVaqueroBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CampoVaquero.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP2.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CampoAstronautaBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CampoAstronauta.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP3.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CampoProgramadorBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CampoProgramador.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP4.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CampoChefBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CampoChef.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else{
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CampoBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("Campo.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("Campo.wav"));
        sonido.play();
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        if(buttonP1.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CiudadVaqueroBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CiudadVaquero.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP2.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CiudadAstronautaBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CiudadAstronauta.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP3.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CiudadProgramadorBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CiudadProgramador.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP4.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CiudadChefBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CiudadChef.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else{
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("CiudadBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("Ciudad.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("Ciudad.wav"));
        sonido.play();
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        if(buttonP1.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("MontanaVaqueroBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("MontanaVaquero.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP2.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("MontanaAstronautaBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("MontanaAstronauta.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP3.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("MontanaProgramadorBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("MontanaProgramador.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP4.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("MontanaChefBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("MontanaChef.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else{
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("MontanaBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("Montana.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("Montana.wav"));
        sonido.play();
    }//GEN-LAST:event_f3ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        if(buttonP1.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("PlayaVaqueroBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("PlayaVaquero.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP2.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("PlayaAstronautaBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("PlayaAstronauta.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP3.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("PlayaProgramadorBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("PlayaProgramador.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else if(buttonP4.isSelected() == true){
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("PlayaChefBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("PlayaChef.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }else{
            if(btnBigote.isSelected() == true){
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("PlayaBigote.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }else{
                ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("Playa.jpg"));

                Image fot = fota.getImage();  
                Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
                fota = new ImageIcon(newfot);
                foto.setIcon(fota);
            }
        }
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("Playa.wav"));
        sonido.play();
    }//GEN-LAST:event_f4ActionPerformed

    private void btnBigoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBigoteActionPerformed
        if(btnBigote.isSelected() == true){
            btnBigote.setText("BIGOTE ACTIVADO");
        }else{
            btnBigote.setText("BIGOTE DESACTIVADO");
        }
    }//GEN-LAST:event_btnBigoteActionPerformed

    private void btnSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegundaActionPerformed
        this.setVisible(false);
        segundaParte.pack();
        segundaParte.setLocationRelativeTo(null);
        segundaParte.setVisible(true);
    }//GEN-LAST:event_btnSegundaActionPerformed

    private void btnRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRojoActionPerformed
         panelColor.setBackground(Color.red);
    }//GEN-LAST:event_btnRojoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        segundaParte.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agradableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agradableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agradableActionPerformed

    private void btnAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzulActionPerformed
        panelColor.setBackground(Color.blue);
    }//GEN-LAST:event_btnAzulActionPerformed

    private void btnAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmarilloActionPerformed
        panelColor.setBackground(Color.yellow);
    }//GEN-LAST:event_btnAmarilloActionPerformed

    private void btnBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotonActionPerformed
        if(btnBoton.isSelected() == true){
            txtEstado.setText("Estado del botón: PULSADO");
        }else{
            txtEstado.setText("Estado del botón: SIN PULSAR");
        }
    }//GEN-LAST:event_btnBotonActionPerformed

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed
        String resumen = "Cualidades seleccionadas:\n";
        if(inteligente.isSelected() == true){
            resumen = resumen + "Inteligente\n";
        }
        if(agradable.isSelected() == true){
            resumen = resumen + "Agradable\n";
        }
        if(divertido.isSelected() == true){
            resumen = resumen + "Divertido\n";
        }
        JOptionPane.showMessageDialog(null, resumen);
    }//GEN-LAST:event_btnResumenActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        String texto = txtTexto.getText();
        if(mayus.isSelected() == true){
            texto = texto.toUpperCase();
        }
        JOptionPane.showMessageDialog(null, texto);
    }//GEN-LAST:event_btnLeerActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Componentes comp = new Componentes();
                comp.setLocationRelativeTo(null);
                comp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton agradable;
    public javax.swing.JButton btnAmarillo;
    public javax.swing.JButton btnAzul;
    public javax.swing.JToggleButton btnBigote;
    public javax.swing.JToggleButton btnBoton;
    public javax.swing.JButton btnLeer;
    public javax.swing.JButton btnResumen;
    public javax.swing.JButton btnRojo;
    private javax.swing.JButton btnSegunda;
    public javax.swing.JButton btnVolver;
    public javax.swing.JRadioButton buttonP1;
    public javax.swing.JRadioButton buttonP2;
    public javax.swing.JRadioButton buttonP3;
    public javax.swing.JRadioButton buttonP4;
    public javax.swing.JRadioButton divertido;
    public javax.swing.JButton f1;
    public javax.swing.JButton f2;
    public javax.swing.JButton f3;
    public javax.swing.JButton f4;
    public javax.swing.JLabel foto;
    public javax.swing.ButtonGroup grupoButtons;
    public javax.swing.JRadioButton inteligente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JCheckBox mayus;
    public javax.swing.JLabel p1;
    public javax.swing.JLabel p2;
    public javax.swing.JLabel p3;
    public javax.swing.JLabel p4;
    public javax.swing.JPanel panelColor;
    private javax.swing.JDialog segundaParte;
    public javax.swing.JLabel txtEstado;
    public javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}