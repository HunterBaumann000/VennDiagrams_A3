package edu.wctc;

public class Main {

    public static void main(String[] args) {
        String carby = "carby";
        String tomatoey = "tomatoey";
        String cheesy = "cheesy";

        VennDiagram<String> foodDiagram = new VennDiagram<>(carby, tomatoey, cheesy);

        foodDiagram.add("Croissant", carby);
        foodDiagram.add("Roll", carby);
        foodDiagram.add("Toast", carby);
        foodDiagram.add("Grilled Cheese", carby, cheesy);
        foodDiagram.add("Mac and Cheese", carby, cheesy);
        foodDiagram.add("Cheese and Crackers", carby, cheesy);
        foodDiagram.add("Bagel and Cream Cheese", carby, cheesy);
        foodDiagram.add("Spaghetti Marinara", carby, tomatoey);
        foodDiagram.add("Tomato Sandwich", carby, tomatoey);
        foodDiagram.add("Lasagna", carby, tomatoey, cheesy);
        foodDiagram.add("Tomato Soup and Goldfish Crackers", carby, tomatoey, cheesy);
        foodDiagram.add("Pizza Margherita", carby, tomatoey, cheesy);
        foodDiagram.add("Tomato and Mozzarella Sandwich", carby, tomatoey, cheesy);
        foodDiagram.add("Tomato Slices", tomatoey);
        foodDiagram.add("Tomato Wedges", tomatoey);
        foodDiagram.add("Grape Tomatoes", tomatoey);
        foodDiagram.add("Caprese Salad", tomatoey, cheesy);
        foodDiagram.add("Greek Salad", tomatoey, cheesy);
        foodDiagram.add("Mozzarella Sticks", cheesy);
        foodDiagram.add("String Cheese", cheesy);
        foodDiagram.add("Cheese Cubes", cheesy);
        foodDiagram.add("Fresh Mozzarella", cheesy);

        // carby OR tomatoey
        System.out.println(foodDiagram.unionOf(carby, tomatoey));
        // tomatoey AND cheesy
        System.out.println(foodDiagram.intersectionOf(tomatoey, cheesy));
        // cheesy but NOT carby
        System.out.println(foodDiagram.complementOf(cheesy, carby));
        // all three
        System.out.println(foodDiagram.diagramCenter());

        //--------------------------------------------------------------------

        String even = "even";
        String prime = "prime";
        String fibonacci = "fibonacci";

        VennDiagram<Integer> integerDiagram = new VennDiagram<>(even, prime, fibonacci);

        integerDiagram.add(1, prime, fibonacci);
        integerDiagram.add(2, even, prime, fibonacci);
        integerDiagram.add(3, prime, fibonacci);
        integerDiagram.add(4, even);
        integerDiagram.add(5, prime, fibonacci);
        integerDiagram.add(6, even);
        integerDiagram.add(7, prime);
        integerDiagram.add(8, even, fibonacci);
        //integerDiagram.add(9);
        integerDiagram.add(10, even);

        // Numbers that are either prime or even
        System.out.println(integerDiagram.unionOf(prime, even));
        // Numbers that are both prime and Fibonacci
        System.out.println(integerDiagram.intersectionOf(prime, fibonacci));
        // Odd Fibonacci numbers
        System.out.println(integerDiagram.exclusiveIntersectionOf(prime, fibonacci, even));
        // all three
        System.out.println(integerDiagram.diagramCenter());

    }
}
