package com.mask.marsbuysell;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class MarsbuysellController {

	@RequestMapping(value="/demo")
	private String hello(){
		return "/index.html";
	}

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "helloworld"; // この文字列はテンプレートファイルの名前です
    }
}
