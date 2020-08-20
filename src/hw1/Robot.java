package hw1;

public class Robot implements Participant {
    private String nickName;
    private boolean brain;
    private int legs;

    public Robot(String nickName, boolean brain, int legs) {
        this.nickName = nickName;
        this.brain = brain;
        this.legs = legs;
    }

    @Override
    public void jump() {
        System.out.println(nickName + " прыгнул");
    }

    @Override
    public void run() {
        System.out.println(nickName + " побежал");
    }
}
