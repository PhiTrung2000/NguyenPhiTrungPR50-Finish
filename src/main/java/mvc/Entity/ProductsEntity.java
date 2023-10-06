package mvc.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proId")
    private int proId;

    @Column(name = "proName")
    private String proName;

    @Column(name = "Unitprice")
    private int Unitprice;

    public ProductsEntity() {
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getUnitprice() {
        return Unitprice;
    }

    public void setUnitprice(int unitprice) {
        Unitprice = unitprice;
    }
}
