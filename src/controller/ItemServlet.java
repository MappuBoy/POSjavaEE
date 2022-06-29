package controller;

import dao.CrudDao;
import dao.DAOFactory;
import dto.ItemDTO;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/item")
public class ItemServlet extends HttpServlet {
    CrudDao<ItemDTO, String> itemDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*
        resp.setContentType("application/json");

        resp.getWriter().print(itemDAO.getAll());*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ItemDTO item = new ItemDTO(req.getParameter("floatingInputValueItemID"),
                req.getParameter("floatingInputValueItemName"),
                Integer.parseInt(req.getParameter("floatingInputValueItemQtyOnHand")),
                Double.parseDouble(req.getParameter("floatingInputValueUnitPrice")));

        try {
            if (itemDAO.add(item)) {

            } else {

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            JsonObject itemJson = Json.createReader(req.getReader()).readObject();
            ItemDTO item = new ItemDTO(itemJson.getString("id"),itemJson.getString("brand"),
                    Integer.parseInt(itemJson.getString("qty")),Double.parseDouble(itemJson.getString("unitprice")));

            if (itemDAO.update(item)) {

            } else {

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            if(itemDAO.delete(req.getParameter("id"))) {

            } else {

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
