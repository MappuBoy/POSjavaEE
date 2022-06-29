package dao.custom.impl;

import dao.CrudDao;
import dao.CrudUtil;
import dao.custom.CustomerDAO;
import entity.Customer;

import java.sql.SQLException;

public class CustomerDaoImpli implements CustomerDAO{



    @Override
    public boolean delete(String customerID) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE cust_id=?",customerID);

    }

    @Override
    public boolean update(Customer customer) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("UPDATE customer SET cust_name=?,Cust_address =?,cust_tp=? WHERE cust_id=?",customer.getName(),customer.getAdderss(),customer.getTp(),customer.getCustid());
    }

    @Override
    public boolean add(Customer customer) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?)",customer.getCustid(),customer.getName(),customer.getAdderss(),customer.getTp());

    }
}
