package com.example.demo.service;

import com.example.demo.entity.Child;

import java.util.List;

public interface ChildService {
    List<Child> getChildren();
    Child insertChild(Child child);
}
