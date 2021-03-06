package cn.tycoding.service;

import cn.tycoding.entity.Goods;
import cn.tycoding.entity.PageBean;

import java.util.Map;

/**
 * @auther TyCoding
 * @date 2018/9/19
 */
public interface GoodsService extends BaseService<Goods> {

    /**
     * 搜索 -- 从Solr索引库中
     *
     * @param searchMap
     * @return
     */
    Map<String, Object> search(Map searchMap);

    /**
     * 分页查询
     * @param goods 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(Goods goods, int pageCode, int pageSize);
}
