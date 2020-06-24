
import java.awt.Color;


public class LettreForm extends javax.swing.JFrame {

private static int t, v, c = 0;
private String text = new String();
    
    
    public LettreForm() {
        initComponents();
        Update();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textInput = new java.awt.TextArea();
        jLabelInput = new javax.swing.JLabel();
        textOutput = new java.awt.TextArea();
        jLabelOutput = new javax.swing.JLabel();
        cbPalindrome = new java.awt.Checkbox();
        jLabelVoyelle = new javax.swing.JLabel();
        jLabelConsonne = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manipulation de texte");
        setResizable(false);

        textInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textInput.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textInputTextValueChanged(evt);
            }
        });

        jLabelInput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelInput.setText("Entrez votre texte :");

        textOutput.setEditable(false);
        textOutput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabelOutput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelOutput.setText("Texte inversé :");

        cbPalindrome.setEnabled(false);
        cbPalindrome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbPalindrome.setLabel("Palindrome");

        jLabelVoyelle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelConsonne.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInput)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPalindrome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelOutput)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelConsonne, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelVoyelle, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPalindrome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelConsonne, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelVoyelle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textInputTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textInputTextValueChanged
        text = textInput.getText(); //Obtient le texte de la box d'écriture        
        voyelle(); //compte le type de lettre
        t = text.length(); //compte le total de lettre
        Update(); //maj des label indiquant les nombres de lettres
        textOutput.setText(inversion(text)); //Inversion des mots
        cbPalindrome.setState(Palindrome());
    }//GEN-LAST:event_textInputTextValueChanged

    private boolean Palindrome()
    {
        if("".equals(text))
            return false;
        else           
            return (textInput.getText().equals(textOutput.getText()));
    }
    
    private String inversion(String tbase)
    {
        char tinv;
        String result = new String();        
        
       if(!("".equals(tbase)))
       {
           
        for(int i = tbase.length()-1 ; i > 0; i--)
        {
            tinv = tbase.charAt(i);
            
            result += tinv;       
        }
            
            tinv = tbase.charAt(0);
            result += tinv;
       }
       else
           result = "";
       
       return result;
    }
    
    private void voyelle()
    {
        c = v = 0;
        
        for(int i = 0; i < text.length(); i++)
        {
            switch(text.charAt(i))
            {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                case 'y':
                case 'Y': v++; break;
                
                case ',':
                case ';':
                case ':':
                case '<':
                case '>':
                case '/':
                case '?':
                case '=': break;
                    
                                        
                default : c++;
                                 
            }
        }
    }

    
    private void Update()
    {
        jLabelTotal.setText("Nombre total de lettre : " + String.valueOf(t));
        jLabelVoyelle.setText("Nombre total de voyelle : " + String.valueOf(v));
        jLabelConsonne.setText("Nombre total de consonne : " + String.valueOf(c));
    }
    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(LettreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LettreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LettreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LettreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LettreForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox cbPalindrome;
    private javax.swing.JLabel jLabelConsonne;
    private javax.swing.JLabel jLabelInput;
    private javax.swing.JLabel jLabelOutput;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVoyelle;
    private java.awt.TextArea textInput;
    private java.awt.TextArea textOutput;
    // End of variables declaration//GEN-END:variables
}
