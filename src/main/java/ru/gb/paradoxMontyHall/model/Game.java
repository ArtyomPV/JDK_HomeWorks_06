package ru.gb.paradoxMontyHall.model;

public class Game {
    private int selectedFirstDoor;
    private int selectedSecondDoor;
    private int prizeDoor;
    private int openDoor;
    private int countDoor;
    public Game(){
    }

    public int getPrizeDoor() {
        return prizeDoor;
    }

    public void openSecondDoor(){
        for (int i = 0; i < countDoor; i++) {
            if(i != selectedFirstDoor && i != prizeDoor){
                openDoor = i;
            }
        }
    }

    /**
     * Игрок меняет свой выбор
     */
    public int changeDoor(){
        for (int i = 0; i < countDoor; i++) {
            if(i != selectedFirstDoor && i != openDoor){
                selectedSecondDoor = i;
            }
        }
        return selectedSecondDoor;
    }

    public int noChangeDoor(){
        return selectedFirstDoor;
    }

    public void set(int countDoor, int selectedFirstDoor, int prizeDoor) {
        this.countDoor = countDoor;
        this.selectedFirstDoor = selectedFirstDoor;
        this.prizeDoor = prizeDoor;
    }
}
