package com.cruds.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "user_metas")
public class UserMeta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @OneToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id")
    private User a_user; 

    @Column(name = "phone", length = 100)
    private String b_phone;

    @Column(name = "country", length = 100)
    private String c_country;

    @Column(name = "age", length = 2)
    private Integer d_age;

    @Column(name = "address", columnDefinition = "TEXT")
    private String Address;

    @Column(name = "image")
    private String e_image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getA_user() {
        return a_user;
    }

    public void setA_user(User a_user) {
        this.a_user = a_user;
    }

    public String getB_phone() {
        return b_phone;
    }

    public void setB_phone(String b_phone) {
        this.b_phone = b_phone;
    }

    public String getC_country() {
        return c_country;
    }

    public void setC_country(String c_country) {
        this.c_country = c_country;
    }

    public Integer getD_age() {
        return d_age;
    }

    public void setD_age(Integer d_age) {
        this.d_age = d_age;
    }

    public String getE_image() {
        return e_image;
    }

    public void setE_image(String e_image) {
        this.e_image = e_image;
    }


}
