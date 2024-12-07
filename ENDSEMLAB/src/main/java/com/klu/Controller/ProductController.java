package com.klu.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }
}
