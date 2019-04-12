package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    TextView teamAScore;
    TextView teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScore = findViewById(R.id.teamAScore);
        teamBScore = findViewById(R.id.teamBScore);
    }

    public void increaseScore(View view){


        if(view.getId() == R.id.twoAPoints){
            scoreA += 2;
        } else if(view.getId() == R.id.threeAPoints){
            scoreA += 3;
        } else if (view.getId() == R.id.oneApoint){
            scoreA += 1;
        }
        if(view.getId() == R.id.twoBPoints){
            scoreB += 2;
        } else if(view.getId() == R.id.threeBPoints){
            scoreB += 3;
        } else if (view.getId() == R.id.oneBPoint){
            scoreB += 1;
        }


        teamAScore.setText(Integer.toString(scoreA));
        teamBScore.setText(Integer.toString(scoreB));
    }

    public void resetScore(View view){
        scoreA = 0;
        scoreB = 0;
        teamAScore.setText("0");
        teamBScore.setText("0");
    }
}
