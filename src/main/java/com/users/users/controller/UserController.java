package com.users.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.users.model.User;
import com.users.users.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  private UserService userService;

  // GET /api/users
  @GetMapping("")
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }

  // GET /api/users/{id}
  @GetMapping("/{id}")
  public User getUserById(@PathVariable Long id) {
    return userService.getUserById(id);
  }

  // GET /api/users/email/{email}
  @GetMapping("/email/{email}")
  public User getUserByEmail(@PathVariable String email) {
    return userService.getUserByEmail(email);
  }

  // POST /api/users
  @PostMapping("")
  public User addUser(@RequestBody User user) {
    return userService.addUser(user);
  }

  // PUT /api/users
  @PutMapping("")
  public User updateUser(@RequestBody User user) {
    return userService.updateUser(user);
  }

  // DELETE /api/users/{id}
  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable Long id) {
    userService.deleteUser(id);
  }
}
