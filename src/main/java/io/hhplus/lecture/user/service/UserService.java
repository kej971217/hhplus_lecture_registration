package io.hhplus.lecture.user.service;

import io.hhplus.lecture.user.model.UserVO;

public interface UserService {
    UserVO selectUserInfo(String id);

    UserVO insertUserInfo(UserVO user);

}
