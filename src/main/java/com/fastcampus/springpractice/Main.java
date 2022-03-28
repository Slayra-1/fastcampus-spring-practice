package com.fastcampus.springpractice;

import com.fastcampus.springpractice.logic.BubbleSort;

import java.util.Arrays;

/**
 * @author Slayra
 * @date 2022-03-21
 **/
public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result] : " + sort.sort(Arrays.asList(args)));
    }
}
