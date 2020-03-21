package com.taru.design1.dao;

import com.taru.design1.model.Archives;
import com.taru.design1.model.Drugs;
import com.taru.design1.model.Prop;
import com.taru.design1.model.User;
import com.taru.design1.vo.ArchivesDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArchivesDao {
    //查询档案列表
    List<Archives> queryArchives(User user);
    //存档
    Integer saveArchives(Archives archives);
    Integer saveUserIdArchives(Archives archives);
    Integer saveStackProp(Prop prop);
    Integer saveStackDrugs(Drugs drugs);
    //更新档案
    Integer updateArchives(Archives archives);
    Integer addDrug(Drugs drugs);
    Integer delDrug(Drugs drugs);
    Integer addProp(Prop prop);
    Integer delProp(Prop prop);
    //查询档案详情
    List<ArchivesDetail> beginGameProp(Archives archives);
    List<ArchivesDetail> beginGameDrugs(Archives archives);
}
