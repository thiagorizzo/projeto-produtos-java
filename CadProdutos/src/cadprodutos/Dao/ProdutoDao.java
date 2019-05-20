package cadprodutos.Dao;

import cadprodutos.models.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
