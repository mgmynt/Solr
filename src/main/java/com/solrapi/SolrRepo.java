package com.solrapi;

import javax.annotation.Resource;
import java.com.solrapi.Item;
import java.com.solrapi.SolrItemRepository;
import java.util.ArrayList;
import java.util.List;

public class SolrRepo implements SolrItemRepository {

    @Resource
    private SolrItemRepository ItemRepository;

    @Override
    public List<Item> findByTitle(String title) {
        List<Item> list = new ArrayList<>();

    }
}
