package cadprodutos.Dao;

import cadprodutos.models.TipoProduto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoProdutoDao extends BaseDao {
    public TipoProdutoDao() throws ClassNotFoundException, SQLException{
        super();
    }
    public ArrayList<TipoProduto> Listar() throws SQLException{
        PreparedStatement st = connection.prepareStatement("Select * from TipoProduto");
        ResultSet rs = st.executeQuery();
        ArrayList<TipoProduto> tipoprodutos = new ArrayList<TipoProduto>();
        while(rs.next()){
            TipoProduto tp = new TipoProduto();
            tp.setCodigo(rs.getInt(1));
            tp.setNome(rs.getString(2));
            tipoprodutos.add(tp);
        }
        return tipoprodutos;
    }
}
