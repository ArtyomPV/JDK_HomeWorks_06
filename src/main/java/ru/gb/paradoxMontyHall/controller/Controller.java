package ru.gb.paradoxMontyHall.controller;

import ru.gb.paradoxMontyHall.consoleView.ConsoleView;
import ru.gb.paradoxMontyHall.consoleView.View;
import ru.gb.paradoxMontyHall.model.Game;

import java.util.HashMap;
import java.util.Random;

public class Controller {
    private Random random = new Random();
    private int numberOfDoor = 3;
    private HashMap<Integer, Boolean> score1;
    private HashMap<Integer, Boolean> score2;
    private final int attempts;                         // Количество попыток.
    private final Game game = new Game();
    private final View view = new ConsoleView();


    public Controller(int attempts){
        this.attempts = attempts;
        score1 = new HashMap<>();
        score2 = new HashMap<>();
    }
    public HashMap<Integer, Boolean> getScore1() {
        return score1;
    }

    public HashMap<Integer, Boolean> getScore2() {
        return score2;
    }

    public void run() {
        for (int i = 0; i < attempts; i++) {     // Розыгрыш (1000 попыток).
            game.set(numberOfDoor, random.nextInt(numberOfDoor), random.nextInt(numberOfDoor));
            score1.put(i, game.getPrizeDoor() == game.changeDoor());
            score2.put(i, game.getPrizeDoor() == game.noChangeDoor());
        }
            view.setView(score1,score2);
            view.showStatisticChangeDoor(attempts);
            view.showStatisticNoChangeDoor(attempts);
    }
}
