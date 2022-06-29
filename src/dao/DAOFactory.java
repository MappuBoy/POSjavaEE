package dao;

import dao.custom.impl.CustomerDaoImpli;
import dao.custom.impl.ItemDaoImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){

    }
    public static DAOFactory getInstance(){
        return null==daoFactory?daoFactory=new DAOFactory():daoFactory;}

    public enum DAOTypes{
        ITEM,CUSTOMER
    }
    public CrudDao getDAO(DAOTypes types){
        switch (types){
            case ITEM:
                return new ItemDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpli();
            default:
                return null;
        }

    }

}
