public class Main {
    public static void main(String[] args) {
        Person person = new Person("John","Doe",20);
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("----------------------------");
        Person person2 = new Person(25,180,80.2,"green");
        System.out.println("Width: " + person2.width);
        System.out.println("Height: " + person2.height);
        System.out.println("Eyes: " + person2.eyes);
        System.out.println("----------------------------");

        Wall wall = new Wall(4,5);
        System.out.println("Area: " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());

    }
}