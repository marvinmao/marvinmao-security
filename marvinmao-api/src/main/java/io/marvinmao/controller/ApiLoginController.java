/**
 * Copyright (c) 2016-2019 通用开源 All rights reserved.
 *
 * https://www.marvinmao.io
 *
 * 版权所有，侵权必究！
 */

package io.marvinmao.controller;


import io.marvinmao.annotation.Login;
import io.marvinmao.common.utils.R;
import io.marvinmao.common.validator.ValidatorUtils;
import io.marvinmao.form.LoginForm;
import io.marvinmao.service.TokenService;
import io.marvinmao.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

/**
 * 登录接口
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("/api")
@Api(tags="登录接口")
public class ApiLoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;


    @PostMapping("login")
    @ApiOperation("登录")
    public R login(@RequestBody LoginForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        //用户登录
        Map<String, Object> map = userService.login(form);

        return R.ok(map);
    }

    @Login
    @PostMapping("logout")
    @ApiOperation("退出")
    public R logout(@ApiIgnore @RequestAttribute("userId") long userId){
        tokenService.expireToken(userId);
        return R.ok();
    }

}
