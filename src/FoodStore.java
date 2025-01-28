public class FoodStore {

    String name;

    // Constructor to initialize the name
    FoodStore(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        FoodStore food1 = new FoodStore("Hotdog");
        FoodStore food2 = new FoodStore("Meatpie");
        FoodStore food3 = new FoodStore("Pancake");

        // Array of FoodStore objects
        FoodStore[] refrigerator = {food1, food2, food3};

        // Enhanced for loop to print each food's name
        for (FoodStore food : refrigerator) {
            System.out.println(food.name);
        }
    }
}
