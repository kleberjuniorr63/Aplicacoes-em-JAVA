/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author skynote
 */
public class Senso extends javax.swing.JFrame {

    Pessoa pessoa;
    Pessoa[] arrayPessoa;
    int i = 0;
    /**
     * Creates new form Senso
     */
    public Senso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        ddlUF = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rdBtnMasc = new javax.swing.JRadioButton();
        rdBtnFem = new javax.swing.JRadioButton();
        rdBtnOutros = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtQtdePessoas = new javax.swing.JTextField();
        btnQtdePessoas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPessoasCadastradas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", 0, 0, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        btnSalvar.setText("Salvar Pessoa");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar Pessoas");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        ddlUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "BA", "DF", "GO", "MG", "RJ", "SP", "TO" }));

        jLabel3.setText("Sexo:");

        sexo.add(rdBtnMasc);
        rdBtnMasc.setText("Masculino");

        sexo.add(rdBtnFem);
        rdBtnFem.setText("Feminino");

        sexo.add(rdBtnOutros);
        rdBtnOutros.setText("Outros");

        jLabel4.setText("Quantidade de Pessoas a serem cadastradas:");

        btnQtdePessoas.setText("Salvar");
        btnQtdePessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQtdePessoasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ddlUF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(rdBtnMasc))
                            .addComponent(btnSalvar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdBtnFem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdBtnOutros))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQtdePessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQtdePessoas)))
                .addGap(0, 491, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQtdePessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQtdePessoas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ddlUF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdBtnMasc)
                    .addComponent(rdBtnFem)
                    .addComponent(rdBtnOutros))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnMostrar)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatório do Senso", 0, 0, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 0, 102))); // NOI18N

        jScrollPane1.setViewportView(lstPessoasCadastradas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        //Criando os action performers para os radio buttons de sexo
        rdBtnMasc.setActionCommand("Masculino");
        rdBtnFem.setActionCommand("Feminino");
        rdBtnOutros.setActionCommand("Outros");
        
        //Antes de cadastrar uma pessoa, preciso fazer um "if", para ver se o vetor já não está todo preenchido
        if(i < arrayPessoa.length)
        {
            pessoa = new Pessoa();
        
            pessoa.setNome(txtNome.getText());
            pessoa.setIdade(Integer.parseInt(txtIdade.getText()));
            pessoa.setSexo(sexo.getSelection().getActionCommand());
            pessoa.setEstado(ddlUF.getSelectedItem().toString());
            
            //Adicionando o objeto pessoa ao array
            arrayPessoa[i] = pessoa;
            i++;
            
            LimparCampos();
            JOptionPane.showMessageDialog(null, "Pessoa adicionada com sucesso!", "InfoBox: " + "Estacio - Senso Teste", JOptionPane.INFORMATION_MESSAGE);
            txtNome.requestFocus();
        }
        //Mostrando mensagem que o array está cheio
        else
        {
            JOptionPane.showMessageDialog(null, "Não é possível cadastrar mais ninguém. Já foi atingido o quantitativo de pessoas para a pesquisa.", "InfoBox: " + "Estacio - Senso Teste", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
        //Criando um array de String para mostrar as pessoas cadastradas, pegando os dados do array de pessoas.
        String[] pessoasCadastradas = new String[arrayPessoa.length];
        
        //Percorrendo o array com os objetos do tipo Pessoa e salvando cada um e adicionando em uma lista
        for (int j = 0; j < arrayPessoa.length; j++) 
        {
            String pessoaAtualString = "";
            pessoaAtualString += "Nome: " + arrayPessoa[j].getNome() + ". ";
            pessoaAtualString += "Estado: " + arrayPessoa[j].getEstado() + ". ";
            pessoaAtualString += "Sexo: " + arrayPessoa[j].getSexo()+ ". ";
            pessoaAtualString += "Idade: " + arrayPessoa[j].getIdade()+ ". ";
            
            pessoasCadastradas[j] = pessoaAtualString;
        }
        
        lstPessoasCadastradas.setListData(pessoasCadastradas);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnQtdePessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQtdePessoasActionPerformed
        arrayPessoa = new Pessoa[Integer.parseInt(txtQtdePessoas.getText())];
        JOptionPane.showMessageDialog(null, "Registrado a quantidade de pessoas! Pode começar com os cadastros.", "InfoBox: " + "Estacio - Senso Teste", JOptionPane.INFORMATION_MESSAGE);
        txtNome.requestFocus();
    }//GEN-LAST:event_btnQtdePessoasActionPerformed

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
            java.util.logging.Logger.getLogger(Senso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Senso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Senso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Senso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Senso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnQtdePessoas;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> ddlUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstPessoasCadastradas;
    private javax.swing.JRadioButton rdBtnFem;
    private javax.swing.JRadioButton rdBtnMasc;
    private javax.swing.JRadioButton rdBtnOutros;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdePessoas;
    // End of variables declaration//GEN-END:variables

    private void LimparCampos() {
        txtIdade.setText("");
        txtNome.setText("");
        ddlUF.setSelectedIndex(0);
        
    }
}
