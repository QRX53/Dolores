package com.example.dolores.ui.dashboard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dolores.bosque.data.Data;
import com.example.dolores.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView id = binding.studentidplaceholder;
            id.setText(("Student ID: " + Data.current.getId()));
        final TextView name = binding.studentName;
            name.setText("User: " + Data.current.getUsername());
        final Button b = binding.button4;
            b.setOnClickListener(view -> {
                if (!Data.gpa) {
                    binding.gpabox.setText(Data.current.getGrades().getGpa());
                    b.setText("HIDE GPA");
                    Data.gpa = true;
                } else {
                    binding.gpabox.setText("GPA");
                    b.setText("SHOW GPA");
                    Data.gpa = false;
                }
            });
        final Button b2 = binding.tutoringButton;
            b2.setOnClickListener(view -> {
                if (!Data.tutoring) {
                    binding.tutoringText.setText(Data.current.tutoring);
                    b2.setText("HIDE");
                    Data.tutoring = true;
                } else {
                    binding.tutoringText.setText("Tutoring");
                    b2.setText("SHOW");
                    Data.tutoring = false;
                }
            });

        binding.imageView.setVisibility(View.VISIBLE);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}