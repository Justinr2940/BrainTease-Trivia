package com.example.braintease_final;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class Results {
    @FXML
    public Label remark;
    @FXML
    public Label marks;
    @FXML
    public Label markstext;
    @FXML
    public Label correcttext;
    @FXML
    public Label wrongtext;
    @FXML
    public ProgressIndicator correct_progress;
    @FXML
    public ProgressIndicator wrong_progress;
    int correct;
    int wrong;

    public Results() {
    }

    @FXML
    private void initialize() {
        this.correct = Controller.correct;
        this.wrong = Controller.wrong;

        int totalQuestions = 29; // Set the total number of questions here

        this.correcttext.setText("Correct Answers: " + this.correct);
        this.wrongtext.setText("Incorrect Answers: " + this.wrong);
        this.marks.setText(String.valueOf(this.correct));

        float correctPercentage = (float) this.correct / totalQuestions;
        this.correct_progress.setProgress(correctPercentage);

        float wrongPercentage = (float) this.wrong / totalQuestions;
        this.wrong_progress.setProgress(wrongPercentage);

        this.markstext.setText(this.correct + " Answers Correct");
        setRemarkText(); // Call a method to set the remark based on the user's performance
    }

    private void setRemarkText() {
        float percentage = (float) this.correct / (this.correct + this.wrong);

        if (percentage >= 0.7) {
            remark.setText("Great job! You did well.");
        } else if (percentage >= 0.5) {
            remark.setText("Not bad, but there's room for improvement.");
        } else {
            remark.setText("You can do better! Keep practicing.");
        }
    }
}
