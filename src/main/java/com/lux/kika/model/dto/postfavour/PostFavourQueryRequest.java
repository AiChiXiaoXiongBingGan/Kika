package com.lux.kika.model.dto.postfavour;

import com.lux.kika.common.PageRequest;
import com.lux.kika.model.dto.post.PostQueryRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 帖子收藏查询请求
 *
 * @author <a href="https://github.com/AiChiXiaoXiongBingGan">lux</a>
 * @from <a href="https://lux.icu">hit</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

    /**
     * 帖子查询请求
     */
    private PostQueryRequest postQueryRequest;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}