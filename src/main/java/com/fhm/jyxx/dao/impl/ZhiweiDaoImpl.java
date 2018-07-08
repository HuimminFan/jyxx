package com.fhm.jyxx.dao.impl;

import com.fhm.jyxx.dao.BaseDao;
import com.fhm.jyxx.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ZhiweiDaoImpl extends SqlSessionDaoSupport implements BaseDao<User>{
    public void insert(User user) {
        getSqlSession().insert("t_user.insert",user);
    }

    public void delete(User user) {
        getSqlSession().delete("t_user.delete",user);
    }

    public void update(Integer id) {
        getSqlSession().update("t_user.update",id);
    }

    public User selectOne(Integer id) {
        return getSqlSession().selectOne("t_user.selectOne",id);
    }

    public List<User> selectAll() {
        return getSqlSession().selectList("t_user.selectAll");
    }

    public int selectCount() {
        return 0;
    }
}
