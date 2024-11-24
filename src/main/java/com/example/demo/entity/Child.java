package com.example.demo.entity;

import lombok.Data;

@Data
public class Child {
  private String name;
  private Integer age;
  public ChildState state;

}