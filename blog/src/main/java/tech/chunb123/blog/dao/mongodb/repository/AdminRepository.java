package tech.chunb123.blog.dao.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.chunb123.blog.pojo.Admin;

/**
 * @author YaphetS
 * @date 2018/12/13
 */
public interface AdminRepository extends MongoRepository<Admin,String> {
    /**
     * 根据名字查找
     * @param username
     * @return
     */
    Admin findByUsername(String username);
}
