package com.example.braintease_final;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.text.Text;

public class Results {

    @FXML
    public Label remark, marks, markstext, correcttext, wrongtext;

    @FXML
    public ProgressIndicator correct_progress, wrong_progress;

    int correct;
    int wrong;

    @FXML
    private void initialize() {
        correct = Controller.correct;
        wrong = Controller.wrong;

        correcttext.setText("Correct Answers : " + correct);
        wrongtext.setText("Incorrect Answers : " + String.valueOf(Controller.wrong));

        marks.setText(String.valueOf(correct));
        float correctf = (float) correct/10;
        correct_progress.setProgress(correctf);

        float wrongf = (float) wrong/10;
        wrong_progress.setProgress(wrongf);


        markstext.setText(correct + " Answers Correct");



    }

}
