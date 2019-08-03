package game.gamer;

public class GameStatistic implements AddingStatistic {

    private int win;

    private int loss;

    private int draw;

    @Override
    public void win() {
        this.win++;
    }

    @Override
    public void loss() {
        this.loss++;
    }

    @Override
    public void draw() {
        this.draw++;
    }

    public int getWin() {
        return win;
    }

    public int getLoss() {
        return loss;
    }

    public int getDraw() {
        return draw;
    }
}
