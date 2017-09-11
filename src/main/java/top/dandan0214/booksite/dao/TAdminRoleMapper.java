package top.dandan0214.booksite.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.dandan0214.booksite.pojo.TAdminRole;
import top.dandan0214.booksite.pojo.TAdminRoleExample;

public interface TAdminRoleMapper {
    int countByExample(TAdminRoleExample example);

    int deleteByExample(TAdminRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(TAdminRole record);

    int insertSelective(TAdminRole record);

    List<TAdminRole> selectByExample(TAdminRoleExample example);

    TAdminRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TAdminRole record, @Param("example") TAdminRoleExample example);

    int updateByExample(@Param("record") TAdminRole record, @Param("example") TAdminRoleExample example);

    int updateByPrimaryKeySelective(TAdminRole record);

    int updateByPrimaryKey(TAdminRole record);
}