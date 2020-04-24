package com.zgq.edu.dao;

import com.zgq.edu.domain.dto.UserSimpleDataDto;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @CacheNamespace 表示开启二级缓存
 */
@Repository
public interface OrgUserDao {

    UserSimpleDataDto getSimpleUserInfo(@Param("userId")Integer userId);
}
