package com.thoughtworks.gaia.tableA.entity;

import com.thoughtworks.gaia.tableA.model.CommidityModel;

import java.util.List;

/**
 * Created by haoyuze on 2017/4/28.
 */
public class Category {
    private Long id;

    private String name;

    private List<CommidityModel> commidityModelList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CommidityModel> getCommidityModelList() {
        return commidityModelList;
    }

    public void setCommidityModelList(List<CommidityModel> commidityModelList) {
        this.commidityModelList = commidityModelList;
    }

}
