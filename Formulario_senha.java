import java.util.ArrayList;
public class Formulario_senha extends javax.swing.JFrame {
    private static Integer Numero_senha = 0;
    ArrayList<Senha> fila = new ArrayList();    
    public Formulario_senha() {        
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txto_senha_tela = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Botao_senha_comum = new javax.swing.JButton();
        Botao_senha_rapida = new javax.swing.JButton();
        Botao_senha_prioritario = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        texto_senha_usuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Botao_caixa1 = new javax.swing.JButton();
        Botao_caixa3 = new javax.swing.JButton();
        Botao_caixa2 = new javax.swing.JButton();
        Botao_caixa4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txto_caixa_tela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txto_senha_tela.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txto_senha_tela.setText("Senha");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Escolha seu tipo de atendimento");

        Botao_senha_comum.setText("Comum");
        Botao_senha_comum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_senha_comumActionPerformed(evt);
            }
        });

        Botao_senha_rapida.setText("Rápido");
        Botao_senha_rapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_senha_rapidaActionPerformed(evt);
            }
        });

        Botao_senha_prioritario.setText("Prioritário");
        Botao_senha_prioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_senha_prioritarioActionPerformed(evt);
            }
        });

        jLabel9.setText("Sua senha é:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        texto_senha_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        texto_senha_usuario.setText("C-0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(texto_senha_usuario)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(texto_senha_usuario))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Botao_senha_comum)
                        .addGap(18, 18, 18)
                        .addComponent(Botao_senha_rapida)
                        .addGap(28, 28, 28)
                        .addComponent(Botao_senha_prioritario))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_senha_comum)
                    .addComponent(Botao_senha_rapida)
                    .addComponent(Botao_senha_prioritario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Botao_caixa1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Botao_caixa1.setText("Caixa 1");
        Botao_caixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_caixa1ActionPerformed(evt);
            }
        });

        Botao_caixa3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Botao_caixa3.setText("Caixa 3");
        Botao_caixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_caixa3ActionPerformed(evt);
            }
        });

        Botao_caixa2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Botao_caixa2.setText("Caixa 2");
        Botao_caixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_caixa2ActionPerformed(evt);
            }
        });

        Botao_caixa4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Botao_caixa4.setText("Caixa 4");
        Botao_caixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_caixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao_caixa3)
                    .addComponent(Botao_caixa1))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao_caixa4)
                    .addComponent(Botao_caixa2))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_caixa1)
                    .addComponent(Botao_caixa2))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_caixa3)
                    .addComponent(Botao_caixa4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Para Clientes:");

        jLabel5.setText("Para caixas:");

        txto_caixa_tela.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txto_caixa_tela.setText("Caixa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txto_caixa_tela))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txto_senha_tela)))
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txto_senha_tela)
                .addGap(53, 53, 53)
                .addComponent(txto_caixa_tela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_caixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_caixa1ActionPerformed
        int contador = 0;
        if(fila.size() > 0){
            txto_caixa_tela.setText("Caixa 1");
            for (int i = 0; i < fila.size(); i++) {
                if(fila.get(i).getTipo().equals("P")){
                    txto_senha_tela.setText(fila.get(i).getTipo()+"-"+fila.get(i).getSenha());
                    fila.remove(i);
                    contador = 1;
                    break;

                }
            }
            if(contador == 0){
                for (int i = 0; i < fila.size(); i++) {
                    if(fila.get(i).getTipo().equals("R") || fila.get(i).getTipo().equals("C")){
                        txto_senha_tela.setText(fila.get(i).getTipo()+"-"+fila.get(i).getSenha());
                        fila.remove(i);
                        contador = 1;
                        break;

                    }
                }
            }
            
             
        }
       
    }//GEN-LAST:event_Botao_caixa1ActionPerformed

    private void Botao_caixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_caixa2ActionPerformed
       int contador = 0;
        if(fila.size() > 0){
            txto_caixa_tela.setText("Caixa 2");
            for (int i = 0; i < fila.size(); i++) {
                if(fila.get(i).getTipo().equals("R")){
                    txto_senha_tela.setText(fila.get(i).getTipo()+"-"+fila.get(i).getSenha());
                    fila.remove(i);
                    contador = 1;
                    break;

                }
            }
            if(contador == 0){
                for (int i = 0; i < fila.size(); i++) {
                    if(fila.get(i).getTipo().equals("P") || fila.get(i).getTipo().equals("C")){
                        txto_senha_tela.setText(fila.get(i).getTipo()+"-"+fila.get(i).getSenha());
                        fila.remove(i);
                        contador = 1;
                        break;

                    }
                }
            }
            
             
        }
    }//GEN-LAST:event_Botao_caixa2ActionPerformed

    private void Botao_caixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_caixa3ActionPerformed
        int contador = 0;
        if(fila.size() > 0){
            txto_caixa_tela.setText("Caixa 3");
            for (int i = 0; i < fila.size(); i++) {
                if(fila.get(i).getTipo().equals("R")){
                    txto_senha_tela.setText(fila.get(i).getTipo()+"-"+fila.get(i).getSenha());
                    fila.remove(i);
                    contador = 1;
                    break;

                }
            }
            if(contador == 0){
                for (int i = 0; i < fila.size(); i++) {
                    if(fila.get(i).getTipo().equals("P") || fila.get(i).getTipo().equals("C")){
                        txto_senha_tela.setText(fila.get(i).getTipo()+"-"+fila.get(i).getSenha());
                        fila.remove(i);
                        contador = 1;
                        break;

                    }
                }
            }
            
             
        }
    }//GEN-LAST:event_Botao_caixa3ActionPerformed

    private void Botao_caixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_caixa4ActionPerformed
        int contador = 0;
        if(fila.size() > 0){
            txto_caixa_tela.setText("Caixa 4");
            for (int i = 0; i < fila.size(); i++) {
                if(fila.get(i).getTipo().equals("C")){
                    txto_senha_tela.setText(fila.get(i).getTipo()+"-"+fila.get(i).getSenha());
                    fila.remove(i);
                    contador = 1;
                    break;

                }
            }
            if(contador == 0){
                for (int i = 0; i < fila.size(); i++) {
                    if(fila.get(i).getTipo().equals("R") || fila.get(i).getTipo().equals("P")){
                        txto_senha_tela.setText(fila.get(i).getTipo()+"-"+fila.get(i).getSenha());
                        fila.remove(i);
                        
                        break;

                    }
                }
            }
            
        }
    }//GEN-LAST:event_Botao_caixa4ActionPerformed

    private void Botao_senha_comumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_senha_comumActionPerformed
        Numero_senha++;
        cadastrarSenha("C", Numero_senha);
        texto_senha_usuario.setText("C-"+Numero_senha);
    }//GEN-LAST:event_Botao_senha_comumActionPerformed

    private void Botao_senha_rapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_senha_rapidaActionPerformed
        Numero_senha++;
        cadastrarSenha("R", Numero_senha);
        texto_senha_usuario.setText("R-"+Numero_senha);
    }//GEN-LAST:event_Botao_senha_rapidaActionPerformed

    private void Botao_senha_prioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_senha_prioritarioActionPerformed
        Numero_senha++;
        cadastrarSenha("P", Numero_senha);
        texto_senha_usuario.setText("P-"+Numero_senha);
    }//GEN-LAST:event_Botao_senha_prioritarioActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_caixa1;
    private javax.swing.JButton Botao_caixa2;
    private javax.swing.JButton Botao_caixa3;
    private javax.swing.JButton Botao_caixa4;
    private javax.swing.JButton Botao_senha_comum;
    private javax.swing.JButton Botao_senha_prioritario;
    private javax.swing.JButton Botao_senha_rapida;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel texto_senha_usuario;
    private javax.swing.JLabel txto_caixa_tela;
    private javax.swing.JLabel txto_senha_tela;
    // End of variables declaration//GEN-END:variables
    
    
    private void cadastrarSenha(String tipo, Integer numSenha){        
        Senha s = new Senha(tipo, numSenha);
        fila.add(s);
    }
}
