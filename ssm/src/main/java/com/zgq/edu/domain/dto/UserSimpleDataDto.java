package com.zgq.edu.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @desc 用户简要信息Dto
 * @author zgq
 * @date 2019/11/8 16:11
 */
@Getter
@Setter
@NoArgsConstructor
public class UserSimpleDataDto  implements Serializable {
    private static final long serialVersionUID = 4936460323365124785L;
    private Integer userId;
    private String nickname;
    private String phone;
    private String email;
    private Integer vipLevel;
    private Integer primaryTeamId;
    private Integer premiumEnterprise;
    private LocalDate memberExpire;
    private LocalDateTime regTime;
    private Integer regFrom;
    private Integer vmAmount;
}
