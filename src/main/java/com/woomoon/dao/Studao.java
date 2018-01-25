package com.woomoon.dao;

import com.woomoon.utils.DbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class Studao {


    @Autowired
    DbUtil dbUtil;

    public List<Map<String, Object>> queryStu(String sql) {
        System.out.println("-----------------> "+sql);
        List<Map<String, Object>> temp = dbUtil.getTemplate().queryForList(sql, new HashMap<String, Object>());
        for (Map tv : temp) {
            System.out.println(tv);
        }
        return temp;
    }



}
