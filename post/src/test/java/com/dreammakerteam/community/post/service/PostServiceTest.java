package com.dreammakerteam.community.post.service;

import com.dreammakerteam.community.post.BaseTest;
import com.dreammakerteam.community.post.dao.PostRepository;
import com.dreammakerteam.community.post.domain.PostEntity;
import com.dreammakerteam.community.post.domain.PostResponseVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.data.domain.Page;

import javax.annotation.Resource;

import static org.junit.Assert.*;


public class PostServiceTest extends BaseTest {

    @Resource
    private PostRepository postRepository;

    @Resource
    private PostService postService;

    @Before
    public void setUp() throws Exception {
        PostEntity postEntity = new PostEntity();
        postEntity.setTitle("测试文章");
        postRepository.save(postEntity);
    }

    @Test
    public void findAllPost() {
        Page<PostResponseVo> allPost = postService.findAllPost(0, 10);
        System.out.println(allPost);
    }
}