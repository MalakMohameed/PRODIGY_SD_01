
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;
import temperature.converter.TemperatureConverter;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) {
       
        GridPane root = new GridPane();
       
        Label Linput = new Label("Input:");
        TextField input = new TextField();
        
        Label Loutput = new Label("Output:");
        TextField output = new TextField();
        
        ComboBox inputUnit = new ComboBox();
        inputUnit.getItems().add("°F");
        inputUnit.getItems().add("°C");
        inputUnit.getItems().add("°K");
          
        ComboBox outputUnit = new ComboBox();
        outputUnit.getItems().add("°F");
        outputUnit.getItems().add("°C");
        outputUnit.getItems().add("°K");
        
        Button go = new Button("Go!");
        
         go.setOnAction(e -> {
            try{
            double temperature = Double.valueOf(input.getText());
            String inUnit = (String) inputUnit.getValue();
            String outUnit = (String) outputUnit.getValue();
            TemperatureConverter convert = new TemperatureConverter();
            double result = convert.converter(temperature, inUnit, outUnit);
            output.setText(String.valueOf(result));
             }
             catch(Exception x){
                 System.out.println(x);
             }
        });
        
        
        
        root.add(Linput, 0, 0);
        root.add(input, 1, 0);
        root.add(inputUnit, 2, 0);
        
        root.add(go, 0, 1);
        
        root.add(Loutput, 0, 2);
        root.add(output, 1, 2);
        root.add(outputUnit, 2, 2);
        
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setPadding(new Insets(23));
        Scene scene = new Scene(root, 400, 300);

        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.setTitle("Temperature Converter App");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
