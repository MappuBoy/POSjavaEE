package entity;

public class Item {
    private String itemCode;
    private String discription;
    private int qtyInHand;
    private double unitPrice;

    public Item() {
    }

    public Item(String itemCode, String discription, int qtyInHand, double unitPrice) {
        this.itemCode = itemCode;
        this.discription = discription;
        this.qtyInHand = qtyInHand;
        this.unitPrice = unitPrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getQtyInHand() {
        return qtyInHand;
    }

    public void setQtyInHand(int qtyInHand) {
        this.qtyInHand = qtyInHand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
