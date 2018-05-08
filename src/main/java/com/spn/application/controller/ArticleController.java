package com.spn.application.controller;

import com.spn.application.model.Article;
import com.spn.application.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Chhai Chivon on 07-May-18
 */
@RestController
@RequestMapping(value = "/api/articles")
public class ArticleController extends ApiResponse<Article> implements BaseController<Article> {

    @Autowired
    private ArticleService  articleService;

    @Override
    @RequestMapping(value = "",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> findAll(@RequestParam(value = "page", defaultValue = "0") int page,@RequestParam(value = "limit",defaultValue = "10") int limit) {
        Page<Article> pages = articleService.findAll(new PageRequest(page,limit));
        return response(pages);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> findById(@PathVariable("id") Long id) {
        Article article = articleService.findOne(id);
        return response(article);
    }

    @Override
    @RequestMapping(value = "",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> save(@RequestBody Article entity) {
        Article article = articleService.saveOrUpdate(entity);
        return response(article);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> Update(@PathVariable("id") Long id,@RequestBody Article entity) {
        Article article = articleService.saveOrUpdate(entity);
        return response(article);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> delete(@PathVariable("id") Long id) {
        Article article = articleService.delete(id);
        return response(article);
    }
}
