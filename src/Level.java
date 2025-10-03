public class Level {
    private boolean goalReached;
    private int points;

    public boolean goalreached(){
        return goalReached;
    }
    public void reachGoal(){
        goalReached = true;
    }

    public int getPoints(){
        return points;
    }
    public void setPoints(int p){
        points = p;
    }
}
