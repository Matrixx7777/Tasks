package com.crud.tasks.service;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbService {

    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() { return repository.findAll(); }

    public Task getFindByIdTask(Long taskId) { return repository.findTaskById(taskId); }

    public Optional<Task> getTask(final Long taskId) { return repository.findById(taskId); }

    public Task saveTask(final Task task) { return repository.save(task); }

    public void deleteTask(final Long taskId) { repository.deleteById(taskId); }
}