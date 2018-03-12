package com.dreammakerteam.community.post.dao;

import com.dreammakerteam.community.TestApplication;
import com.dreammakerteam.community.post.domain.PostEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    public void testDb() {
        PostEntity postEntity = new PostEntity();
        postEntity.setTitle("哈啊哈");
        postRepository.save(postEntity);

        List<PostEntity> all = postRepository.findAll();
        System.out.println(all);
    }

}