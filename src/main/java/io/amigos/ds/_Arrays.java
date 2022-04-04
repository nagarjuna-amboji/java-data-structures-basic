package io.amigos.ds;

import java.util.Arrays;

public class _Arrays {

    public static void main(String[] args) {

        System.out.println("Arrays Introduction.. !! ");

        String[] colors = new String[5];

        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println("Printing the bare colors reference: " +colors);

        System.out.println("Actually print the elements inside the arrays: ");
        System.out.println(Arrays.toString(colors));

        System.out.println("Print the elements using for loop ");

        colors[2] = "yellow";

        for (int i = 0; i < colors.length; i++) {
            System.out.println("Color for index " +i + " in " +colors[i]);
        }

        System.out.println("Print the elements using enhanced for loop:");

        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("Print the elements using stream api: ");

        Arrays.stream(colors).forEach(System.out::println);




    }
}
