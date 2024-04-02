package fr.jc.malistedecadeaux.dao;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class BDDConnect {
    private static Connection connection;
    private final static String SERVER_NAME = "127.0.0.1";
    private final static int PORT_NUMBER = 1434;
    private final static String DATABASE_NAME = "BDD_malistedecadeaux_v1";
    private final static String USER = "sa";
    private final static String PASSWORD = "123456@azerty";

    private BDDConnect(){}

    public static Connection getInstance(){
        if (connection == null) {
            try {
                SQLServerDataSource ds = new SQLServerDataSource();
                ds.setServerName(SERVER_NAME);
                ds.setPortNumber(PORT_NUMBER);
                ds.setDatabaseName(DATABASE_NAME);
                ds.setUser(USER);
                ds.setEncrypt(false);
                ds.setPassword(PASSWORD);
                connection = ds.getConnection();
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return connection;
    }

}
