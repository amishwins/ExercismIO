package com.meesh;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amish on 9/3/2015.
 */
public class Accumulate {
    public interface SquareService {
        Integer square(Integer x);
    }

    public interface StringService {
        String performStringAction(String x);
    }

    static List<Integer> accumulate(List<Integer> input, SquareService service) {
        List<Integer> result = new ArrayList<>();
        for (Integer i: input) {
            result.add(service.square(i));
        }
        return result;
    }

    static List<String> accumulate(List<String> input, StringService service) {
        List<String> result = new ArrayList<>();
        for (String x: input) {
            result.add(service.performStringAction(x));
        }
        return result;
    }
}