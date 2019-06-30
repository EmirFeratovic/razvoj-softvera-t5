package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        KorisniciModel korisnici = new KorisniciModel();
        korisnici.napuni();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(new Controller(korisnici));
        Parent root = loader.load();
        primaryStage.setTitle("Korisnici");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }


    private void handle(KeyEvent event) {
        //System.out.println(event.getCode());
        if (event.getCode() == KeyCode.ESCAPE) {
            Platform.exit();
        }

    }
    public static void main(String[] args) {
        launch(args);
    }
}


