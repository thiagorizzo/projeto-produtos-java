package cadprodutos.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database 
{
    public static Connection getConexao() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String ConnectionString = "jdbc:sqlserver://srv-lab:1433;databaseName=projetoproduto2019";
        return DriverManager.getConnection(ConnectionString, "sa", "unip");
    }
}
