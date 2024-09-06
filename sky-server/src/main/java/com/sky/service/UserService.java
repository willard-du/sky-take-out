package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    /**
     * 微信登录功能
     * @return
     */
    User wxlogin(UserLoginDTO userLoginDTO);
}
