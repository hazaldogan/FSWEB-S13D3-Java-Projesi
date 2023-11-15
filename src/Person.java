public class Person {
    String firstName;
    String lastName;
    int age;
    int width;
    double height;
    String eyes;

    public Person(){

    }

    public Person(String firtsName, String lastName, int age){
        this.firstName=firtsName;
        this.lastName=lastName;
        this.age=age;

    }

    public Person(int age,int width, double height, String eyes){
        this(age);
        this.width=width;
        this.height=height;
        this.eyes = eyes;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int width, double height, String eyes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.width = width;
        this.height = height;
        this.eyes = eyes;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age>=13 && age<=19;
    }


}
