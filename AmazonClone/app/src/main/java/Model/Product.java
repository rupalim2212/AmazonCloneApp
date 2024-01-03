package Model;

import java.math.BigDecimal;

public class Product {

    private int pId;
    private String pName;
    private BigDecimal pPrice;
    private String pDescription;
    private String pImageName;

    public Product() {
        super();
    }

    public Product(int pId, String pName, BigDecimal pPrice, String pDescription, String pImageName) {
        setpId(pId);
        setpName(pName);
        setpPrice(pPrice);
        setpDescription(pDescription);
        setpImageName(pImageName);

    }

    public int getpId() {
        return pId;
    }

    public String getpName() {
        return pName;
    }
    public BigDecimal getpPrice() {
        return pPrice;
    }

    public String getpDescription() {
        return pDescription;
    }

    public String getpImageName() {
        return pImageName;
    }
    public void setpId(int id) {
        this.pId = id;
    }

    public void setpName(String name) {
        this.pName = name;
    }
    public void setpPrice(BigDecimal price) {
        this.pPrice = price;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;

    }
    public void setpImageName(String imageName) {
        this.pImageName = imageName;
    }
}



