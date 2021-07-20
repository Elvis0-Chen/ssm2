package com.example.dao;

import com.example.bean.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    Book queryById(long id);

    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 减少馆藏数量
     *
     * @param bookId
     * @return 如果影响行数等于>1，表示更新的记录行数
     */
    int reduceNumber(long bookId);
}
