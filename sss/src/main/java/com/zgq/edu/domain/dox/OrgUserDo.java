package com.zgq.edu.domain.dox;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @desc 用户信息Do
 * @author zhugq
 * @date 2019/12/31 11:38
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "org_user")
public class OrgUserDo implements Serializable {

    private static final long serialVersionUID = 780568303541242454L;
    /**
     * 生成策略经常使用的两种：
     * GenerationType.IDENTITY:依赖数据库中主键自增功能  Mysql
     * GenerationType.SEQUENCE:依靠序列来产生主键     Oracle
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "reg_time")
    private Date regTime;

    @Column(name = "state")
    private Integer state;

    @Column(name = "designer_check_status")
    private Integer designerCheckStatus;

    @Column(name = "phone")
    private String phone;

    @Column(name = "forget_password_token")
    private String forgetPasswordToken;

    @Column(name = "forget_date")
    private Date forgetDate;

    @Column(name = "is_set_head")
    private Integer isSetHead;

    @Column(name = "set_head_time")
    private Date setHeadTime;

    @Column(name = "validate_email_status")
    private Integer validateEmailStatus;

    @Column(name = "invite_user_id")
    private Integer inviteUserId;

    @Column(name = "reg_from")
    private Integer regFrom;

    @Column(name = "is_debug_user")
    private Boolean isDebugUser;

    @Column(name = "is_pj_user")
    private Boolean isPjUser;

    @Column(name = "member_expire")
    private Date memberExpire;

    @Column(name = "vm_amount")
    private Integer vmAmount;

    @Column(name = "vm_frozen_amount")
    private Integer vmFrozenAmount;

    @Column(name = "is_et_user")
    private Boolean isEtUser;

    @Column(name = "is_tmp_user")
    private Boolean isTmpUser;

    @Column(name = "is_new_user")
    private Boolean isNewUser;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "province")
    private String province;

    @Column(name = "city")
    private String city;

    @Column(name = "is_gm")
    private Boolean isGm;

    @Column(name = "last_active_time")
    private Date lastActiveTime;

    @Column(name = "team_flag")
    private String teamFlag;

    @Column(name = "design_guide_flag")
    private String designGuideFlag;

    @Column(name = "api_access_id")
    private String apiAccessId;

    @Column(name = "member_gain_state")
    private Integer memberGainState;

    @Column(name = "vip_level")
    private Integer vipLevel = 0;

    @Column(name = "is_wechat_account_bound")
    private Integer isWechatAccountBound = 0;

    @Column(name = "active_team_id")
    private Integer activeTeamId = 0;

    @Column(name = "primary_team_id")
    private Integer primaryTeamId;

    @Column(name = "premium_enterprise")
    private Integer premiumEnterprise;
}
