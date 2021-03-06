package dao;

import db.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudUtil {
    private static PreparedStatement getPreparedStatement(String sql, Object... args) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement= DBConnection.getInstance().getConnection().prepareStatement(sql);
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
            preparedStatement.setObject(i+1,args[i]);
        }
        return preparedStatement;
    }
    public static boolean executeUpdate(String sql, Object... args) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement=getPreparedStatement(sql, args);
        return preparedStatement.executeUpdate()>0;
    }
    public static ResultSet executeQuery(String sql, Object... args) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement=getPreparedStatement(sql, args);
        return preparedStatement.executeQuery();

    }
}
