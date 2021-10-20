package com.why.entity.userEntity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;

/**
 * @ClassName：User
 * @Description：todo 用户信息
 * @Author: why
 * @DateTime：2021/10/20 13:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户信息类")
public class User {
    @NotNull
    @Size(min=10,max = 10)
    private long id;
    @NotNull
    @Size(min=2,max = 10)
    private String uName;
    @Size(min=11,max = 11)
    private String uPhone;
    @NotNull
    private long date;
}
