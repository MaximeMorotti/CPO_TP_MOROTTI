
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import lightoff_morotti_version_console.GrilleDeCellules;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 33768
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    GrilleDeCellules grille;
    int nbCoups; 
    int i;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        FenetreVictoire f = new FenetreVictoire() ;
        int nbLignes = 5;
        int nbColonnes = 5;
        this.revalidate();
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        this.grille = new GrilleDeCellules(nbLignes, nbColonnes);
        for (int i=0; i < nbLignes; i++) {
            for (int j=0; j < nbColonnes; j++ ) {
                CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[i][j], 36,36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        grille.melangerMatriceAleatoirement(1);
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, nbColonnes*50, nbLignes*50));
        this.pack();
        this.revalidate();
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1 * 50, nbLignes * 50));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for ( i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            bouton_ligne.setText("L" + i);
            ActionListener ecouteurClickL = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    if (grille.cellulesToutesEteintes()==true){
                        f.setVisible(true) ;
                    }
                    nbCoups++;
                    repaint();
                }
            };
            bouton_ligne.addActionListener(ecouteurClickL);
            PanneauBoutonsVerticaux.add(bouton_ligne);
        }
        
        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, nbLignes * 50 , 1 * 50));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for ( i = 0; i < nbColonnes; i++) {
            JButton bouton_Colonne = new JButton();
            bouton_Colonne.setText("C" + i);
            ActionListener ecouteurClickC = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    if (grille.cellulesToutesEteintes()==true){
                        f.setVisible(true) ;
                    }
                    nbCoups++;
                    repaint();
                }
            };
        bouton_Colonne.addActionListener(ecouteurClickC);
        PanneauBoutonsHorizontaux.add(bouton_Colonne);
        }
        
        
        
        Dd.setLayout(new GridLayout(1, 1));
        getContentPane().add(Dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1 * 50, 1 * 50));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        JButton bouton_Dd = new JButton();
        bouton_Dd.setText("Dd");
        ActionListener ecouteurClickDd = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleDescendante();
                if (grille.cellulesToutesEteintes()==true){
                    f.setVisible(true) ;
                }
                nbCoups++;
                repaint();
            }
        };
        bouton_Dd.addActionListener(ecouteurClickDd);
        Dd.add(bouton_Dd);
        
        
        
        
        Dm.setLayout(new GridLayout(1, 1));
        getContentPane().add(Dm, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 1 * 50, 1 * 50));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        JButton bouton_Dm = new JButton();
        bouton_Dm.setText("Dm");
        ActionListener ecouteurClickDm = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleMontante();
                if (grille.cellulesToutesEteintes()==true){
                    f.setVisible(true) ;
                }
                nbCoups++;
                repaint();
            }
        };
        bouton_Dm.addActionListener(ecouteurClickDm);
        Dm.add(bouton_Dm);

    }
    
    
    
    
    
    
    public void initialiserPartie() {
        grille.eteindreToutesLesCellule();
        grille.melangerMatriceAleatoirement(10);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        button1 = new java.awt.Button();
        PanneauGrille = new javax.swing.JPanel();
        vicy = new javax.swing.JLabel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        Dd = new javax.swing.JPanel();
        Dm = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 0, 255));
        PanneauGrille.setPreferredSize(new java.awt.Dimension(360, 360));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));
        getContentPane().add(vicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 100, 350));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 50, 360));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 360, 40));

        Dd.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout DdLayout = new javax.swing.GroupLayout(Dd);
        Dd.setLayout(DdLayout);
        DdLayout.setHorizontalGroup(
            DdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        DdLayout.setVerticalGroup(
            DdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(Dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 50, 40));

        Dm.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout DmLayout = new javax.swing.GroupLayout(Dm);
        Dm.setLayout(DmLayout);
        DmLayout.setHorizontalGroup(
            DmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        DmLayout.setVerticalGroup(
            DmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(Dm, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 50, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dd;
    private javax.swing.JPanel Dm;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel vicy;
    // End of variables declaration//GEN-END:variables
    

}
