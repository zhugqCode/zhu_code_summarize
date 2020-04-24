package com.zgq.edu.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @desc 用户基本信息
 * @author zhugq
 * @date 2019/12/31 11:38
 */
@Getter
@Setter
@NoArgsConstructor
public class UserBaseInfoDto implements Serializable {

    private static final long serialVersionUID = 780568303933620583L;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 注册时间
     */
    private LocalDateTime regTime;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 最后一次登录时间
     */
    private LocalDate lastActiveTime;

    private String nickname;

}
