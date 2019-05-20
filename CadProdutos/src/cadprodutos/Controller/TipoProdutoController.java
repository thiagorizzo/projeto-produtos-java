package cadprodutos.Controller;

import cadprodutos.Dao.TipoProdutoDao;
import cadprodutos.models.TipoProduto;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoProdutoController {
    private TipoProdutoDao Dao;
    
    public ArrayList<TipoProduto>Listar() throws SQLException{
        return Dao.Listar();
    }
    
    public TipoProdutoController() throws ClassNotFoundException, SQLException{
        Dao = new TipoProdutoDao();
    }
}
