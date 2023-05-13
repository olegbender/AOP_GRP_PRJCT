package aop_group_prjct;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AOP_GROUP_PRJCT extends Application {

    @Override
    public void start(Stage stage) {
        ConnectDB DataBaseObject = new ConnectDB();
        
        User user = new User();
        user.Card_number();
        user.User_name("Alex Samolotov");
        user.Email("anotherEmail@gmail.com");
        user.Telephone("59409264");
        user.Pin();
        
        DataBaseObject.Insert(user);
        
//        DataBaseObject.Insert(init);
//        DataBaseObject.DeleteUser(2);

        
        DataBaseObject.writeDataBase();
        ConsoleApp consoleApp = new ConsoleApp();
        consoleApp.initialization();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        GridPane grid = new GridPane();
        Text txt = new Text("Text");
        grid.add(txt, 0, 0);
        Scene scene = new Scene(grid, 650, 450);
        stage.setScene(scene);
        stage.show();

    }

//===========================================================
    public static void main(String[] args) {
        launch(args);
    }
//===========================================================    

}
