package com.assignment1.clothes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment1.clothes.model.Clothe;
import com.assignment1.clothes.repository.ClotheRepository;

@Service
public class ClotheService {
    private ClotheRepository clotheRepository;

    ClotheService(ClotheRepository clotheRepository) {
        this.clotheRepository = clotheRepository;
    }

    public List<Clothe> findAll() {
        return clotheRepository.findAll();
    }

    public int insertItem() {
        return clotheRepository.insertItem();
    }
}
