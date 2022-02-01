package com.how2java.tmall.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.how2java.tmall.pojo.Product;

public interface ProductESDAO extends ElasticsearchRepository<Product,Integer>{

}
