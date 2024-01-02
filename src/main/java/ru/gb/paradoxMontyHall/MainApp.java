package ru.gb.paradoxMontyHall;

import ru.gb.paradoxMontyHall.controller.Controller;

import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        Controller controller = new Controller(1000);
        controller.run();
    }
}
