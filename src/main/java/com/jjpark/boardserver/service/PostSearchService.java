package com.jjpark.boardServer.service;

import com.jjpark.boardServer.dto.PostDTO;
import com.jjpark.boardServer.dto.request.PostSearchRequest;

import java.util.List;

public interface PostSearchService {
    List<PostDTO> getPosts(PostSearchRequest postSearchRequest);
}
