package com.spn.application.repository;

import com.spn.application.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Chhai Chivon on 07-May-18
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
