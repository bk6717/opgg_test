package com.cos.opggex.repository;


import org.springframework.stereotype.Repository;

import com.cos.opggex.model.Post;

public interface PostRepository {
	
	public Post findById(int id);

}
