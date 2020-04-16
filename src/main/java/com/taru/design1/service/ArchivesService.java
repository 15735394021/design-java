package com.taru.design1.service;

import com.taru.design1.model.Archives;
import com.taru.design1.model.User;
import com.taru.design1.vo.ArchivesDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArchivesService {

    List<Archives> queryArchives(Archives archives);

    Integer saveArchives(String userId,Archives archives,String[] drugsId,Integer[] drugsNum,String[] propId,Integer[] propNum);

    Integer updateArchives(Archives archives,String[] drugsId,Integer[] drugsNum,String[] propId,Integer[] propNum);

    List<ArchivesDetail> beginGameProp(Archives archives);
    List<ArchivesDetail> beginGameDrugs(Archives archives);
}
