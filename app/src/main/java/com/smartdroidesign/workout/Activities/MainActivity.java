package com.smartdroidesign.workout.Activities;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.smartdroidesign.workout.Fragments.WorkoutDetailFragment;
import com.smartdroidesign.workout.Fragments.WorkoutListFragment;
import com.smartdroidesign.workout.R;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.WorkoutListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public void itemClicked(long id) {

    }
}
