package com.hy.demo.controller;

import com.hy.demo.models.User;
import com.hy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    public User test() {
        User user = userService.getOne(1);
        return user;
    }

    @RequestMapping(value = "/save",method = RequestMethod.GET )
    public User save() {
        User user = new User();
        user.setAge(22);
        user.setGender("男");
        user.setUsername("王二");
        userService.save(user);
        return user;
    }
//
//    @Scheduled(cron= "0/2 * * * * ?")
//    public void schedule() {
//        System.out.println(System.currentTimeMillis());
//    }

    /**
     * http://localhost:8777/demo/test1/1/2
     * @param id
     * @param sid
     * @return
     */
    @RequestMapping("/test1/{id}/{id2}")
    public String test1(@PathVariable(name = "id") String id, @PathVariable(name="id2") String sid) {
        return id + sid;
    }

    @RequestMapping(name = "/test2",value = "/test3")
    public String test2() {
        return "test2";
    }

    @RequestMapping(value = "/test4",method = RequestMethod.GET)
    public String test4(@RequestParam(name = "id") String sid) {
        return "test4";
    }

}
