package com.jtbb.quizerproject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "jtbbtable")
public class QuestionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column
    private String category;

    @Column
    private String option1;

    @Column
    private String option2;

    @Column
    private String option3;

    @Column
    private String option4;

    @Column
    private String questiontitle;

    @Column
    private String rightanswers;

    @Column
    private String difficultylevel;

    public Integer getId() {
        return Id;
    }

    public String getCategory() {
        return category;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getQuestiontitle() {
        return questiontitle;
    }

    public String getRightanswers() {
        return rightanswers;
    }

    public String getDifficultylevel() {
        return difficultylevel;
    }
}
