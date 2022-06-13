package io.pp.arcade.domain.user.controller;

import io.pp.arcade.domain.user.dto.UserDetailResponseDto;
import io.pp.arcade.domain.user.dto.UserHistoricDto;
import io.pp.arcade.domain.user.dto.UserHistoricResponseDto;
import io.pp.arcade.domain.user.dto.UserResponseDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserController {
    UserResponseDto findUser(@RequestParam Integer userId);
    UserDetailResponseDto findDetailUser(@PathVariable Integer targetUserId, @RequestParam Integer currentUserId);
    UserHistoricResponseDto findUserHistorics(@PathVariable Integer userId, @PageableDefault(size = 10) Pageable pageable);
}
