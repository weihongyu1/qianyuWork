package com.why.entity.userEntity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @ClassName：UserLogin
 * @Description：todo 用户登录信息
 * @Author: why
 * @DateTime：2021/10/20 13:28
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户登录")
public class UserLogin {
    private Integer id;
    private String uPwd;
    private String salt;
    @NotNull
    private Integer uId;
}
