package ru.geekbrains.january_chat.chat_client;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainChatController implements Initializable {
    @FXML
    public VBox mainChatPanel;

    @FXML
    public TextArea mainChatArea;// Текстовая область

    @FXML
    public ListView contactList;//Посмотреть список

    @FXML
    public TextField inputField;//Текстовое поле

    @FXML
    public Button btnSend;//Кнопка

    public void connectToServer(ActionEvent actionEvent) {//подключение к серверу
    }

    public void disconnectFrovServer(ActionEvent actionEvent) {//отключиться от сервера
    }

    public void mockAction(ActionEvent actionEvent) {//имитация действия
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(1);
    }//выход

    public void showHelp(ActionEvent actionEvent) {//показать справку
    }

    public void showAbout(ActionEvent actionEvent) {//показать информацию о ...
    }

    public void sendMessage(ActionEvent actionEvent) {// Отправить сообщение
        var message = inputField.getText();
        if (message.isBlank()){
            return;
        }
        var contact = contactList.getSelectionModel().getSelectedItems();
        mainChatArea.appendText(contact + " " + message + System.lineSeparator());
        inputField.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        var contacts = new ArrayList<String>();
        contacts.add("ALL");
        for (int i = 0; i < 10; i++) {
            contacts.add("contact#" + (i + 1));
        }
        contactList.setItems(FXCollections.observableList(contacts));
        contactList.getSelectionModel().selectFirst();
    }
}
