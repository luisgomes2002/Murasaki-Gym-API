package gym.murasaki.MurasakiGym.infrastructure.persistence;

import gym.murasaki.MurasakiGym.core.enums.UserTypes;
import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public abstract class Users {

    @Id
    private Long id;
    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserTypes type;

    private Date created_at;
    private Date updated_at;

    @Column(nullable = true)
    private int age;

    public Users() {
    }

    public Users(String name, String email, String password, UserTypes type, Date created_at, Date updated_at, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserTypes getType() {
        return type;
    }

    public void setType(UserTypes type) {
        this.type = type;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
