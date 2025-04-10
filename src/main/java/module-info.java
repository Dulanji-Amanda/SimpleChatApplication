module com.assignment.tictactoe.service.chatapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.assignment.tictactoe.service.chatapplication to javafx.fxml;
    exports com.assignment.tictactoe.service.chatapplication;
}