package com.nimko.shppmentorpracktic7.repo;

import com.nimko.shppmentorpracktic7.models.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoEntity,String> {

}
