
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;
public class Chapter3_1 extends Application {

    public void start(Stage primarystage){
        TextInputDialog textInputDialog = new TextInputDialog("1");
        textInputDialog.setTitle("print vs printf");
        textInputDialog.setContentText(" Selact option 1 to use print or option 2 to use printf Demo");
        Optional<String>input = textInputDialog.showAndWait();
        String option = input.get();
        if(option.equals("1")){
            System.out.println("You have select 1");
        } else if (option.equals ("2")){
        System.out.printf("Hello %s /n  ", "Tsegab");
        System.out.printf("Character:%c /n ",69);
        System.out.printf("Decimal:%d", 17377);
        System.out.printf("Exponents:%e",2.3455);
        System.out.printf("Float:%f",3.4355);
    }
}
}

