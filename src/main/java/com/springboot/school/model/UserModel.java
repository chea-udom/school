package com.springboot.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_user")
@Entity
public class UserModel extends PersonModel {

    @Column(name = "pos")
    private int position;

    @Column(name = "phone", length = 15)
    private String phone;
    
}
