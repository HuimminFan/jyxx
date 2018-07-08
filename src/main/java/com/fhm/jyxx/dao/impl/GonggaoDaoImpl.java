package com.fhm.jyxx.dao.impl;

import com.fhm.jyxx.dao.BaseDao;
import com.fhm.jyxx.domain.Gonggao;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GonggaoDaoImpl extends SqlSessionDaoSupport implements BaseDao<Gonggao>{

    public void insert(Gonggao gonggao) {
        getSqlSession().insert("t_gonggao.insert",gonggao);
    }

    public void delete(Gonggao gonggao) {
        getSqlSession().delete("t_gonggao.delete",gonggao);
    }

    public void update(Integer id) {
        getSqlSession().update("t_gonggao.update",id);
    }

    public Gonggao selectOne(Integer id) {
        return getSqlSession().selectOne("t_gonggao.selectOne",id);
    }

    public List<Gonggao> selectAll() {
        return getSqlSession().selectOne("t_gonggao.selectAll");
    }

    public int selectCount() {
        return 0;
    }
}
