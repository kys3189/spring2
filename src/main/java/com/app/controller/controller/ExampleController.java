package com.app.controller.controller;

import com.app.controller.domain.ProdectVO;
import com.app.controller.domain.UserVO;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ex/*")
@Slf4j
public class ExampleController {
//  보이드로 템플리츠 매핑으로 찾아갈 수 있다.
    @GetMapping("ex01")
    public void ex01() {
        log.info("ex01 여기 실행됨!");
    }
//    ex/ex02?name=홍길동
//    @GetMapping("ex02")
//    public void ex02(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        log.info(name);
//    }
//    @GetMapping("ex02")
//    public void ex02(String name, Model model, HttpServletRequest request) {
//        log.info(name);
////        모델이 화면쪽에서 사용하기 좀 더 편함
//        model.addAttribute("name", name);
//        request.setAttribute("name", name);
//    }
    @GetMapping("ex02")
    public void ex02(@ModelAttribute("name") String name) {
        log.info(name);
    }

    @GetMapping("ex03")
    public void ex03(String name, int age, Model model) {
        log.info("name : {}", name);
        log.info("age: {}", age);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
    }

    @GetMapping("ex04")
//    쿼리스트링값을 매핑해줘야 스프링부트가 값을 잘못들고오는 경우를 방지할 수 있다.
    public void ex04(@RequestParam("job") String job, @RequestParam("name") String name, Model model) {
        model.addAttribute("job", job);
        model.addAttribute("name", name);
        log.info("job : {}", job);
        log.info("name : {}", name);
    }
//    ex05
//    화면에서 userVO 받기
    @GetMapping("ex05")
    public void ex05(UserVO user) {
        log.info("user : {}", user);
    }
    
//    상품이름, 상품가격
//    prodectVO로 생성한 후
//    화면에서 ex06으로 요청했을 때 log로 VO 출력하기
    @GetMapping("ex06")
    public void ex06(@ModelAttribute ProdectVO prodectVO) {
        log.info("prodect : {}", prodectVO);
    }

}
