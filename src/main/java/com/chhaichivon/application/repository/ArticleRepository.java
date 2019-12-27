package com.chhaichivon.application.repository;

import com.chhaichivon.application.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Chhai Chivon on 07-May-18
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
