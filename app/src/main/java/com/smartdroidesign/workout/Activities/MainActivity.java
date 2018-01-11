package com.smartdroidesign.workout.Activities;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.smartdroidesign.workout.Fragments.WorkoutDetailFragment;
import com.smartdroidesign.workout.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkoutDetailFragment frag = (WorkoutDetailFragment)getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setWorkout(0);

    }
}
