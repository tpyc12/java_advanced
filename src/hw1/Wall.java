package hw1;

public class Wall extends Let {

    public void pleaseStart(Participant participant) {
        participant.jump();
        if (Math.random() * 2 > 1) {
            System.out.println("Успешно перепрыгнул.");
        } else {
            System.out.println("Не смог перепрыгнуть.");
        }
    }
}
