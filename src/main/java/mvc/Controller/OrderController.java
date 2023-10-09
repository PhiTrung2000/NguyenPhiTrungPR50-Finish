package mvc.Controller;

import mvc.Entity.OrderDetailsEntity;
import mvc.Entity.OrdersEntity;
import mvc.Repository.OrderDetailsRepository;
import mvc.Repository.OrdersRepository;
import mvc.Service.OrderService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value="/")
public class OrderController {
    @Autowired
    OrdersRepository ordersRepository;
    @Autowired
    OrderDetailsRepository orderDetailsRepository;
    @RequestMapping(method = RequestMethod.GET)
    public String showBooks(Model model){
        List<OrdersEntity> ordershow = (List<OrdersEntity>) ordersRepository.findAll();
        model.addAttribute("ordershow", ordershow);
        return "OrderHome/OrderShow";
    }
    @RequestMapping(value = "/orderDetails/{orderId}", method = RequestMethod.GET)
    public String showOrderDetails(@PathVariable("orderId") int orderId, Model model) {
        List<OrderDetailsEntity> orderDetails = orderDetailsRepository.findByOrderId(orderId);
        model.addAttribute("orderDetails", orderDetails);
        return "OrderHome/DetailsOrderShow";
    }

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "/editOrder/{orderId}", method = RequestMethod.GET)
    public String editOrder(@PathVariable("orderId") int orderId, Model model) {
        // Lấy thông tin đơn hàng từ cơ sở dữ liệu dựa trên orderId
        OrdersEntity order = orderService.getOrderById(orderId);

        // Đưa thông tin đơn hàng vào model để hiển thị trên trang chỉnh sửa
        model.addAttribute("order", order);

        return "OrderHome/EditOrder"; // Trả về trang chỉnh sửa Order
    }

    @RequestMapping(value = "/editOrder/{orderId}", method = RequestMethod.PUT)
    public String updateOrder(@PathVariable("orderId") int orderId, @ModelAttribute("order") OrdersEntity updatedOrder) {
        // Xử lý cập nhật thông tin đơn hàng với orderId
        orderService.updateOrder(orderId, updatedOrder);

        return "redirect:/NguyenPhiTrungPR50/orders"; // Trả về trang danh sách đơn hàng sau khi cập nhật
    }
}
