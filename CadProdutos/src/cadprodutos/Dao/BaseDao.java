package cadprodutos.Dao;

import java.sql.Connection;
import java.sql.SQLException;

public class BaseDao {
    protected Connection connection;
    public BaseDao() throws ClassNotFoundException, SQLException{
        connection = Database.getConexao();
    }
}
