package com.example.demo.domain;
import com.example.demo.dto.DefaultDto;
import com.example.demo.dto.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
public class User extends AuditingFields{
    @Setter @Column(nullable=false, unique=true)
    String username;
    @Setter @Column(nullable=false)
    String password;
    @Setter
    String name;
    @Setter
    String phone;

    protected User(){}
    private User(Boolean deleted, String username, String password, String name, String phone){
        this.deleted = deleted;
        this.username = username;
        this.password = password;
        this.name = name;
        this.phone = phone;
    }

    public static User of(String username, String password, String name, String phone){
        return new User(false, username, password, name, phone);
    }

    public DefaultDto.CreateResDto toCreateResDto() {
        return DefaultDto.CreateResDto.builder().id(getId()).build();
    }
}

/*
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id Integer id;

    @Setter @Column(unique=true, nullable=false)
    String username;

    @Setter @Column(nullable=false)
    String password;

    @Setter String name;
    @Setter String phone;
}
*?
 */
