module com.assignment.tictactoe.service.chatapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.assignment.tictactoe.service.chatapplication to javafx.fxml;
    exports com.assignment.tictactoe.service.chatapplication;
    exports com.assignment.tictactoe.service.chatapplication.Controller;
    opens com.assignment.tictactoe.service.chatapplication.Controller to javafx.fxml;
}