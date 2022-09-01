package com.stackroute.lamdbaexpression;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateFunctionalInterface {
    //write logic to find the values that starts with letter I in the given list
    public List<String> findPattern(List<String> list) {
        List<String> newList = list.stream()
                .filter(s1->s1.charAt(0) == 'I')
                .distinct()
                .collect(Collectors.toList());

        return newList.isEmpty() ? Collections.emptyList() : newList;
    }
}
