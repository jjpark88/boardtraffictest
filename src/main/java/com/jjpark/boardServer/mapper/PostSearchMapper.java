package com.jjpark.boardServer.mapper;

import com.jjpark.boardServer.dto.PostDTO;
import com.jjpark.boardServer.dto.request.PostSearchRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostSearchMapper {
    public List<PostDTO> selectPosts(PostSearchRequest postSearchRequest);
}
