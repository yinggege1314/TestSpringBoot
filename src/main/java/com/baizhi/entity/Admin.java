package com.baizhi.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Admin implements Serializable {
    private String id;
    private String name;
    private String passowrd;
}
