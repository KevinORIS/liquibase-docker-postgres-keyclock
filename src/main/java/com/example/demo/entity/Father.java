package com.example.demo.entity;

import lombok.Data;

@Data
public class Father {
  public String name;
  public Integer age;

  public Child createChild() {
  return null;
  }

}