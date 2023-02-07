package com.assignment1.clothes.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.assignment1.clothes.model.Clothe;

@Mapper
public interface ClotheRepository {

    @Select("SELECT * FROM clothes")
    public List<Clothe> findAll();

    @Insert("INSERT INTO CLOTHES(name, yearOfCreation, price, brand) VALUES(#{name}, #{yearOfCreation}, #{price}, #{brand})")
    public int insertItem();

    //
    Optional<Clothe> findById(Long id);
}
