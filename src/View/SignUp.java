
package View;

import Controller.CadastroPessoaController;


public class SignUp extends javax.swing.JFrame {

    
    public SignUp() {
        initComponents();
        
        //setLocationRelativeTo(null);
       // setResizable(false);
        getRootPane().setDefaultButton(bntCadastrar);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        CPF = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        bntCadastrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        CPF1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CypherBank - Cadastre-se");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Captura_de_tela_2025-05-29_131818-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 140, 140, 90);

        jLabel1.setFont(new java.awt.Font("Yaro Op", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CypherBank");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 240, 330, 80);

        jLabel4.setFont(new java.awt.Font("Yaro St", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seu futuro financeiro, seguro e conectado.");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 450, 270, 18);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo (400 x 560 px).png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 400, 560);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        CPF.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        CPF.setText("Nome Completo");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        Senha.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Senha.setText("Senha");

        bntCadastrar.setBackground(new java.awt.Color(198, 25, 88));
        bntCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bntCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        bntCadastrar.setText("Cadastrar");
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yaro St", 0, 36)); // NOI18N
        jLabel6.setText("Cadastre-se");

        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        CPF1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        CPF1.setText("CPF");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Já sou cliente");

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(198, 25, 88));
        jToggleButton1.setText("Entrar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPF)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senha)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPF1)
                    .addComponent(bntCadastrar)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1964, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPF1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jToggleButton1))
                .addContainerGap(1929, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 2312, 2392);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
        // pega 
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        char[] senha = txtSenha.getPassword();
        
        System.out.println( "Dados: " + nome + " " +cpf + " " + senha);
        
        CadastroPessoaController novoCadastro = new CadastroPessoaController();
        novoCadastro.cadastrarPessoaController(nome, cpf, senha);
        
        txtNome.setText("");
        txtCPF.setText("");
        txtSenha.setText("");
        
        //ContaView conta = new ContaView();
        //conta.setVisible(true);
        //conta.pack();
        //conta.setLocationRelativeTo(null);
        //this.dispose();
        
    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        LoginView LoginViewFrame = new LoginView();
        LoginViewFrame.setVisible(true);
        LoginViewFrame.pack();
        LoginViewFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel CPF1;
    private javax.swing.JPanel Left;
    private javax.swing.JLabel Senha;
    private javax.swing.JButton bntCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
