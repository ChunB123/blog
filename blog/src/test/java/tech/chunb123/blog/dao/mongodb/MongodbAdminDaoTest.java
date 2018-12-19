package tech.chunb123.blog.dao.mongodb;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tech.chunb123.blog.pojo.Admin;

/**
 * @author YaphetS
 * @date 2018/12/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbAdminDaoTest {

    @Autowired
    private MongodbAdminDao dao;

    @Test
    public void save() {
        dao.save(new Admin("user","123"));
    }

    @Test
    public void findByUsername() {
        Admin admin=dao.findByUsername(new Admin("user","456"));
        Assert.assertEquals(admin.getPassword(),"123");
    }
}