package ru.gb.paradoxMontyHall.consoleView;

import java.util.HashMap;
import java.util.Map;

public class ConsoleView implements View{
    Map<Integer, Boolean> score1;
    Map<Integer, Boolean> score2;

    public ConsoleView() {
    }

    public void showStatisticNoChangeDoor(int attempts) {
        int win = 0;                             // Статистика для первого игрока, не меняющего свой выбор.
        for (Map.Entry<Integer, Boolean> entry : score2.entrySet()) {
            if (entry.getValue()) {
                win++;
            }
        }
        System.out.println("\nСтатистика выигрышей для игрока, не меняющего свой выбор:");
        System.out.println("Количество побед: " + win + " раз из " + attempts + " попыток.");
    }

    public void showStatisticChangeDoor(int attempts) {
        int win = 0;                                  // Статистика для второго игрока, изменяющего свой выбор.
        for (Map.Entry<Integer, Boolean> entry : score1.entrySet()) {
            if (entry.getValue()) {
                win++;
            }
        }
        System.out.println("\nПарадокс Монти Холла");
        System.out.println("\nСтатистика выигрышей для игрока, изменяющего свой выбор:");
        System.out.println("Количество побед: " + win + " раз из " + attempts + " попыток.");
    }

    @Override
    public void setView(HashMap<Integer, Boolean> score1, HashMap<Integer, Boolean> score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

}
