package com.example.android.shotkeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShotKeeper extends AppCompatActivity {

    int shotsOnGoal;
    int goalsSaved;
    int aTeamScore;
    int bTeamScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shot_keeper);
        displayForTeamA(0);
        displayForTeamB(0);
    }


  /**  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         */


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int aTeamScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreA);
        scoreView.setText(String.valueOf(aTeamScore));
    }

    public void displayForShotsA(int shotsOnGoal) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_shots);
        scoreView.setText(String.valueOf(shotsOnGoal));
    }

    public void displayForGoalsSavedA(int savedGoalsA) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_saved);
        scoreView.setText(String.valueOf(savedGoalsA));
    }

    public void shots(View view) {
        shotsOnGoal = shotsOnGoal + 1;
        displayForShotsA(shotsOnGoal);
    }

    public void savedGoals(View view) {
        goalsSaved = goalsSaved + 1;
        displayForGoalsSavedA(goalsSaved);
    }

    public void goalsMade(View view) {
        aTeamScore = aTeamScore + 1;
        displayForTeamA(aTeamScore);
    }

    public void resetAlla(View view){

        aTeamScore= 0;
        shotsOnGoal = 0;
        goalsSaved = 0;

        displayForTeamA(aTeamScore);
        displayForShotsA(shotsOnGoal);
        displayForGoalsSavedA(goalsSaved);
    }

    public void decrementShotsOnGoalA(View view) {
        shotsOnGoal = shotsOnGoal - 1;
        if (shotsOnGoal <= 0) {
            shotsOnGoal = 0;
        }
        displayForShotsA(shotsOnGoal);
    }

    public void decrementGoalsSavedA(View view){
        goalsSaved = goalsSaved - 1;
        if (goalsSaved <= 0) {
            goalsSaved = 0;
        }
        displayForGoalsSavedA(goalsSaved);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreB);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void displayForShotsB(int shotsB) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_shots);
        scoreView.setText(String.valueOf(shotsB));
    }

    public void displayForGoalsSavedB(int savedGoalsB) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_saved);
        scoreView.setText(String.valueOf(savedGoalsB));
    }

    public void shotsB(View view) {
        shotsOnGoal = shotsOnGoal + 1;
        displayForShotsB(shotsOnGoal);
    }

    public void savedGoalsB(View view) {
        goalsSaved = goalsSaved + 1;
        displayForGoalsSavedB(goalsSaved);
    }

    public void goalsMadeB(View view) {
        bTeamScore = bTeamScore + 1;
        displayForTeamB(bTeamScore);
    }

    public void resetScoresB(View view){
        bTeamScore= 0;
        shotsOnGoal = 0;
        goalsSaved = 0;

        displayForTeamB(bTeamScore);
        displayForShotsB(shotsOnGoal);
        displayForGoalsSavedB(goalsSaved);
    }

    public void decrementShotsOnGoalB(View view) {
        shotsOnGoal = shotsOnGoal - 1;
        if (shotsOnGoal <= 0) {
            shotsOnGoal = 0;
        }
        displayForShotsB(shotsOnGoal);
    }

    public void decrementGoalsSavedB(View view){
        goalsSaved = goalsSaved - 1;
        if (goalsSaved <= 0) {
            goalsSaved = 0;
        }
        displayForGoalsSavedB(goalsSaved);
    }

}
