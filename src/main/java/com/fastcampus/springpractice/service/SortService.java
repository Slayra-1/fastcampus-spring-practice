package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.Sort;

import java.util.List;

/**
 * @author Slayra
 * @date 2022-03-24
 **/
public class SortService {

    private Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
