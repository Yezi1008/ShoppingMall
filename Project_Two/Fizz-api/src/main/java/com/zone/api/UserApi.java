package com.zone.api;

import com.zon.service.UserService;
import com.zone.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/users", produces = "application/json;charset=utf-8")
public class UserApi {
    private final UserService userService;

    public UserApi(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{username}")
    public ResponseEntity<Map<String, Object>> findByUsername(@PathVariable String username){
        User user=userService.findByUsername(username);
        if (user==null){
            return ResponseEntity.noContent().build();
            //没找到，返回状态码说明
        }else {
            //return ResponseEntity.ok(Map.of("success",200));
            return ResponseEntity.ok(Map.of("user",user));
        }
    }
}
