/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.supermercadoreges.view;

import br.com.supermercadoreges.modelo.Cliente;
import br.com.supermercadoreges.modelo.Endereco;
import br.com.supermercadoreges.rdn.ClienteRdn;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex.lopes
 */
public class FrmClientes extends javax.swing.JFrame {

   
    private int idCliente = 0;

    public FrmClientes() {
        initComponents();
        this.carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        Bairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCartao = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtNome1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "TELEFONE", "NASCIMENTO", "EMAIL", "CARTÃO FIDELIDADE", "LOGRADOURO", "BAIRRO", "CEP", "CIDADE", "COMPLEMENTO", "NÚMERO", "UF"
            }
        ));
        tableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCliente);
        if (tableCliente.getColumnModel().getColumnCount() > 0) {
            tableCliente.getColumnModel().getColumn(0).setHeaderValue("ID");
            tableCliente.getColumnModel().getColumn(1).setHeaderValue("NOME");
            tableCliente.getColumnModel().getColumn(2).setHeaderValue("TELEFONE");
            tableCliente.getColumnModel().getColumn(3).setHeaderValue("NASCIMENTO");
            tableCliente.getColumnModel().getColumn(4).setHeaderValue("EMAIL");
            tableCliente.getColumnModel().getColumn(5).setHeaderValue("CARTÃO FIDELIDADE");
            tableCliente.getColumnModel().getColumn(6).setHeaderValue("LOGRADOURO");
            tableCliente.getColumnModel().getColumn(7).setHeaderValue("BAIRRO");
            tableCliente.getColumnModel().getColumn(8).setHeaderValue("CEP");
            tableCliente.getColumnModel().getColumn(9).setHeaderValue("CIDADE");
            tableCliente.getColumnModel().getColumn(10).setHeaderValue("COMPLEMENTO");
            tableCliente.getColumnModel().getColumn(11).setHeaderValue("NÚMERO");
            tableCliente.getColumnModel().getColumn(12).setHeaderValue("UF");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 780, 150));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Manter Cliente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(650, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 780, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Cep");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        txtCep.setToolTipText("");
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 150, -1));

        jLabel8.setText("Cidade");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        txtCidade.setToolTipText("");
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 170, -1));

        txtNome.setToolTipText("");
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 170, -1));

        jLabel14.setText("Nascimento");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, 20));

        jLabel15.setText("Telefone");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtTelefone.setToolTipText("");
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 170, -1));

        jLabel16.setText("Logradouro");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtLogradouro.setToolTipText("");
        jPanel1.add(txtLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 170, -1));

        jLabel17.setText("Complemento");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtComplemento.setToolTipText("");
        jPanel1.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 170, -1));

        jLabel18.setText("Email");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        txtEmail.setToolTipText("");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 170, -1));

        jLabel19.setText("Numero");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        txtNumero.setToolTipText("");
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 70, -1));

        Bairro.setText("Bairro");
        jPanel1.add(Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        txtBairro.setToolTipText("");
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 170, -1));

        jLabel21.setText("UF");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        txtUf.setToolTipText("");
        jPanel1.add(txtUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 40, -1));

        jLabel22.setText("Cartão");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        txtCartao.setToolTipText("");
        jPanel1.add(txtCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 170, -1));

        txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jPanel1.add(txtDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 170, -1));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        txtNome1.setToolTipText("");
        jPanel1.add(txtNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 170, -1));

        jLabel20.setText("Nome");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 780, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Cliente cliente = new Cliente();
        try {

            cliente.setNome(txtNome.getText());
            cliente.setTelefone(txtTelefone.getText());
            cliente.setEmail(txtEmail.getText());

            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            cal.setTime(sdf.parse(txtDataNascimento.getText()));
            cliente.setDataNascimento(cal);

            cliente.setNumeroCartaoFidelidade(txtCartao.getText());

            Endereco endereco = new Endereco();
            endereco.setLogradouro(txtLogradouro.getText());
            endereco.setBairro(txtBairro.getText());
            endereco.setNumero(txtNumero.getText());
            endereco.setUf(txtUf.getText());
            endereco.setCidade(txtCidade.getText());
            endereco.setComplemento(txtComplemento.getText());
            endereco.setCep(txtCep.getText());

            cliente.setEndereco(endereco);

            ClienteRdn cliRdn = new ClienteRdn();

            if (this.idCliente == 0) {
                
                cliRdn.inserir(cliente);
                JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                
                cliente.setId(this.idCliente);                
                cliRdn.alterar(cliente);
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }

            //carrega a tabela
            this.carregarTabela();
            
            //limpa os campos
            this.limparCampos();

        } catch (HeadlessException | SQLException | ParseException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClienteMouseClicked

        //PEGA A LINHA SELECIONADA
        int row = this.tableCliente.getSelectedRow();

        //RECUPERA O VALOr DA COLUNA ID ESTA NA 0
        int idCliente = (int) this.tableCliente.getValueAt(row, 0);

        //RECUPERAR O VALOR NO BANCO DE DADOS
        Cliente cliente = new Cliente();

        //IR NO BANCO DE DADOS E RECUPERAR O VALOR ATUALIZADO DO CLIENTE
        cliente = new ClienteRdn().obterPorId(idCliente);

        txtNome.setText(cliente.getNome());
        txtEmail.setText(cliente.getEmail());
        txtCartao.setText(cliente.getNumeroCartaoFidelidade());
        txtTelefone.setText(cliente.getTelefone());

        //ALTERAR A DATA 
        DateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        txtDataNascimento.setText(formataData.format(cliente.getDataNascimento().getTime()));

        txtLogradouro.setText(cliente.getEndereco().getLogradouro());
        txtNumero.setText(cliente.getEndereco().getNumero());
        txtBairro.setText(cliente.getEndereco().getBairro());
        txtCep.setText(cliente.getEndereco().getCep());
        txtComplemento.setText(cliente.getEndereco().getComplemento());
        txtUf.setText(cliente.getEndereco().getUf());
        txtCidade.setText(cliente.getEndereco().getCidade());

        //RECUPERAR O ID PARA CONTROLE DE INSERÇÃO/ALTERAÇÃO
        this.idCliente = cliente.getId();
        
        btnSalvar.setText("Alterar");


    }//GEN-LAST:event_tableClienteMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       
        this.limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         if (tableCliente.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Clique em um cliente para remover", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else {

            int reply = JOptionPane.showConfirmDialog(null, "Deseja remover esse cliente", "Atenção", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {

                int row = this.tableCliente.getSelectedRow();
                int idCliente = (int) this.tableCliente.getValueAt(row, 0);
                ClienteRdn rdn = new ClienteRdn();
                rdn.excluir(idCliente);
                this.carregarTabela();

                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                this.limparCampos();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void carregarTabela() {

        DefaultTableModel model = (DefaultTableModel) tableCliente.getModel();

        //limpar a tabela antes de selecionar
        model.setRowCount(0);

        //criar uma lista de clientes
        List<Cliente> lstCliente = new ArrayList<Cliente>();

        //crio um objeto da classe de regra de negocios
        ClienteRdn cliRdn = new ClienteRdn();

        //recuperar todos os clientes
        lstCliente = cliRdn.obterTodos();

        //para cada cliente da lista
        for (Cliente cli : lstCliente) {
            DateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

            //adicionar a linha
            model.addRow(new Object[]{
                cli.getId(),
                cli.getNome(),
                cli.getTelefone(),
                formataData.format(cli.getDataNascimento().getTime()),
                cli.getEmail(),
                cli.getNumeroCartaoFidelidade(),
                cli.getEndereco().getLogradouro(),
                cli.getEndereco().getBairro(),
                cli.getEndereco().getCep(),
                cli.getEndereco().getCidade(),
                cli.getEndereco().getComplemento(),
                cli.getEndereco().getNumero(),
                cli.getEndereco().getUf()
            });

        }

        tableCliente.setModel(model);

    }

    private void limparCampos()
    {
        txtNome.setText("");
        txtTelefone.setText("");
        txtDataNascimento.setText("");
        txtEmail.setText("");
        txtCartao.setText("");
        txtLogradouro.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCep.setText("");
        txtComplemento.setText("");
        txtCep.setText("");
        txtComplemento.setText("");
        txtUf.setText("");
        txtCidade.setText("");
        
        
        btnSalvar.setText("Salvar");
        this.idCliente = 0;
    
    
    }
    
    
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCartao;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
