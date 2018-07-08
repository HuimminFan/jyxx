package com.fhm.jyxx.dao;

import java.util.List;

public interface BaseDao<T> {
    public void insert(T t);
    public void delete(T t);
    public void update(Integer id);

    public T selectOne(Integer id);
    public List<T> selectAll();
    public int selectCount();

}
