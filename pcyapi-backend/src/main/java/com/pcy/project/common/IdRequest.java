package com.pcy.project.common;

// https://space.bilibili.com/12890453/

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author pcy
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}