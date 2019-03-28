package hzn.emp.mapper;

import hzn.emp.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select id,name,sal from emp")
    List<Emp> selectAllEmp();
}
