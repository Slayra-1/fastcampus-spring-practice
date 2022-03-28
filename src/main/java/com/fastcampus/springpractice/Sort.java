package com.fastcampus.springpractice;

import java.util.List;

/**
 * @author Slayra
 * @date 2022-03-24
 **/
public interface Sort <T extends Comparable<T>> {

    List<T> sort(List<T> list);
}
