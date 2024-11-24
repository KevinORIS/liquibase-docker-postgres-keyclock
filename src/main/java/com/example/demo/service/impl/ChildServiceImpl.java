package com.example.demo.service.impl;

import com.example.demo.entity.Child;
import com.example.demo.repo.ChildRepository;
import com.example.demo.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChildServiceImpl implements ChildService {
    @Autowired
    private ChildRepository childRepository;

    @Override
    public Child insertChild(Child child) {
        return childRepository.save(child);
    }

    @Override
    public List<Child> getChildren() {
        return childRepository.findAll();
    }
}
