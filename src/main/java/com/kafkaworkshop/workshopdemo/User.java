package com.kafkaworkshop.workshopdemo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer userId;
    @Column
    private String userName;
}
