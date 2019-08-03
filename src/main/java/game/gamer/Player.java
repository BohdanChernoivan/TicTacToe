package game.gamer;

import java.util.Random;

public class Player extends GameStatistic {

    private final String name;

    private final String mark;

    private Random random;

    public Player(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getMark() {
        return mark;
    }

    public int randomNumberOnTheBoard(String[][] board) {

        random = new Random();

        return random.nextInt(board.length);
    }


    @Override
    public void win() {
        super.win();
    }

    @Override
    public void loss() {
        super.loss();
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public int getWin() {
        return super.getWin();
    }

    @Override
    public int getLoss() {
        return super.getLoss();
    }

    @Override
    public int getDraw() {
        return super.getDraw();
    }

}
