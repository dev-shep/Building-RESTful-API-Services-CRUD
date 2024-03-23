package com.limoncitoscompany.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
@Entity(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String paternal_surname;
    private String maternal_surname;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date   joining_date;    
    private String level;
    private String pay;
    private String motive;

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public Client() {
    }

    public Client(String name, String paternal_surname, String maternal_surname, Date joining_date,
            String level, String pay,String motive) {
        this.name = name;
        this.paternal_surname = paternal_surname;
        this.maternal_surname = maternal_surname;
        this.joining_date = joining_date;
        this.level = level;
        this.pay = pay;
        this.motive = motive;
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
    public String getPaternal_surname() {
        return paternal_surname;
    }
    public void setPaternal_surname(String paternal_surname) {
        this.paternal_surname = paternal_surname;
    }
    public String getMaternal_surname() {
        return maternal_surname;
    }
    public void setMaternal_surname(String maternal_surname) {
        this.maternal_surname = maternal_surname;
    }
    public Date getJoining_date() {
        return joining_date;
    }
    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getPay() {
        return pay;
    }
    public void setPay(String pay) {
        this.pay = pay;
    }



    
}
