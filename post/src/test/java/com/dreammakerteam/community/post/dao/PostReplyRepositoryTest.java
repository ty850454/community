package com.dreammakerteam.community.post.dao;

import com.dreammakerteam.community.TestApplication;
import com.dreammakerteam.community.post.domain.PostEntity;
import com.dreammakerteam.community.post.domain.PostReplyEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class PostReplyRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostReplyRepository postReplyRepository;



    private Long postId;

    @Before
    public void setUp() throws Exception {
        PostEntity postEntity = new PostEntity();
        postEntity.setTitle("测试文章");
        postRepository.save(postEntity);
        postId = postEntity.getId();

        PostReplyEntity postReplyEntity = new PostReplyEntity();
        postReplyEntity.setPostId(postEntity.getId());
        postReplyEntity.setContent("哈哈哈");
        postReplyRepository.save(postReplyEntity);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findByPostId() {
        List<PostReplyEntity> postReply = postReplyRepository.findByPostId(postId);
        System.out.println(postReply);
    }
}