package com.zgq.edu.service.impl;

import com.zgq.edu.dao.OrgUserJpaDao;
import com.zgq.edu.domain.dox.OrgUserDo;
import com.zgq.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("iUserService")
public class IUserServiceImpl implements IUserService {

    @Autowired
    private OrgUserJpaDao orgUserJpaDao;

    @Override
    public OrgUserDo getUserSimpleData(Long userId) {
        Optional<OrgUserDo> userDo = orgUserJpaDao.findById(userId);
        return userDo.get();
    }

    @Override
    public OrgUserDo getUserSimpleDataById(Long userId,String phone) {
        List<OrgUserDo> userDos = orgUserJpaDao.findByJpql(userId, phone);
        return userDos.get(0);
    }
}
