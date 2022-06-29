package dto;

public class CustomerDTO {
    private String custid;
    private String name;
    private String adderss;
    private String tp;

    public CustomerDTO() {
    }

    public CustomerDTO(String custid, String name, String adderss, String tp) {
        this.custid = custid;
        this.name = name;
        this.adderss = adderss;
        this.tp = tp;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }
}
