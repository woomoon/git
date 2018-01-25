package com.woomoon.controller;

import com.woomoon.dao.Studao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

/*
D:\anz\javapro\eclipsepro\Y2_own_study\aop\src\main\resources

D:\anz\javapro\eclipsepro\Y2_own_study\aop\src\main\java\com\woomoon


D:\anz\javapro\eclipsepro\Y2_own_study\JDBCTempLate\src\main\resources

D:\anz\javapro\eclipsepro\Y2_own_study\JDBCTempLate\src\main\java\com\woomoon

*/

    @Autowired
    Studao studao;

    @RequestMapping("hindex")
    private String hrefIndex(String str) {
        return "WEB-INF\\html\\index";
    }

    @RequestMapping("htemp")
    private String hrefTemp(String str) {
        return "WEB-INF\\html\\temp";
    }

    @RequestMapping("huser")
    private String hrefUser(String str) {
        return "WEB-INF\\html\\user";
    }

    @RequestMapping("returnstr")
    @ResponseBody
    private String returnStr(HttpServletRequest request) {
        return "true";
    }

    @RequestMapping("queryUser")
    @ResponseBody
    private Map<String, Object> temp(String page, String rows) {
        String sql = "select * from tb_stu";
        if (page != null && page != "" && rows != null && rows != "") {
            if ("1".equals(page)) {
                sql += " limit 1,"+rows;
            }
            else {
                int pageInd = Integer.parseInt(page);
                pageInd = (pageInd - 1) * Integer.parseInt(rows);
                sql += " limit " + pageInd + ","+rows;
            }
        }
        List<Map<String, Object>> list = studao.queryStu(sql);
        Map<String, Object> map = new HashMap<>();
        map.put("total", 23);
        map.put("rows", studao.queryStu(sql));
        return map;
    }





}
