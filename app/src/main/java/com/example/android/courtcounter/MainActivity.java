package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreTeamA=0;//this will track score of team A
int scoreTeamB=0;//this will track score of team B
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * This method is called when the +3points button is clicked.
     */
    public void increment_by_3A(View view) {

        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

        /**
         * This method is called when the +2points button is clicked.
         */
        public void increment_by_2A(View view) {

            scoreTeamA=scoreTeamA+2;
            displayForTeamA(scoreTeamA);

        }
    /**
     * This method is called when free throw button is clicked.
     */
    public void free_throwA(View view) {

        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);

    }
    /**
     * This method is called when the +3points button of team B is clicked.
     */
    public void increment_by_3B(View view) {

        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the +2points button of team B is clicked.
     */
    public void increment_by_2B(View view) {

        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);

    }
    /**
     * This method is called when free throw button of team B is clicked.
     */
    public void free_throwB(View view) {

        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);

    }

    public void Reset(View view) {

        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamB);
        displayForTeamB(scoreTeamB);}
    /**
     * Displays the given score for Team A.
     */
    public void
    displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

