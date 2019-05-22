package cadprodutos.Controller;

import cadprodutos.Dao.ProdutoDao;
import cadprodutos.models.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoController 
{
    private ProdutoDao produtoDao;
    
    public ProdutoController() throws ClassNotFoundException, SQLException {
        produtoDao = new ProdutoDao();
    }
    
    public ArrayList<Produto> Listar() throws SQLException, ClassNotFoundException
    {
        return produtoDao.Listar();
    }
    
    public void Inserir(Produto p) throws ClassNotFoundException, SQLException
    {
        produtoDao.Inserir(p);
    }

    public Produto BuscarPeloCodigo(int codigoProduto) throws ClassNotFoundException, SQLException
    {
        return produtoDao.BuscarPeloCodigo(codigoProduto);
    }

    public void Atualizar(Produto produto) throws SQLException, ClassNotFoundException {
        produtoDao.Atualizar(produto);
    }

    public void Remover(int codigoProdutoSelecionado) throws ClassNotFoundException, SQLException {
        produtoDao.Remover(codigoProdutoSelecionado);
    }
}
