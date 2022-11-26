package com.example.RESTAPIController;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MyController {
    Map<Integer,User> Users=new HashMap<>();

    @GetMapping("/get_users")
    public List<User> getUsers(){
        return new ArrayList<>(Users.values());
    }
    @PostMapping("/add_user")
    public String addUsers(@RequestParam (value = "id",defaultValue = "1")int id,
                         @RequestParam(value="name",defaultValue = "default")String name,
                         @RequestParam(value = "number", defaultValue = "0")int number,
                         @RequestParam(value = "mail",defaultValue = "not known")String mail){
        User user=new User(id,name,number,mail);
        Users.put(id,user);
        return ("Added "+name+" successfully");
    }
    @PutMapping("/update_user")
    public String updateUser(@RequestParam("id")int id,
                           @RequestParam("name")String name,
                           @RequestParam("number")int number,
                           @RequestParam("mail")String mail){
        User user=new User(id,name,number,mail);
        if(!Users.containsKey(id)){
            Users.put(id,user);
            return "Added Successfully";
        }
        Users.put(id,user);
        return "Updated Successfully";
    }
    @DeleteMapping("/delete_user")
    public String deleteUser(@RequestParam("id")int id){
        if(Users.containsKey(id)){
            Users.remove(id);
            return ("Deleted "+id+" Successfully");
        }
        return "User not found";
    }
}
