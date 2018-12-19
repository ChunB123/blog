package tech.chunb123.blog.dao.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tech.chunb123.blog.dao.AdminDao;
import tech.chunb123.blog.dao.mongodb.repository.AdminRepository;
import tech.chunb123.blog.pojo.Admin;

/**
 * @author YaphetS
 * @date 2018/12/13
 */
@Repository
public class MongodbAdminDao implements AdminDao {

    @Autowired
    private AdminRepository adminRepository;


    @Override
    public void save(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public Admin findByUsername(Admin admin) {
        return adminRepository.findByUsername(admin.getUsername());
    }
}
