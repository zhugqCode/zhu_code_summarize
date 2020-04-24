package com.zgq.edu.service.impl;

import com.zgq.edu.dao.OrgUserDao;
import com.zgq.edu.domain.dto.UserSimpleDataDto;
import com.zgq.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class IUserServiceImpl implements IUserService {

    @Autowired
    private OrgUserDao orgUserDao;

    @Override
    public UserSimpleDataDto getUserSimpleData(Integer userId) {
        UserSimpleDataDto simpleUserInfo = orgUserDao.getSimpleUserInfo(userId);
        return simpleUserInfo;
    }
}
