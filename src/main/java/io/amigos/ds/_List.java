package io.amigos.ds;

import java.util.ArrayList;
import java.util.List;

public class _List {

    public static void main(String[] args) {

        List<String> unmodifiableColors = List.of(
                "blue",
                "yellow",
                "purple"
        );

        unmodifiableColors.forEach(System.out::println);

//        unmodifiableColors.add("pink");
//        unmodifiableColors.forEach(System.out::println);

        List<String> colors = new ArrayList<>();

        colors.add("purple");
        colors.add("blue");
        colors.add("yellow");

        colors.forEach(System.out::println);


    }
}
