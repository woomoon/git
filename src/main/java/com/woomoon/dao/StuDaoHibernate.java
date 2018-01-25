package com.woomoon.dao;

import com.woomoon.entity.StuEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StuDaoHibernate {

    @Autowired
    SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    //开启事物
    public void beginSession(Session session) {
        session.getTransaction().begin();
    }

    //提交事物
    public void commitSession(Session session) {
        session.getTransaction().commit();
    }

    //关闭session
    public void closeSession(Session session) {
        session.close();
    }

    //添加方法
    public boolean addStu(StuEntity stuEntity) {
        try {
            Session session = getSession();
            beginSession(session);
            session.save(stuEntity);
            commitSession(session);
            closeSession(session);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //删除方法
    public boolean delSru(StuEntity stuEntity) {
        try {
            Session session = getSession();
            beginSession(session);
            session.delete(stuEntity);
            commitSession(session);
            closeSession(session);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //修改方法
    public boolean updStu(StuEntity stuEntity) {
        try {
            Session session = getSession();
            beginSession(session);
            session.update(stuEntity);
            commitSession(session);
            closeSession(session);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


}
