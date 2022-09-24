package Section7.Composition;

/*
Composition

Directions:

This is an exercise in Class Composition. To complete the exercise, you must create five classes with associated member variables and methods.

The five classes should be created as follows:






Input/Output:

Once you have completed coding your classes you should then use the following code in your main class to test your code and for correct output. This way you can be sure that your code works before pasting your five classes into the code evaluator.

    Wall wall1 = new Wall("West");
    Wall wall2 = new Wall("East");
    Wall wall3 = new Wall("South");
    Wall wall4 = new Wall("North");

    Ceiling ceiling = new Ceiling(12, 55);

    Bed bed = new Bed("Modern", 4, 3, 2, 1);

    Lamp lamp = new Lamp("Classic", false, 75);

    Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
    bedRoom.makeBed();

    bedRoom.getLamp().turnOn();

Tips:

Remember that after testing you will not put your main method into the code evaluator. You will only paste in your five classes you have created in the exercise.

To be sure that the correct output is generated so your code passes the evaluation, use the following statements in your code:

1) System.out.print("Bedroom -> Making bed | "); should be used in the makeBed() method of the Bedroom class;

2) System.out.print("Bed -> Making | "); should be used in the make() method of the Bed class; and

3) System.out.println("Lamp -> Turning on"); should be used in the turnOn() method of the Lamp class.
 */


/*
5) Create a class with the name Bedroom. This class contains eight member variables:

name of type String; wall1, wall2, wall3, wall4 of type Wall; ceiling of type Ceiling; bed of type Bed, and lamp of type Lamp.
The class constructor should accept all eight of the member variables as parameters,
and there should also be two additional methods:

getLamp() which returns an object of type Lamp, and makeBed() which prints a message that the bed is being made and also calls the make() method in the Bed class.

 */

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed()
    {
        System.out.print("Bed -> Making | ");
        this.bed.make();
    }
}
