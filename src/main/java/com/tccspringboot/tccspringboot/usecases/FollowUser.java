package com.tccspringboot.tccspringboot.usecases;

import com.tccspringboot.tccspringboot.model.User;
import com.tccspringboot.tccspringboot.service.UserService;

public class FollowUser {

   private static UserService userService;

    public FollowUser(UserService userService) {
         this.userService = userService;
    }

    public void follow(User userFollowed, User userFollower) {
        userFollowed.getFollowers().add(userFollower.getId());
        userService.update(userFollowed);
    }

}
