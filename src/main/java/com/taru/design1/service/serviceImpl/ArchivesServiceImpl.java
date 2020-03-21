package com.taru.design1.service.serviceImpl;

import com.taru.design1.dao.ArchivesDao;
import com.taru.design1.model.Archives;
import com.taru.design1.model.Drugs;
import com.taru.design1.model.Prop;
import com.taru.design1.model.User;
import com.taru.design1.service.ArchivesService;
import com.taru.design1.vo.ArchivesDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArchivesServiceImpl implements ArchivesService {

    @Autowired
    private ArchivesDao archivesDaoImpl;

    @Override
    public List<Archives> queryArchives(User user) {
        List<Archives> archives = archivesDaoImpl.queryArchives(user);
        return archives;
    }

    @Override
    @Transactional   //事务
    public Integer saveArchives(String userId,Archives archives,String[] drugsId,String[] propId) {
        int i = 0;
        String archivesId = getRandom1(8);
        String propStackId = getRandom1(8);
        String drugsStackId = getRandom1(8);
        archives.setArchivesId(archivesId);
        archives.setUserId(userId);
        Integer integer = archivesDaoImpl.saveArchives(archives);
        if(integer > 0){
            i++;
        }
        Integer integer1 = archivesDaoImpl.saveUserIdArchives(archives);
        if(integer1 > 0){
            i++;
        }
        Drugs drugs = new Drugs();
        List<String> drugs1 = drugs.getDrugs();
        drugs.setDrugStackId(drugsStackId);
        for (String s : drugsId) {
            drugs1.add(s);
        }
//        drugs.setDrugs(drugs1);
        Integer integer2 = archivesDaoImpl.saveStackDrugs(drugs);
        if(integer2 > 0){
            i++;
        }
        Prop prop = new Prop();
        List<String> props = prop.getProps();
        prop.setPropStackId(propStackId);
        for (String s : propId) {
            props.add(s);
        }
//        prop.setProps(props);
        Integer integer3 = archivesDaoImpl.saveStackProp(prop);
        if(integer3 > 0){
            i++;
        }
        return i;
    }

    @Override
    @Transactional   //事务
    public Integer updateArchives(Archives archives,String[] drugsId,String[] propId) {
        int i = 0;
        Integer integer = archivesDaoImpl.updateArchives(archives);
        if(integer > 0){
            i++;
        }
        Drugs drugs = new Drugs();
        drugs.setDrugStackId(archives.getArchivesId());
        archivesDaoImpl.delDrug(drugs);
        List<String> drugs1 = drugs.getDrugs();
        for (String s : drugsId) {
            drugs1.add(s);
        }
//        drugs.setDrugs(drugs1);
        Integer integer1 = archivesDaoImpl.addDrug(drugs);
        if(integer1 > 0){
            i++;
        }
        Prop prop = new Prop();
        prop.setPropStackId(archives.getArchivesId());
        archivesDaoImpl.delProp(prop);
        List<String> props = prop.getProps();
        for (String s : propId) {
            props.add(s);
        }
//        prop.setProps(props);
        Integer integer2 = archivesDaoImpl.addProp(prop);
        if(integer2 > 0){
           i++;
        }
        return i;
    }

    @Override
    public List<ArchivesDetail> beginGameProp(Archives archives) {
        List<ArchivesDetail> archivesDetails = archivesDaoImpl.beginGameProp(archives);
        return archivesDetails;
    }

    @Override
    public List<ArchivesDetail> beginGameDrugs(Archives archives) {
        List<ArchivesDetail> archivesDetails = archivesDaoImpl.beginGameDrugs(archives);
        return archivesDetails;
    }
    public static String getRandom1(int len) {
        int rs = (int) ((Math.random() * 9 + 1) * Math.pow(10, len - 1));
        return String.valueOf(rs);
    }
}
