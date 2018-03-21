package com.jc.framework.network;

import java.util.Collection;

import okhttp3.Cookie;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/11 21:27
 * @describe
 * @update
 */

public interface ICookieCache extends Iterable<Cookie> {
    /**
     * 保存cookie
     *
     * @param cookies
     */
    void saveAll(Collection<Cookie> cookies);

    /**
     * 移除cookie
     *
     * @param cookies
     */
    void removeAll(Collection<Cookie> cookies);

    /**
     * 清除cookie
     */
    void clear();


}
