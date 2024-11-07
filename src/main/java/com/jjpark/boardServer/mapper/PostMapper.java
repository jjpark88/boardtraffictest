package com.jjpark.boardServer.mapper;

import com.jjpark.boardServer.dto.PostDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    public int register(PostDTO postDTO);


    List<PostDTO> selectMyPosts(int accountId);

    void updatePosts(PostDTO postDTO);

    void deletePosts(int postId);
}
