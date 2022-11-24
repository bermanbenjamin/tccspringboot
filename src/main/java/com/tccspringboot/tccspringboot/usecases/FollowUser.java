package com.tccspringboot.tccspringboot.usecases;

import com.tccspringboot.tccspringboot.model.User;
import com.tccspringboot.tccspringboot.service.FollowsService;
import com.tccspringboot.tccspringboot.service.UserService;

public class FollowUser {

   private static FollowsService followsService;

    public FollowUser(UserService userService) {
         this.followsService = followsService;
    }

   /* public void follow(User userFollowed, User userFollower) {
    	followsService.getFollowers().add(userFollower);
        followsService.update(userFollowed);
    }
*/
}
