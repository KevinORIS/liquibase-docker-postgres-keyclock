package com.example.demo.controller;

import com.example.demo.entity.Child;
import com.example.demo.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ChildController {

    @Autowired
    ChildService childService;

    @GetMapping("/look")
    public List<Child> getAllChildren(){
        return childService.getChildren();
    }

    @GetMapping("/insert")
    public Child insertChild(@RequestBody Child child){
        return childService.insertChild(child);
    }
}

