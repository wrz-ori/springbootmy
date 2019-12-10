package com.springbootm.mapper;

import com.springbootm.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2019/12/2.
 */
//@Mapper
    @Repository
public interface UserMapper
{
   // @Select("Select * from t_user where id=#{id}")
    public User getUserByid(Integer id);
  //  @Options(useGeneratedKeys = true ,keyProperty = "id")
   // @Insert("insert into t_user (id,name)vaules(#{id,#{name}})")
    public int insertUser(User user);

}
