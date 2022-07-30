package ia.ia.controller;

import ia.ia.DTO.UserDto;
import ia.ia.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("user/{id}")
    UserDto getUser(@PathVariable("id") String id){
        return  this.userService.getUser(id);
    }
    @GetMapping("users")
    List<UserDto> getUsers(){
        return  this.userService.getUsers();
    }

    @PostMapping("add")
    UserDto addUser(@RequestBody() UserDto userDto){
        return  this.userService.insertUser(userDto);
    }
    @GetMapping("delete/{id}")
    String deleteUsers(@PathVariable("id") String id)
    {
        return  this.userService.deleteUser(id);

    }

    @PostMapping("update")
    UserDto updateUsers(@RequestBody() UserDto userDto){
        return  this.userService.UpdateUser(userDto);
    }
}
