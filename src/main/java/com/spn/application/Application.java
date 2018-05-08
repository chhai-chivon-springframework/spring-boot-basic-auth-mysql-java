package com.spn.application;

import com.spn.application.model.Article;
import com.spn.application.service.ArticleService;
import com.spn.application.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ArticleService articleService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//this.save();
	}

	private void save(){
		for (int i = 0 ; i < 50 ; i++){
			Article article  = new Article();
			article.setTitle("title "+i);
			article.setContent("content "+i);
			article.setCreatedAt(DateUtil.getToday());
			article.setUpdatedAt(DateUtil.getToday());
			articleService.saveOrUpdate(article);
		}
	}
}
