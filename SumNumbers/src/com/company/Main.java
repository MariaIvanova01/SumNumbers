package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        List<Integer> input = Arrays.stream(scan.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        System.out.println("Count = " + input.size());

        Function<List<Integer>, Integer> sum = list -> list.stream()
                .mapToInt(el -> el)
                .sum();
        Function<Integer, String> sumFormat = s -> "Sum = " + s;

        System.out.println(sumFormat.apply(sum.apply(input)));
    }
}
