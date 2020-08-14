package com.cos.opggex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.opggex.model.Post;
import com.cos.opggex.repository.PostRepository;

@RestController
public class TestController {
	
	@Autowired
	
	private PostRepository postRepository;

	@GetMapping("/post/{id}")
	public Post findById (@PathVariable int id) {
		Post post = postRepository.findById(id);
		return post;
	}
	
	@GetMapping("/post")
	public @ResponseBody String findById2 () {
		return "호우";
	}
}


