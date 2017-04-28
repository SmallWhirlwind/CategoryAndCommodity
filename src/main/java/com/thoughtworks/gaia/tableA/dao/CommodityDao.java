package com.thoughtworks.gaia.tableA.dao;

import com.thoughtworks.gaia.common.jpa.BaseDaoWrapper;
import com.thoughtworks.gaia.tableA.model.CommidityModel;
import org.springframework.stereotype.Component;

/**
 * Created by haoyuze on 2017/4/28.
 */
@Component
public class CommodityDao extends BaseDaoWrapper {
    public CommodityDao() {
        super(CommidityModel.class);
    }
}
