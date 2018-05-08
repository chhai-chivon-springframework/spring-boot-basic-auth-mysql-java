package com.spn.application.service;

import com.spn.application.model.Article;
import com.spn.application.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author Chhai Chivon on 07-May-18
 */
@Service
public class ArticleService implements BaseService<Article> {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Page<Article> findAll(PageRequest pageRequest) {
        return articleRepository.findAll(pageRequest);
    }

    @Override
    public Article findOne(Long id) {
        Article article = new Article();
        if(articleRepository.findById(id).isPresent()){
            article = articleRepository.findById(id).get();
        }
        return article;
    }

    @Override
    public Article saveOrUpdate(Article entity) {
        return articleRepository.save(entity);
    }

    @Override
    public Article delete(Long id) {
        Article article = findOne(id);
        if(article != null){
            articleRepository.delete(article);
        }
        return article;
    }

    @Override
    public boolean exists(Long id) {
        return articleRepository.existsById(id);
    }
}
