package dao.custom.impl;

import dao.CrudDao;
import dao.CrudUtil;
import dao.custom.ItemDAO;
import entity.Item;

import java.sql.SQLException;

public class ItemDaoImpl implements ItemDAO {
    @Override
    public boolean add(Item item) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO item VALUES (?,?,?,?)",item.getItemCode(),item.getDiscription(),
                item.getQtyInHand(),item.getUnitPrice());

    }

    @Override
    public boolean update(Item item) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("UPDATE item SET `description`=?,`qtyOnHand`=?, `unitPrice`=? WHERE item_Code=?",
                item.getDiscription(),item.getQtyInHand(),item.getUnitPrice(),item.getItemCode());

    }

    @Override
    public boolean delete(String itemCode) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE Itemid=?",itemCode);
    }
}
