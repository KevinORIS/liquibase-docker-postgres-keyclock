package com.example.demo.repo;

import com.example.demo.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Integer> {
}
