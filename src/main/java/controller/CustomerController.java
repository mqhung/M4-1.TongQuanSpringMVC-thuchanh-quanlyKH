package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @GetMapping("")
    public ModelAndView showList() {
        CustomerService customerService = new CustomerService();
        List<Customer> list = customerService.showAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("listCustomer",list);
        return modelAndView;
    }
}
