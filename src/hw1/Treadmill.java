package hw1;

public class Treadmill extends Let {

    public void pleaseStart(Participant participant) {
        participant.run();
        if (Math.random() * 2 > 1) {
            System.out.println("Успешно пробежал.");
        } else {
            System.out.println("Не смог пробежать.");
        }
    }
}
