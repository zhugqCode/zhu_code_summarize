package com.zgq.edu.controller;

import com.zgq.edu.domain.dox.OrgUserDo;
import com.zgq.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("getUserData.do")
    @ResponseBody
    public OrgUserDo getUserData(@RequestParam("user_id") Long userId){
        return iUserService.getUserSimpleData(userId);
    }

    @RequestMapping("getUserDataById.do")
    @ResponseBody
    public OrgUserDo getUserDataById(@RequestParam("user_id") Long userId,
                                     @RequestParam("phone")String phone){
        return iUserService.getUserSimpleDataById(userId,phone);
    }

}
