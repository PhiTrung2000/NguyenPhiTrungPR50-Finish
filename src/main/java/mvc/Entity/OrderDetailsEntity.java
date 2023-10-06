package mvc.Entity;


import javax.persistence.*;

@Entity
@Table(name = "OrdersDetails")
public class OrderDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderDetailsId")
    private int orderDetailsId;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private OrdersEntity order;

    @ManyToOne
    @JoinColumn(name = "proId")
    private ProductsEntity product;

    @Column(name = "quantity")
    private int quantity;

    public OrderDetailsEntity() {
    }

    public int getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(int orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public OrdersEntity getOrder() {
        return order;
    }

    public void setOrder(OrdersEntity order) {
        this.order = order;
    }

    public ProductsEntity getProduct() {
        return product;
    }

    public void setProduct(ProductsEntity product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
