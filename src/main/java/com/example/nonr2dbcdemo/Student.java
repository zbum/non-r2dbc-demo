package com.example.nonr2dbcdemo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
@Data
public class Student {
    @Id
    private Long id;

    private String name;
}
