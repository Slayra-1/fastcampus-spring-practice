package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Slayra
 * @date 2022-03-24
 **/
class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<>());

    @Test
    void test() {
        // Given

        // When
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        // Then
        assertEquals(List.of("1", "2", "3"), actual);
    }

}