package tech.chunb123.blog.pojo;

import lombok.Data;

/**
 * @author YaphetS
 * @date 2018/12/13
 */
@Data
public class Admin {
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
