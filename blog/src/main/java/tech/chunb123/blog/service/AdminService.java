package tech.chunb123.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.chunb123.blog.dao.AdminDao;
import tech.chunb123.blog.pojo.Admin;

/**
 * @author YaphetS
 * @date 2018/12/13
 */
@Service
public class AdminService {

    @Autowired
    private AdminDao adminDao;

    public void save(Admin admin) {
        adminDao.save(admin);
    }

    /**
     * 校验用户名和密码
     * @param admin
     * @return
     */
    public Boolean verify(Admin admin) {
        Admin realAdmin=adminDao.findByUsername(admin);
        if(realAdmin!=null){
            return realAdmin.getPassword().equals(admin.getPassword());
        }
        return false;
    }
}
