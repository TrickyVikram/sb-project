package in.onvtech.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.onvtech.project.services.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@Controller
public class MyController {

    private UserService userService;

    @GetMapping("/")
    @ResponseBody
    public String home() {

        return "body";

    }

    @GetMapping("user_list")
    public String userList() {
        return userService.getAllUsers();
    }

    @GetMapping("user_view/{id}")
    public String userView() {

        return "user";
    }

    @PostMapping("/user_add")
    public String userAdd() {

        return "user";
    }

    @PutMapping("user_update/{id}")
    public String userUpdate() {

        return "user";
    }

        @DeleteMapping("user_delete/{id}")
    public String userDelete() {

        return "user";
    }

}
