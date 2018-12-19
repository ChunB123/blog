package tech.chunb123.blog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.chunb123.blog.pojo.Admin;
import tech.chunb123.blog.service.AdminService;
import tech.chunb123.blog.util.CommonVOUtil;
import tech.chunb123.blog.web.vo.CommonVO;

/**
 * @author YaphetS
 * @date 2018/12/12
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * 注册管理员
     * @return
     */
    @PostMapping("/register")
    public CommonVO register(Admin admin){
        adminService.save(admin);
        return CommonVOUtil.success();
    }

    /**
     * 管理员登陆
     * @param admin
     * @return
     */
    @PostMapping("/login")
    public CommonVO login(Admin admin){
        if(adminService.verify(admin)){
            return CommonVOUtil.success();
        }
        //回写cookie到浏览器


        return CommonVOUtil.error("密码错误");

    }
}
