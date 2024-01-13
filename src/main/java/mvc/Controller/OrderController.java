package mvc.Controller;

import mvc.Entity.OrderDetailsEntity;
import mvc.Entity.OrdersEntity;
import mvc.Repository.OrderDetailsRepository;
import mvc.Repository.OrdersRepository;
import mvc.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
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
    public String editOrder(@PathVariable("orderId") int orderId, Model model, HttpSession session) {
        // Lấy thông tin đơn hàng từ cơ sở dữ liệu dựa trên orderId
        OrdersEntity order = orderService.getOrderById(orderId);
        session.setAttribute("infomation", order);

        // Đưa thông tin đơn hàng vào model để hiển thị trên trang chỉnh sửa
        model.addAttribute("order", order);

        return "OrderHome/EditOrder"; // Trả về trang chỉnh sửa Order
    }

    @RequestMapping(value = "/editOrder/update", method = RequestMethod.POST,  produces = "text/html; charset=UTF-8")
    public String updateOrder(
                              @RequestParam("orderDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date orderdate,
                              @RequestParam("customerName") String customer,
                              HttpSession session
                             ){
        // Xử lý cập nhật thông tin đơn hàng với orderId
        System.out.println("Họ tên: " + customer);
        OrdersEntity orders = (OrdersEntity) session.getAttribute("infomation");
        OrdersEntity ordersEntity = orderService.getOrderById(orders.getOrderId());
        ordersEntity.setOrderDate(orderdate);
        ordersEntity.setCustomerName(customer);
        ordersRepository.save(ordersEntity);

        return "redirect:/"; // Trả về trang danh sách đơn hàng sau khi cập nhật
    }
}
