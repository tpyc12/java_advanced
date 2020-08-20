package hw1;

public class HomeWork1 {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat("Том", 4, "серый"),
                new Human("Петр", true, 2),
                new Robot("R2D2", false, 2)
        };

        Let[] lets = {
                new Treadmill(),
                new Wall(),
        };

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                lets[j].pleaseStart(participants[i]);
            }
        }
    }
}
