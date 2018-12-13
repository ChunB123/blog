package tech.chunb123.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.chunb123.blog.web.vo.CommonVO;

/**
 * @author YaphetS
 * @date 2018/12/12
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @PostMapping("/login")
    public CommonVO login(){
        return null;
    }
}
