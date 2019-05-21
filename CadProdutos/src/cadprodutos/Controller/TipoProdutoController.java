package cadprodutos.Controller;

import cadprodutos.Dao.TipoProdutoDao;
import cadprodutos.models.TipoProduto;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoProdutoController {
    private TipoProdutoDao Dao;

    public TipoProdutoController() throws ClassNotFoundException, SQLException{
        Dao = new TipoProdutoDao();
    }

    public ArrayList<TipoProduto>Listar() throws SQLException{
        return Dao.Listar();
    }

    public void Inserir(TipoProduto novo) throws ClassNotFoundException, SQLException {
        Dao.Inserir(novo);
    }
}
