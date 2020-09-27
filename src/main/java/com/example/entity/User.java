//package com.example.entity;
//
//import lombok.Data;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//
//@Entity
//@Data
//@Table(name = "tb_user")
//public class User {
//    @Id
//    @GenericGenerator(name = "idGenerator", strategy = "uuid")
//    @GeneratedValue(generator = "idGenerator")
//    private String id;
//
//    @Column(name = "username", unique = true, nullable = false, length = 64)
//    private String username;
//
//    @Column(name = "password", nullable = false, length = 64)
//    private String password;
//
//    @Column(name = "email", length = 64)
//    private String email;
//
//}
