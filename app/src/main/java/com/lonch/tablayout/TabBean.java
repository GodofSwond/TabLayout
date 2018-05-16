package com.lonch.tablayout;

import java.io.Serializable;

/**
 * 作者：Sword God
 * 创建日期：2018/5/16
 * 描述：
 */

class TabBean implements Serializable {
    public String id;
    public String title;

    public TabBean(String id, String title) {
        this.id = id;
        this.title = title;
    }
}
