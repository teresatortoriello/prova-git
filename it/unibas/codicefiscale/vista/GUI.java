
package it.unibas.codicefiscale.vista;

import javax.swing.UIManager;
import it.unibas.codicefiscale.modello.Costanti;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GUI extends javax.swing.JFrame {

    
    private void inizializza() {
        initComponents();
        inizializzaComponenti();
        inizializzaAzioni();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        
    }
    
    private void inizializzaComponenti() {
        this.campoSesso.removeAllItems();
        this.campoSesso.addItem("");
        this.campoSesso.addItem(Costanti.MASCHIO);
        this.campoSesso.addItem(Costanti.FEMMINA);

    }
    
    private void inizializzaAzioni() {
        this.menuEsci.setAction(this.azioneEsci);
        this.menuCalcola.setAction(azioneCalcola);
        this.bottoneCalcola.setAction(azioneCalcola);
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoCognome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoAnno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoLuogo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoSesso = new javax.swing.JComboBox<>();
        bottoneCalcola = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCalcola = new javax.swing.JMenuItem();
        menuEsci = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Codice Fiscale");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserisci i dati della persona:"));

        jLabel1.setText("Nome :");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Cognome :");

        campoCognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCognomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Anno :");

        jLabel4.setText("Luogo :");

        jLabel5.setText("Sesso :");

        campoSesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", " " }));

        bottoneCalcola.setText("Calcola");

        jLabel6.setBackground(new java.awt.Color(0, 102, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RISULTATO ");
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(campoNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoSesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                                        .addComponent(bottoneCalcola))
                                    .addComponent(campoCognome)
                                    .addComponent(campoAnno)
                                    .addComponent(campoLuogo)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoLuogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoSesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneCalcola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        menuCalcola.setText("Calcola");
        menuCalcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalcolaActionPerformed(evt);
            }
        });
        jMenu1.add(menuCalcola);

        menuEsci.setText("Esci");
        jMenu1.add(menuEsci);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoCognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCognomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCognomeActionPerformed

    private void menuCalcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalcolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCalcolaActionPerformed

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new GUI().setVisible(true);
               GUI gui = new GUI();
               gui.inizializza();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottoneCalcola;
    private javax.swing.JTextField campoAnno;
    private javax.swing.JTextField campoCognome;
    private javax.swing.JTextField campoLuogo;
    private javax.swing.JTextField campoNome;
    private javax.swing.JComboBox<String> campoSesso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuCalcola;
    private javax.swing.JMenuItem menuEsci;
    // End of variables declaration//GEN-END:variables

    
    private AzioneEsci azioneEsci = new AzioneEsci();
    private AzioneCalcola azioneCalcola = new AzioneCalcola();
    
    private class AzioneEsci extends AbstractAction {

        public AzioneEsci () {
            this.putValue(Action.NAME, "Esci");
            this.putValue(Action.SHORT_DESCRIPTION, "Esci dall'applicazione");
            this.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_E);
            this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl alt X"));
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
        
    }
    
    private class AzioneCalcola extends AbstractAction{
        
        private Logger logger = LoggerFactory.getLogger(AzioneCalcola.class);

        public AzioneCalcola() {
            this.putValue(Action.NAME, "Calcola");
            this.putValue(Action.SHORT_DESCRIPTION, "Calcola il codice fiscale dell'utente");
            this.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_C);
            this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl alt C"));
            
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String cognome = campoCognome.getText();
            String nome = campoNome.getText();
            String anno = campoAnno.getText();
            String luogo = campoLuogo.getText();
            String sesso = campoSesso.getSelectedItem().toString();
            logger.debug("Eseguo azione Calcolan - Nome: {} - Cognome: {} - Anno: {} - Luogo:  {} - Sesso: {} ", nome, cognome, anno, luogo, sesso );
            String errori = convalida(nome, cognome, anno, luogo, sesso);
            if(!errori.isEmpty()) {
                logger.error("Errori nella convalida: \n {}", errori);
            }
            
        }       
        
        private String convalida(String nome, String cognome, String anno, String luogo, String sesso) {
            StringBuilder errori = new StringBuilder();
            if(nome.trim().isEmpty()) {
                errori.append("Il campo nome e' obbligatorio\n");
            } else if(nome.length() < 3){
                errori.append("Il campo nome deve contenere almeno tre caratteri\n");
            }
            if(cognome.trim().isEmpty()) {
                errori.append("Il campo cognome e' obbligatorio\n");
            } else if(cognome.length() < 3){
                errori.append("Il campo cognome deve contenere almeno tre caratteri\n");
            }
            if(luogo.trim().isEmpty()) {
                errori.append("Il campo luogo e' obbligatorio\n");
            }
            if(sesso.trim().isEmpty()) {
                errori.append("Il campo sesso e' obbligatorio\n");
            }
            if(anno.trim().isEmpty()) {
                errori.append("Il campo anno e' obbligatorio\n");
            } else {
                try {
                    int annoIntero = Integer.parseInt(anno);
                } catch (NumberFormatException e) {
                    errori.append("Il campo anno deve essere un intero");
                }
                
            }              
            return errori.toString();
            
        }
        
    }
    


}
