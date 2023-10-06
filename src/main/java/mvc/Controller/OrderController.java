package mvc.Controller;

import mvc.Entity.OrdersEntity;
import mvc.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value="/")
public class OrderController {
    @Autowired
    OrdersRepository ordersRepository;
    @RequestMapping(method = RequestMethod.GET)
    public String showBooks(Model model){
        List<OrdersEntity> ordershow = (List<OrdersEntity>) ordersRepository.findAll();
        model.addAttribute("orders", ordershow);
        return "OrderHome/OrderShow";
    }

}
