package com.woomoon.controller;

import com.woomoon.dao.StuDaoHibernate;
import com.woomoon.entity.StuEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HibernateController {

    @Autowired
    StuDaoHibernate dao;

    @Autowired
    SessionFactory sessionFactory;


    @RequestMapping(value = "success")
    public String query4list() {
        System.out.println("in________________");

        try {
            Session session = sessionFactory.openSession();
            List<StuEntity> list = session.createQuery("from tb_stu", StuEntity.class).getResultList();
            System.out.println(list);
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";
    }

    @RequestMapping(value = "addStu")
    public void addStu() {
        StuEntity stu = new StuEntity(8,"朱墨元","2");
        System.out.println(dao.addStu(stu));
    }

    @RequestMapping(value = "delStu")
    public void delStu() {
        StuEntity stu = new StuEntity(8,"朱墨元","2");
        System.out.println(dao.delSru(stu));
    }

    @RequestMapping(value = "updStu")
    public void updStu() {
        StuEntity stu = new StuEntity(7,"朱丽","2");
        System.out.println(dao.updStu(stu));
    }


}
