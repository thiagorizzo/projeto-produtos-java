package cadprodutos.Controller;

import cadprodutos.Dao.ProdutoDao;
import cadprodutos.models.Produto;
import java.sql.SQLException;

public class ProdutoController 
{
    ProdutoDao produtoDao = new ProdutoDao();
    public void Inserir(Produto p) throws ClassNotFoundException, SQLException
    {
        produtoDao.Inserir(p);
    }
}
