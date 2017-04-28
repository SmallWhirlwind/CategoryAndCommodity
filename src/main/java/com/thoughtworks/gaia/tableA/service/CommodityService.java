package com.thoughtworks.gaia.tableA.service;

import com.thoughtworks.gaia.common.Loggable;
import com.thoughtworks.gaia.common.exception.NotFoundException;
import com.thoughtworks.gaia.tableA.ComodityMapper;
import com.thoughtworks.gaia.tableA.dao.CommodityDao;
import com.thoughtworks.gaia.tableA.entity.Commidity;
import com.thoughtworks.gaia.tableA.model.CommidityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by haoyuze on 2017/4/28.
 */
@Component
@Transactional
public class CommodityService implements Loggable {

    @Autowired
    private CommodityDao commodityDao;

    @Autowired
    private ComodityMapper comodityMapper;

    public Commidity getCommidity(Long commidityId){
        CommidityModel commidityModel = commodityDao.idEquals(commidityId).querySingle();
        if(commidityModel==null){
            throw new NotFoundException();
        }
        return comodityMapper.map(commidityModel,Commidity.class);
    }
}
