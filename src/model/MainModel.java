package model;

public interface MainModel {
    //MAKE NEXT TURN
    void onNextTurn();
    //MAKE PREV TURN
    void onPrevTurn();
    //ADD NODE
    void addNode();
    //ADD EDGE
    void addEdge(int first, int second, int weight);
    //RUN ALGORITHM ON INITIAL GRAPH
    void runAlgorithm(int i);
}
