package projekan.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class baseModel {
    private String dbUrl;
    private String dbUser;
    private String dbPassword;
    public Connection connection;

    public baseModel() throws SQLException {
        dbUrl = "jdbc:postgresql://localhost/penggajian";
        dbUser = "postgres";
        dbPassword = "nindy2001";

        connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
    }
}
