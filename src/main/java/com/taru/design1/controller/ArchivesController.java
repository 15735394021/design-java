package com.taru.design1.controller;

import com.taru.design1.model.Archives;
import com.taru.design1.model.Drugs;
import com.taru.design1.model.Prop;
import com.taru.design1.model.User;
import com.taru.design1.service.ArchivesService;
import com.taru.design1.vo.ArchivesDetail;
import com.taru.design1.vo.ObjectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/archives")
public class ArchivesController {
    @Autowired
    private ArchivesService archivesServiceImpl;

    @RequestMapping(value = "/queryArchives",method = RequestMethod.GET)
    public ObjectVo queryArchives(User user){
        ObjectVo objectVo = new ObjectVo(0);
        List<Archives> archives = archivesServiceImpl.queryArchives(user);
        if(archives.size() > 0){
            objectVo.setData(archives);
        }else{
            objectVo.setStatus(1);
            objectVo.setMessage("查询档案列表结果为空");
        }
        return objectVo;
    }
    //存档
    @RequestMapping(value = "/saveArchives",method = RequestMethod.POST)
    public ObjectVo saveArchives(String userId,Archives archives,String[] drugsId,Integer[] drugsNum,String[] propId,Integer[] propNum){
        ObjectVo objectVo = new ObjectVo(0);
        Integer integer = archivesServiceImpl.saveArchives(userId, archives, drugsId,drugsNum, propId,propNum);
        if(integer != 4){
            objectVo.setStatus(1);
            objectVo.setMessage("存档失败，数据已回滚");
        }
        return objectVo;
    }
    //更新存档
    @RequestMapping(value = "/updateArchives",method = RequestMethod.POST)
    public ObjectVo updateArchives(Archives archives,String[] drugsId,Integer[] drugsNum,String[] propId,Integer[] propNum){
        ObjectVo objectVo = new ObjectVo(0);
        Integer integer = archivesServiceImpl.updateArchives(archives, drugsId,drugsNum, propId,propNum);
        if(integer != 3){
            objectVo.setStatus(1);
            objectVo.setMessage("更新档案失败，数据已回滚");
        }
        return objectVo;
    }
    //开始游戏，查询详细档案。进入游戏主场景
    @RequestMapping(value = "/beginGame",method = RequestMethod.GET)
    public ObjectVo beginGame (Archives archives){
        ObjectVo objectVo = new ObjectVo(0);
        List<ArchivesDetail> archivesDetail = archivesServiceImpl.beginGameProp(archives);
        List<ArchivesDetail> archivesDetails = archivesServiceImpl.beginGameDrugs(archives);
        Map<String,List<ArchivesDetail>> mapProp = new HashMap<>();
        mapProp.put("prop",archivesDetail);
        mapProp.put("drugs",archivesDetails);
        objectVo.setData(mapProp);
        return objectVo;
    }
}
