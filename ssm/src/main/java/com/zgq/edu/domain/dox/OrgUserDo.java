package com.zgq.edu.domain.dox;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @desc 用户信息Do
 * @author zhugq
 * @date 2019/12/31 11:38
 */
@Getter
@Setter
@NoArgsConstructor
public class OrgUserDo {
    private Integer userId;
    private String password;
    private LocalDateTime regTime;
    private String email;
    private Integer validateEmailStatus;
    private String phone;
    private String nickname;
    private Integer isSetHead;
    private LocalDateTime setHeadTime;
    private String forgetPasswordToken;
    private LocalDateTime forgetDate;
    private Long inviteUserId;
    private Integer isGm;
    private Integer designerCheckStatus;
    private Integer isPjUser;
    private Integer isEtUser;
    private Integer isTmpUser;
    private Integer isDebugUser;
    private Integer isWechatAccountBound;
    private LocalDate memberExpire;
    private Integer vipLevel;
    private Integer vmAmount;
    private LocalDate lastActiveTime;
    private String apiAccessId;
    private Integer memberGainState;
    private Integer availablePointAmount;
    private Integer primaryTeamId;
    private Integer activeTeamId;
    private Integer premiumEnterprise;
}
