package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void one(View view)
    {
        ScoreTeamA=ScoreTeamA+1;
        displayForTeamA(ScoreTeamA);
    }
    public void two(View view)
    {
        ScoreTeamA=ScoreTeamA+2;
        displayForTeamA(ScoreTeamA);
    }
    public void three(View view)
    {
        ScoreTeamA=ScoreTeamA+3;
        displayForTeamA(ScoreTeamA);
    }
    public void oneb(View view)
    {
        ScoreTeamB=ScoreTeamB+1;
        displayForTeamB(ScoreTeamB);
    }
    public void twob(View view)
    {
        ScoreTeamB=ScoreTeamB+2;
        displayForTeamB(ScoreTeamB);
    }
    public void threeb(View view)
    {
        ScoreTeamB=ScoreTeamB+3;
        displayForTeamB(ScoreTeamB);
    }
    public void resetm(View view)
    {
        ScoreTeamA=0;
        ScoreTeamB=0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
