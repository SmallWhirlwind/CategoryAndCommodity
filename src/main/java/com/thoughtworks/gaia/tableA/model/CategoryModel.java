package com.thoughtworks.gaia.tableA.model;

import com.thoughtworks.gaia.common.jpa.IdBaseModel;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by haoyuze on 2017/4/28.
 */
@Entity
@Table(name = "CATEGORY")
public class CategoryModel extends IdBaseModel {
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @OneToMany
    @JoinColumn(name = "category_id")
    @Cascade(CascadeType.ALL)
    private List<CommidityModel> commidityModelList;

    public List<CommidityModel> getCommidityModelList() {
        return commidityModelList;
    }

    public void setCommidityModelList(List<CommidityModel> commidityModelList) {
        this.commidityModelList = commidityModelList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
