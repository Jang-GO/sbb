package com.mygroup.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findBySubjectLike(String subject);
    Question findBySubjectAndContent(String subject, String content);
    Question findBySubject(String subject);
}