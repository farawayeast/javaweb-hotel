package by.bsu.web.entity;

/**
 * @description:
 * @author: YANG
 * @createDate: 2022/05/23/18:57
 */
public class User {
    private Long id;
    private String name;
    private Integer isAdmin;

    public User() {
    }

    public User(Long id, String name, Integer adminFlag) {
        this.id=id;
        this.name=name;
        this.isAdmin=adminFlag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }
}
