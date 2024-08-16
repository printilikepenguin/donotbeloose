package com.donotbeloose.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
    // 상품 관련 API는 다 여기 보관하고 싶더용

    @GetMapping("/list")
    String list(Model model) {
        model.addAttribute("name", "정재현");
        return "list.html";
    }
}
