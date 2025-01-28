public class Main {
    public static class Human {
        String name;
        int age;
        double weight;

        // Constructor
        Human(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        // Methods
        void eat() {
            System.out.println(this.name + " is eating.");
        }

        void drink() {
            System.out.println(this.name + " is drinking coke.");
        }
        void displayAge(){
            System.out.println(this.name + " is " + this.age + " years old ");
        }
        void displayWeight(){
            System.out.println(this.name + " weighs " + this.weight + " kg.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of Human
        Human human = new Human("Ademola", 65, 70);

        // Invoke methods on the object
        human.eat();
        human.drink();
        human.displayAge();
        human.displayWeight();
    }
}
