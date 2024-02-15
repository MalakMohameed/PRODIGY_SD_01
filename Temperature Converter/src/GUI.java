
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) {
       
        FlowPane root = new FlowPane();
        Button go = new Button("Go!");
        TextField input = new TextField();
        TextField output = new TextField();
        root.getChildren().addAll(input,go,output);
        root.setAlignment(Pos.TOP_CENTER);
        root.setHgap(10);
        root.setPadding(new Insets(23));
        Scene scene = new Scene(root, 400, 300);

        
        primaryStage.setTitle("Temperature Converter App");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
