package jpa.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "user")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private String account;
    @Column
    private String pwd;

    private String token;
}
