package dto;

public class OrderDTO {
    private String orderId;
    private String custid;
    private double price;

    public OrderDTO() {
    }

    public OrderDTO(String orderId, String custid, double price) {
        this.orderId = orderId;
        this.custid = custid;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
