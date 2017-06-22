package panels;

import javafx.scene.layout.Pane;
import model.DrawModel;

public class GraphPanel {
    private Pane graphPane;
    public String style = "-fx-border-width: 1px;-fx-border-color: black; -fx-background-color: ghostwhite";
    GraphPanel(){
        DrawModel.getInstance().registerObserver(this);
        graphPane = new Pane();
        graphPane.setCenterShape(true);
        graphPane.setMinSize(600,400);
        graphPane.setMaxSize(700,500);
        graphPane.setStyle(style);
    }

    public Pane getPanel(){
        return graphPane;
    }
    public void update(){
        System.out.println("UPDATE");
        graphPane.getChildren().clear();
        graphPane.getChildren().addAll(DrawModel.getInstance().getGraphPane().getChildren());
    }

}
