package ru.gb.paradoxMontyHall.consoleView;

import java.util.HashMap;

public interface View {
    void showStatisticNoChangeDoor(int attempts);
    void showStatisticChangeDoor(int attempts);
    void setView(HashMap<Integer, Boolean> score1, HashMap<Integer, Boolean> score2);

}
