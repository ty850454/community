package com.dreammakerteam.community.post.service;

import com.dreammakerteam.community.post.dao.PostRepository;
import com.dreammakerteam.community.post.domain.PostEntity;
import com.dreammakerteam.community.post.domain.PostResponseVo;
import com.dreammakerteam.community.service.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;

/**
 * 文章服务
 * @author ty
 * @date 2018/3/13 下午 10:18
 */
@Service
public class PostService extends BaseService {

    @Resource
    private PostRepository postRepository;

    /**
     * 分页查询所有文章
     * @param page
     * @param size
     * @return
     */
    public Page<PostResponseVo> findAllPost(Integer page, Integer size) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "createTime"));
        Page<PostEntity> posts = postRepository.findAll(pageRequest);
        LinkedList<PostResponseVo> result = new LinkedList<>();
        PostResponseVo postResponseVo;
        for (PostEntity post : posts) {
            postResponseVo = new PostResponseVo();
            postResponseVo.setTitle(post.getTitle());
            postResponseVo.setCreateTime(post.getCreateTime());
            postResponseVo.setUpdateTime(post.getUpdateTime());
            result.add(postResponseVo);
        }
        return new PageImpl<>(result, pageRequest, posts.getTotalElements());
    }

    public void createPost() {

    }

    public void removePost() {

    }

    public void replyPost() {

    }

    public void findPostReplys() {

    }

}
