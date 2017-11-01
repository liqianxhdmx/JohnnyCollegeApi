package com.cherry.college.controller;

import com.cherry.college.vo.UnifiedResponse;
import org.springframework.web.bind.annotation.*;
import com.cherry.college.vo.User;

@RestController
public class UserController {
//    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    public UnifiedResponse<User> getUserInfo(@RequestParam(value = "userId") String userId){
//        UnifiedResponse<User> response = new UnifiedResponse<>();
        User user = new User();
//        if(userId.equals("10001")){
//            user.setUserId(10001);
//            user.setUserName("赵薇");
//            user.setUserSex("女");
//            user.setCollege("北京电影学院");
//        }else{
//            user.setUserId(10002);
//            user.setUserName("黄晓明");
//            user.setUserSex("男");
//            user.setCollege("北京戏剧学院");
//        }

//        response.result = true;
//        response.resCode = "1000";
//        response.resMsg = "success";
//        response.data = user;
//
//        return response;
//    }

//    @RequestMapping(value="/user", method = RequestMethod.POST)
//    public UnifiedResponse<Integer> addUserInfo(@RequestBody User user){
//        UnifiedResponse<Integer> response = new UnifiedResponse<>();
//        response.result = true;
//        response.resCode = "1000";
//        response.resMsg = "add a user";
//        response.data = 1;
//
//        return response;
//    }

//    @RequestMapping(value="/user", method = RequestMethod.PUT)
//    public UnifiedResponse<Integer> changeUserInfo(@RequestBody User user){
//        UnifiedResponse<Integer> response = new UnifiedResponse<Integer>();
//        response.result = true;
//        response.resCode = "1000";
//        response.resMsg = "change a user data";
//        response.data = 1;
//
//        return response;
//    }

//    @RequestMapping(value="/user", method = RequestMethod.DELETE)
//    public UnifiedResponse<Integer> deleteUserInfo(@RequestParam(value = "userId") String userId){
//        UnifiedResponse<Integer> response = new UnifiedResponse<Integer>();
//        response.result = true;
//        response.resCode = "1000";
//        response.resMsg = "delete a user by" + userId;
//        response.data = 1;
//
//        return response;
//    }
}
