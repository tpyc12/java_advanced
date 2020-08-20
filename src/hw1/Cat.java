package hw1;

public class Cat implements Participant {
    private String nickName;
    private int paws;
    private String color;

    public Cat(String nickName, int paws, String color) {
        this.nickName = nickName;
        this.paws = paws;
        this.color = color;
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
