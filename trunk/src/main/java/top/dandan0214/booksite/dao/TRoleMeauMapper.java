package top.dandan0214.booksite.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.dandan0214.booksite.pojo.TRoleMeau;
import top.dandan0214.booksite.pojo.TRoleMeauExample;

public interface TRoleMeauMapper {
    int countByExample(TRoleMeauExample example);

    int deleteByExample(TRoleMeauExample example);

    int deleteByPrimaryKey(String id);

    int insert(TRoleMeau record);

    int insertSelective(TRoleMeau record);

    List<TRoleMeau> selectByExample(TRoleMeauExample example);

    TRoleMeau selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TRoleMeau record, @Param("example") TRoleMeauExample example);

    int updateByExample(@Param("record") TRoleMeau record, @Param("example") TRoleMeauExample example);

    int updateByPrimaryKeySelective(TRoleMeau record);

    int updateByPrimaryKey(TRoleMeau record);
}