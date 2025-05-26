package com.islandercart.users;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	
	@Autowired
    private final UserService userService;

    @PostMapping
    public UserDTO createUser(@RequestBody UserAuth userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

    @GetMapping("/email/{email}")
    public UserDTO getUserByEmail(@PathVariable("email") String email) {
        return userService.getUserByEmail(email);
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") String id) {
        userService.deleteUser(id);
    }
    
    @PostMapping("/authenticate")
    public ResponseEntity<UserDTO> authenticate(@RequestBody UserAuth user){
    	return userService.authenticate(user);
    }
    
    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") String id, @RequestBody UserAuth updatedUser) {
        return userService.updateUser(id, updatedUser);
    }

}

