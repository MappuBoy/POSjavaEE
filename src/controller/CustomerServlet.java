package controller;

import dao.CrudDao;
import dao.DAOFactory;
import entity.Customer;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    CrudDao<Customer,String> customerDAO= DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*resp.setContentType("application/json");
        resp.getWriter().print(customerDAO.getAll());*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Customer customer = new Customer(req.getParameter("custId"), req.getParameter("custName"),
                    req.getParameter("custAddress"),req.getParameter("custTpNumber"));
            customerDAO.add(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {


        try {
            JsonObject customerJson = Json.createReader(req.getReader()).readObject();
            Customer customer = new Customer(customerJson.getString("id"), customerJson.getString("name"),
                    customerJson.getString("address"),customerJson.getString("contact"));

            if (customerDAO.update(customer)) {

            }else {

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            if (customerDAO.delete(req.getParameter("id"))){

            } else {

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
