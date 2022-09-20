package com.example.dolores;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dolores.bosque.Data;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.dolores.databinding.ActivityStudentHubBinding;

public class StudentHubActivity extends AppCompatActivity {

    private ActivityStudentHubBinding binding;
    private TextView t;
    private SwipeRefreshLayout l;
    private int counter = 0;

    private void updateNotifs(int refreshInt) {
        if (Data.getNewNotifs()) {
            t.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityStudentHubBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_student_hub);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        l = findViewById(R.id.swiperefresh);
        t = findViewById(R.id.text_notifications);

        l.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                counter++;
                updateNotifs(counter);

                if (t.getVisibility() == View.INVISIBLE) {
                    // display new notifications ig
                }
            }
        });

    }

}