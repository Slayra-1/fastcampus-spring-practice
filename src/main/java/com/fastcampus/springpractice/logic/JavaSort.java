package com.fastcampus.springpractice.logic;

import com.fastcampus.springpractice.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Slayra
 * @date 2022-03-21
 **/
public class JavaSort <T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }
}
