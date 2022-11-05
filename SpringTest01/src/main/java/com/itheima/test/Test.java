package com.itheima.test;

import java.util.*;

/**
 * @description:
 * @time: 2/11/2022 2:37
 */
public class Test {
    int[] array;
    List<Integer> list;
    Set<Integer> set;
    Map<String, String> map;
    Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Test{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
