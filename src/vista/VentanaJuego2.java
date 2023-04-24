/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import eventos.Palabras;
import javax.swing.JLabel;

/**
 *
 * @author Alejandro
 */
public class VentanaJuego2 extends javax.swing.JFrame {

    public int contadorpalabras = 1;
    public int contadorbuenas = 0;
    public int contadormalas = 0;
    
    public VentanaJuego2() {
        initComponents();
        iniciarcontadorpalabra();
        
        
    }
    
    Palabras palabra = new Palabras();
    
    
    
    public static void actualizarPalabra(String texto) {
        lblPalabra.setText(texto);
    }
    
    
    
    
    
    
    
    
    

    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPalabra = new javax.swing.JLabel();
        btnA = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        lblContadorPalabras = new javax.swing.JLabel();
        lbnContadorErrores = new javax.swing.JLabel();
        lbnContadorCorresctas = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();
        Palabrascontador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FUGA DE LETRAS.");
        setResizable(false);

        lblPalabra.setFont(new java.awt.Font("Arial Narrow", 1, 60)); // NOI18N
        lblPalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnA.setBackground(new java.awt.Color(248, 206, 204));
        btnA.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        btnA.setMnemonic('a');
        btnA.setText("A");
        btnA.setPreferredSize(new java.awt.Dimension(100, 100));
        btnA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAMousePressed(evt);
            }
        });

        btnE.setBackground(new java.awt.Color(225, 213, 231));
        btnE.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        btnE.setText("E");
        btnE.setPreferredSize(new java.awt.Dimension(100, 100));
        btnE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEMousePressed(evt);
            }
        });

        btnI.setBackground(new java.awt.Color(248, 206, 204));
        btnI.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        btnI.setText("I");
        btnI.setPreferredSize(new java.awt.Dimension(100, 100));
        btnI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIMousePressed(evt);
            }
        });

        btnO.setBackground(new java.awt.Color(225, 213, 231));
        btnO.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        btnO.setText("O");
        btnO.setMinimumSize(new java.awt.Dimension(100, 100));
        btnO.setPreferredSize(new java.awt.Dimension(100, 100));
        btnO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOMousePressed(evt);
            }
        });

        btnU.setBackground(new java.awt.Color(248, 206, 204));
        btnU.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        btnU.setText("U");
        btnU.setPreferredSize(new java.awt.Dimension(100, 100));
        btnU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUMousePressed(evt);
            }
        });

        lblContadorPalabras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblContadorPalabras.setText("PALABRAS: ");

        lbnContadorErrores.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbnContadorErrores.setText("ERRORES:");

        lbnContadorCorresctas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbnContadorCorresctas.setText("CORRECTAS: ");

        btnTerminar.setBackground(new java.awt.Color(255, 30, 29));
        btnTerminar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnTerminar.setText("TERMINAR INTENTO");
        btnTerminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTerminarMousePressed(evt);
            }
        });

        Palabrascontador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btnTerminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblContadorPalabras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Palabrascontador, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(lbnContadorErrores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(lbnContadorCorresctas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblContadorPalabras)
                        .addComponent(Palabrascontador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbnContadorErrores)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbnContadorCorresctas)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnTerminar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int getContadorpalabras() {
        return contadorpalabras;
    }

    public int getContadorbuenas() {
        return contadorbuenas;
    }

    public int getContadormalas() {
        return contadormalas;
    }
    
    
    
    
    
    public  void setContadorpalabras() {
        contadorpalabras = contadorpalabras+1;
    }

    public void setContadorbuenas() {
        contadorbuenas = contadorbuenas+1;
    }

    public void setContadormalas() {
        contadormalas = contadormalas+1;
    }
    
    public void iniciarcontadorpalabra()
    {
        Palabrascontador.setText(Integer.toString(contadorpalabras));
        
        
    }

    private void btnAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMousePressed
        if(lblPalabra.getText().equals("G_TO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            iniciarcontadorpalabra();
            setContadorbuenas();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("ELEF_NTE"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            iniciarcontadorpalabra();
            setContadorbuenas();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("CEBR_"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
        }
        
        else if(lblPalabra.getText().equals("VAC_"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("AM_RILLO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("MOR_DO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("BL_NCO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("ROS_DO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("NAR_NJA"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("DOR_DO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("M_NZANA"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("NAR_NJA"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("BAN_NO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("PAPAY_"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else
        {
            setContadormalas();
            jLabel2.setText(Integer.toString(contadormalas));
            
            
        }
        
        
    }//GEN-LAST:event_btnAMousePressed

    private void btnEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEMousePressed
        if(lblPalabra.getText().equals("L_ON"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            iniciarcontadorpalabra();
            setContadorbuenas();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("V_RDE"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            iniciarcontadorpalabra();
            setContadorbuenas();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("N_GRO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            iniciarcontadorpalabra();
            setContadorbuenas();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("FR_SA"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            iniciarcontadorpalabra();
            setContadorbuenas();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
       
        else
        {
            setContadormalas();
            jLabel2.setText(Integer.toString(contadormalas));
            
            
        }
    }//GEN-LAST:event_btnEMousePressed

    private void btnIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIMousePressed
        if(lblPalabra.getText().equals("J_RAFA"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            iniciarcontadorpalabra();
            setContadorbuenas();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("T_GRE"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
        
         else if(lblPalabra.getText().equals("GR_S"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
         
          else if(lblPalabra.getText().equals("SAND_A"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
          
           else if(lblPalabra.getText().equals("KIW_"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
           
            else if(lblPalabra.getText().equals("L_MON"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
        else
        {
            setContadormalas();
            jLabel2.setText(Integer.toString(contadormalas));
            
            
        }
        
    }//GEN-LAST:event_btnIMousePressed

    private void btnOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOMousePressed
        if(lblPalabra.getText().equals("PERR_"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            iniciarcontadorpalabra();
            setContadorbuenas();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
            
            
        }
        
        else if(lblPalabra.getText().equals("M_NO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
        
        else if(lblPalabra.getText().equals("_SO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
        
        else if(lblPalabra.getText().equals("L_RO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionAnimal());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
        
        else if(lblPalabra.getText().equals("R_JO"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
        
        else if(lblPalabra.getText().equals("MEL_N"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
        
        else if(lblPalabra.getText().equals("MANG_"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
        
        else
        {
            setContadormalas();
            jLabel2.setText(Integer.toString(contadormalas));
            
            
        }
    }//GEN-LAST:event_btnOMousePressed

    private void btnUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUMousePressed
        
        if(lblPalabra.getText().equals("AZ_L"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionColor());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
        
        else if(lblPalabra.getText().equals("_VA"))
        {
            VentanaJuego2.actualizarPalabra(palabra.seleccionFruta());
            setContadorpalabras();
            setContadorbuenas();
            iniciarcontadorpalabra();
            jLabel3.setText(Integer.toString(contadorbuenas));
            
        }
        
        else
        {
        
            setContadormalas();
            jLabel2.setText(Integer.toString(contadormalas));
        }
    }//GEN-LAST:event_btnUMousePressed

    private void btnTerminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMousePressed
        VentanaEstadisticas newframeEstadisticas = new VentanaEstadisticas();       //crea frame pra llevar a la ventana estadisticas
        
        newframeEstadisticas.setVisible(true);      //usando el frame inicia VentanaEstadisticas
        
        this.dispose();     //evita la acomulacion de ventanas
        
        
        
        
    }//GEN-LAST:event_btnTerminarMousePressed

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
            java.util.logging.Logger.getLogger(VentanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Palabrascontador;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JButton btnU;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblContadorPalabras;
    public static javax.swing.JLabel lblPalabra;
    private javax.swing.JLabel lbnContadorCorresctas;
    private javax.swing.JLabel lbnContadorErrores;
    // End of variables declaration//GEN-END:variables
}
