package com.its.req;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    //스프링이 관리하는 객체를 쓰려면
    // Autowired : 객체를 주입한다.
    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    // '/welcome' 요청 처리
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/form-ex")
    public String form_ex(){
        return "form-ex";
    }

    @GetMapping("/param-req1")
    public String paramReq1(@RequestParam("param1") String param1,
                            @RequestParam("param2") String param2, Model model){
        System.out.println("param1 =" + param1 + "param2 =" + param2);
        System.out.println("HomeController.paramReq1");
        //홈서비스 클래스의 서비스메서드1 메서드를 호출하면서
        // param1,param2를 넘기고 서비스 메서드에서는 param1,param2의 값을 출력
        // HomeService homeService = new HomeService();
        homeService.serviceMethod1(param1, param2);

        // param1, param-print.jsp로 가져가서 출력
        model.addAttribute("pa1",param1);
        model.addAttribute("pa2",param2);

        return "param-print";
    }



}
