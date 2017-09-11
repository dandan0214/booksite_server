package top.dandan0214.booksite.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.dandan0214.booksite.pojo.TMeau;
import top.dandan0214.booksite.pojo.TMeauExample;

public interface TMeauMapper {
    int countByExample(TMeauExample example);

    int deleteByExample(TMeauExample example);

    int deleteByPrimaryKey(String id);

    int insert(TMeau record);

    int insertSelective(TMeau record);

    List<TMeau> selectByExample(TMeauExample example);

    TMeau selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TMeau record, @Param("example") TMeauExample example);

    int updateByExample(@Param("record") TMeau record, @Param("example") TMeauExample example);

    int updateByPrimaryKeySelective(TMeau record);

    int updateByPrimaryKey(TMeau record);
}