package tech.chunb123.blog.dao;

import tech.chunb123.blog.pojo.Admin;

/**
 * @author YaphetS
 * @date 2018/12/13
 */
public interface AdminDao {
    /**
     * 保存管理员
     * @param admin
     */
    void save(Admin admin);

    /**
     * 根据name查管理员
     * @param admin
     * @return
     */
    Admin findByUsername(Admin admin);
}
