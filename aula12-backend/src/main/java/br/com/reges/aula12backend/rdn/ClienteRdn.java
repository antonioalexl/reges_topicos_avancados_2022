/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.reges.aula12backend.rdn;

import br.com.reges.aula12backend.modelos.Cliente;
import br.com.reges.aula12backend.modelos.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author alex.lopes
 */
public class ClienteRdn {

    public int inserir(Cliente cliente) throws SQLException {

        StringBuilder sql = new StringBuilder();
        int linhasAfetadas = 0;

        sql.append("INSERT INTO cliente                               ");
        sql.append("            (nome                                 ");
        sql.append("            ,telefone                             ");
        sql.append("            ,data_nascimento                      ");
        sql.append("            ,email                                ");
        sql.append("            ,numero_cartao_fidelidade             ");
        sql.append("            ,logradouro                           ");
        sql.append("            ,bairro                               ");
        sql.append("            ,cep                                  ");
        sql.append("            ,cidade                               ");
        sql.append("            ,complemento                          ");
        sql.append("            ,numero                               ");
        sql.append("            ,uf)                                  ");
        sql.append("        VALUES                                    ");
        sql.append("              (?                                  ");
        sql.append("              ,?                                  ");
        sql.append("              ,?                                  ");
        sql.append("              ,?                                  ");
        sql.append("              ,?                                  ");
        sql.append("              ,?                                  ");
        sql.append("              ,?                                  ");
        sql.append("              ,?                                  ");
        sql.append("              ,?                                  ");
        sql.append("              ,?                                  ");
        sql.append("              ,?                                  ");
        sql.append("              ,?)                                 ");

        Connection conn = new ConnectionFactory().getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql.toString());

        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getTelefone());


          //PEGA A DATA CORRENTE, ASSIM NÃO DÁ ERRO
          Calendar today = Calendar.getInstance();
          cliente.setDataNascimento(today);
          stmt.setDate(3, new java.sql.Date(today.getTimeInMillis()));

        //stmt.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTimeInMillis()));


        stmt.setString(4, cliente.getEmail());
        stmt.setString(5, cliente.getNumeroCartaoFidelidade());

        stmt.setString(6, cliente.getEndereco().getLogradouro());
        stmt.setString(7, cliente.getEndereco().getBairro());
        stmt.setString(8, cliente.getEndereco().getCep());
        stmt.setString(9, cliente.getEndereco().getCidade());
        stmt.setString(10, cliente.getEndereco().getComplemento());
        stmt.setString(11, cliente.getEndereco().getNumero());
        stmt.setString(12, cliente.getEndereco().getUf());

        linhasAfetadas = stmt.executeUpdate();

        System.out.print("linhas afetadas: " + linhasAfetadas);

        stmt.close();
        conn.close();

        return linhasAfetadas;
    }

    public ArrayList<Cliente> obterTodos() {

        ArrayList<Cliente> retorno = new ArrayList<Cliente>();

        try {

            StringBuilder str = new StringBuilder();

            str.append("select  a.id_cliente                   ");
            str.append("        ,a.nome                        ");
            str.append("        ,a.telefone                    ");
            str.append("        ,a.data_nascimento             ");
            str.append("        ,a.email                       ");
            str.append("        ,a.numero_cartao_fidelidade    ");
            str.append("        ,a.logradouro                  ");
            str.append("        ,a.bairro                      ");
            str.append("        ,a.cep                         ");
            str.append("        ,a.complemento                 ");
            str.append("        ,a.numero                      ");
            str.append("        ,a.uf                          ");
            str.append("        ,a.cidade                      ");
            str.append(" from cliente a                        ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT
            Statement stmt = conn.createStatement();

            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery(str.toString());

            //PERCORRE TODOS OS REGISTROS DO RESULT SET
            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));

                //CONVERTER SQL DATE TO CALENDAR
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(rs.getDate("data_nascimento"));

                cliente.setDataNascimento(calendar);
                cliente.setEmail(rs.getString("email"));
                cliente.setNumeroCartaoFidelidade(rs.getString("numero_cartao_fidelidade"));

                //POPULAR/CARREGAR OS ATRIBUTOS DO ENDEREÇO
                Endereco end = new Endereco();
                end.setLogradouro(rs.getString("logradouro"));
                end.setNumero(rs.getString("numero"));
                end.setBairro(rs.getString("bairro"));
                end.setCep(rs.getString("cep"));
                end.setCidade(rs.getString("cidade"));
                end.setUf(rs.getString("uf"));
                end.setComplemento(rs.getString("complemento"));

                //INCLUIR O OBJETO ENDEREÇO NA ATRIBUTO DO CLIENTE
                cliente.setEndereco(end);

                //ADICIONAR O OBJETO CLIENTE NA LISTA DE CLIENTES
                retorno.add(cliente);

            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return retorno;
    }

    public int excluir(int id) {

        int numeroLinhasAfetadas = 0;

        try {

            String str = "delete from cliente where id_cliente = ?";

            //RECUPERAR A CONEXÃO 
            Connection conn = new ConnectionFactory().getConnection();

            //INSTANCIA O COMANDO
            PreparedStatement statement = conn.prepareStatement(str);
            
            //CONFIGURA O PRAMETRO
            statement.setInt(1, id);

            //EXECUTA O DELETE
            numeroLinhasAfetadas = statement.executeUpdate();

            //FECHA A CONEXÃO E O STATEMENT
            conn.close();
            statement.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return numeroLinhasAfetadas;
    }
    
    
     public int deletar(int id) {

        int numeroLinhasAfetadas = 0;

        try {

            String str = "delete from cliente where id_cliente = ?";

            //RECUPERAR A CONEXÃO 
            Connection conn = new ConnectionFactory().getConnection();
            //INSTANCIAR O COMANDO
            PreparedStatement stmt = conn.prepareStatement(str.toString());

            //CRIAÇÃO DE PARAMETROS
            stmt.setInt(1, id);          
            
            //EXECUTA O DELETE
            numeroLinhasAfetadas = stmt.executeUpdate();

            //FECHA A CONEXÃO E O STATEMENT
            conn.close();

            stmt.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return numeroLinhasAfetadas;
    }

    public int alterar(Cliente cliente) {

        StringBuilder str = new StringBuilder();
        int numeroLinhasAfetadas = 0;

        try {

            str.append(" update cliente set nome = ?                       ");
            str.append("                    ,telefone = ?                  ");
            str.append("                    ,data_nascimento = ?           ");
            str.append("                    ,email = ?                     ");
            str.append("                    ,numero_cartao_fidelidade = ?  ");
            str.append("                    ,logradouro = ?                ");
            str.append("                     ,bairro = ?                   ");
            str.append("                     ,cep = ?                      ");
            str.append("                     ,cidade = ?                   ");
            str.append("                     ,complemento = ?              ");
            str.append("                     ,numero = ?                   ");
            str.append("                      ,uf = ?                      ");
            str.append("where id_cliente = ?                               ");

            //RECUPERAR A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //INSTANCIAR O COMANDO
            PreparedStatement stmt = conn.prepareStatement(str.toString());

            //CRIAÇÃO DE PARAMETROS
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
//            stmt.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTimeInMillis()));

                //PEGA A DATA CORRENTE, ASSIM NÃO DÁ ERRO
                Calendar today = Calendar.getInstance();
                cliente.setDataNascimento(today);

                stmt.setDate(3, new java.sql.Date(today.getTimeInMillis()));

            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getNumeroCartaoFidelidade());
            stmt.setString(6, cliente.getEndereco().getLogradouro());
            stmt.setString(7, cliente.getEndereco().getBairro());
            stmt.setString(8, cliente.getEndereco().getCep());
            stmt.setString(9, cliente.getEndereco().getCidade());
            stmt.setString(10, cliente.getEndereco().getComplemento());
            stmt.setString(11, cliente.getEndereco().getNumero());
            stmt.setString(12, cliente.getEndereco().getUf());
            stmt.setInt(13, cliente.getId());

            //EXECUTAR O COMANDO
            //numeroLinhasAfetadas = stmt.executeUpdate(str.toString());
            numeroLinhasAfetadas = stmt.executeUpdate();

            //FECHAR OS RECURSOS
            stmt.close();
            conn.close();

        } catch (SQLException e) {

            System.out.println(e);
        }

        return numeroLinhasAfetadas;

    }

    public Cliente obterPorId(int id) {

        Cliente cliente = new Cliente();

        try {

            StringBuilder str = new StringBuilder();

            str.append("select  a.id_cliente                   ");
            str.append("        ,a.nome                        ");
            str.append("        ,a.telefone                    ");
            str.append("        ,a.data_nascimento             ");
            str.append("        ,a.email                       ");
            str.append("        ,a.numero_cartao_fidelidade    ");
            str.append("        ,a.logradouro                  ");
            str.append("        ,a.bairro                      ");
            str.append("        ,a.cep                         ");
            str.append("        ,a.complemento                 ");
            str.append("        ,a.numero                      ");
            str.append("        ,a.uf                          ");
            str.append("        ,a.cidade                      ");
            str.append(" from cliente a                        ");
            str.append(" where a.id_cliente = ?                ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT           
            PreparedStatement stmt = conn.prepareStatement(str.toString());

            //PASSAR O PARAMETRO DE ID
            stmt.setInt(1, id);

            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery();

            //PERCORRE TODOS OS REGISTROS DO RESULT SET
            while (rs.next()) {
                //Cliente cliente = new Cliente();

                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));

                //CONVERTER SQL DATE TO CALENDAR
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(rs.getDate("data_nascimento"));
                cliente.setDataNascimento(calendar);

              

                cliente.setEmail(rs.getString("email"));
                cliente.setNumeroCartaoFidelidade(rs.getString("numero_cartao_fidelidade"));

                //POPULAR/CARREGAR OS ATRIBUTOS DO ENDEREÇO
                Endereco end = new Endereco();
                end.setLogradouro(rs.getString("logradouro"));
                end.setNumero(rs.getString("numero"));
                end.setBairro(rs.getString("bairro"));
                end.setCep(rs.getString("cep"));
                end.setCidade(rs.getString("cidade"));
                end.setUf(rs.getString("uf"));
                end.setComplemento(rs.getString("complemento"));

                //INCLUIR O OBJETO ENDEREÇO NA ATRIBUTO DO CLIENTE
                cliente.setEndereco(end);

            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return cliente;
    }

}
