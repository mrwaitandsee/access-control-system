package com.herokuapp.kosterev.accesscontrolsystem.mapper;

import com.herokuapp.kosterev.accesscontrolsystem.entity.AccountEntity;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

@Mapper
public interface AccountEntityMapper {
    String findAll = "SELECT * FROM public.AccountEntity";

    String saveOne =
            "INSERT INTO public.AccountEntity (id, name, password, domainEntityId) VALUES" +
                    "(#{entity.id}, #{entity.name}, #{entity.password}, #{entity.domainEntityId})";

    @Select(findAll)
    List<AccountEntity> findAll();

    @Insert(saveOne)
    void saveOne(@Param("entity") AccountEntity accountEntity);
}
