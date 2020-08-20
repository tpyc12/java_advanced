package hw1;

public class Human implements Participant {
    private String name;
    private boolean brain;
    private int legs;

    public Human(String name, boolean brain, int legs) {
        this.name = name;
        this.brain = brain;
        this.legs = legs;
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул");
    }

    @Override
    public void run() {
        System.out.println(name + " побежал");
    }
}
