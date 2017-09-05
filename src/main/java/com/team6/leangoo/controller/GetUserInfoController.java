package com.team6.leangoo.controller;

import com.team6.leangoo.model.User;
import com.team6.leangoo.service.GetUserInfoService;
import com.team6.leangoo.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserInfoController {
    private final GetUserInfoService getUserInfoService;

    @Autowired
    public GetUserInfoController(GetUserInfoService getUserInfoService){
        this.getUserInfoService = getUserInfoService;
    }

    @RequestMapping(value = "/getUserInfoById",method = RequestMethod.POST)
    public AjaxResult getUserInfoById(Integer userId){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setData(getUserInfoService.getUserInfoById(userId));
        return ajaxResult;
    }

    @RequestMapping(value = "/changeUserInfo",method = RequestMethod.POST)
    public AjaxResult changeUserInfo(@RequestBody User user){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.seterrcode(getUserInfoService.changeUserInfo(user));
        ajaxResult.setData(user);
        return ajaxResult;
    }

    @RequestMapping(value = "/changeUserPassword",method = RequestMethod.POST)
    public AjaxResult changeUserPassword(String userPassword){
        AjaxResult ajaxResult = new AjaxResult();
        //ajaxResult.seterrcode(getUserInfoService.changeUserInfo(user));
        //ajaxResult.setData(user);
        return ajaxResult;
    }
}
