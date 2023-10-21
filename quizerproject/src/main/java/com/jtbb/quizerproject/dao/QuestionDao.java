package com.jtbb.quizerproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtbb.quizerproject.Model.QuestionModel;

@Repository

public interface QuestionDao extends JpaRepository<QuestionModel,Integer>{
    
}
