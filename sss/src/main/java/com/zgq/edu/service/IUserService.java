package com.zgq.edu.service;

import com.zgq.edu.domain.dox.OrgUserDo;

public interface IUserService {

    OrgUserDo getUserSimpleData(Long userId);

    OrgUserDo getUserSimpleDataById(Long userId,String phone);

}
