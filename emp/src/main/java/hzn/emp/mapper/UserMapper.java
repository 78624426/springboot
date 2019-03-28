package hzn.emp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select pass from user where name=#{name}")
    String selectPassByName(String name);
}
