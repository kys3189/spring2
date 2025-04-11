package com.app.controller.controller;

import com.app.controller.domain.PostVO;
import com.app.controller.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequestMapping("/post/*")
@RequiredArgsConstructor
public class PostController {

    private final PostMapper postMapper;

//    포스트 리스트
    @GetMapping("list")
    public void goToList(Model model) {
        model.addAttribute("posts", postMapper.selectAll());
    }
}
