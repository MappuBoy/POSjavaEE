package dao;

import javax.json.JsonArray;
import java.sql.SQLException;

public interface CrudDao <T,ID> extends SuperDAO {
        boolean add(T t) throws SQLException,ClassNotFoundException;
        boolean update(T t) throws SQLException,ClassNotFoundException;
        boolean delete(ID id) throws SQLException,ClassNotFoundException;


}
