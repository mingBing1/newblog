package com.ming.blog.mapper;

import com.ming.blog.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
}
