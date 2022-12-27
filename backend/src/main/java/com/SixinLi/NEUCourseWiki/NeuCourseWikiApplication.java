package com.SixinLi.NEUCourseWiki;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class NeuCourseWikiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeuCourseWikiApplication.class, args);
		log.info("NEU Course Wiki server started successfully");
	}

}
