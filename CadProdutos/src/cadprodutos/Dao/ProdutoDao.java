package cadprodutos.Dao;

import cadprodutos.models.Produto;
import cadprodutos.models.TipoProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDao extends BaseDao
{
    public ProdutoDao() throws ClassNotFoundException, SQLException{
        super();
    }
    public void Inserir(Produto P) throws ClassNotFoundException, SQLException
    {
        Connection conexao = Database.getConexao();
        PreparedStatement ps = conexao.prepareStatement("Insert into Produto(Nome, Valor, CodTipo)"
                + "Values (?,?,?)");
        ps.setString(1, P.getNome());
        ps.setDouble(2, P.getValor());
        ps.setInt(3, P.getTipo().getCodigo());
        ps.executeUpdate();
    }

    public ArrayList<Produto> Listar() throws SQLException, ClassNotFoundException {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        Connection conexao = Database.getConexao();
        PreparedStatement ps = conexao.prepareStatement("SELECT p.codigo, p.nome, p.valor, p.codtipo, tp.nome FROM Produto p JOIN TipoProduto tp ON p.codtipo = tp.codigo");
        ResultSet rs = ps.executeQuery();
        
        while(rs.next())
        {
            Produto produto = new Produto();
            
            int codigo = rs.getInt(1);
            String nomeProduto = rs.getString(2);
            double valor = rs.getInt(3);
            int codigoTipo = rs.getInt(4);
            String nomeTipo = rs.getString(5);

            TipoProduto tp = new TipoProduto();
            tp.setCodigo(codigoTipo);
            tp.setNome(nomeTipo);
            
            produto.setCodigo(codigo);
            produto.setNome(nomeProduto);
            produto.setValor(valor);
            produto.setTipo(tp);
            
            produtos.add(produto);
        }
        
        return produtos;
    }

    public Produto BuscarPeloCodigo(int codigoProduto) throws ClassNotFoundException, SQLException {
        Produto produto = null;
        
        Connection conexao = Database.getConexao();
        PreparedStatement ps = conexao.prepareStatement("SELECT p.codigo, p.nome, p.valor, p.codtipo, tp.nome FROM Produto p JOIN TipoProduto tp ON p.codtipo = tp.codigo WHERE p.codigo = ?");
        ps.setInt(1, codigoProduto);
        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
            produto = new Produto();
            
            int codigo = rs.getInt(1);
            String nomeProduto = rs.getString(2);
            double valor = rs.getInt(3);
            int codigoTipo = rs.getInt(4);
            String nomeTipo = rs.getString(5);

            TipoProduto tp = new TipoProduto();
            tp.setCodigo(codigoTipo);
            tp.setNome(nomeTipo);
            
            produto.setCodigo(codigo);
            produto.setNome(nomeProduto);
            produto.setValor(valor);
            produto.setTipo(tp);
        }
        
        return produto;        
    }

    public void Atualizar(Produto p) throws SQLException, ClassNotFoundException {
        Connection conexao = Database.getConexao();
        PreparedStatement ps = conexao.prepareStatement("Update Produto set Nome = ?, Valor = ?, CodTipo = ? WHERE Codigo = ?");
        ps.setString(1, p.getNome());
        ps.setDouble(2, p.getValor());
        ps.setInt(3, p.getTipo().getCodigo());
        ps.setInt(4, p.getCodigo());
        ps.executeUpdate();
    }

    public void Remover(int codigoProdutoSelecionado) throws ClassNotFoundException, SQLException {
        Connection conexao = Database.getConexao();
        PreparedStatement ps = conexao.prepareStatement("Delete from Produto WHERE Codigo = ?");
        ps.setInt(1, codigoProdutoSelecionado);
        ps.executeUpdate();
    }
}
