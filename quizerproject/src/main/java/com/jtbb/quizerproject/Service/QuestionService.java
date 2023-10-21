package com.jtbb.quizerproject.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jtbb.quizerproject.Model.QuestionModel;
import com.jtbb.quizerproject.dao.QuestionDao;

@Service
public class QuestionService {
    @Autowired
    private QuestionDao questionDao;

    public List<QuestionModel> getAllQuestions() {
        return questionDao.findAll();
    }
}
