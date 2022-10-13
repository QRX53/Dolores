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

        final TextView class1 = binding.class1;
        final TextView class2 = binding.class2;
        final TextView class3 = binding.class3;
        final TextView class4 = binding.class4;
        final TextView class5 = binding.class5;
        final TextView class6 = binding.class6;
        final TextView class7 = binding.class7;

        final TextView classPercentage1 = binding.classPercentage1;
        final TextView classPercentage2 = binding.classPercentage2;
        final TextView classPercentage3 = binding.classPercentage3;
        final TextView classPercentage4 = binding.classPercentage4;
        final TextView classPercentage5 = binding.classPercentage5;
        final TextView classPercentage6 = binding.classPercentage6;
        final TextView classPercentage7 = binding.classPercentage7;

        class1.setText(Data.current.getGrades().getClass1());
        class2.setText(Data.current.getGrades().getClass2());
        class3.setText(Data.current.getGrades().getClass3());
        class4.setText(Data.current.getGrades().getClass4());
        class5.setText(Data.current.getGrades().getClass5());
        class6.setText(Data.current.getGrades().getClass6());
        class7.setText(Data.current.getGrades().getClass7());

        classPercentage1.setText(Data.current.getGrades().getClass1grade());
        classPercentage2.setText(Data.current.getGrades().getClass2grade());
        classPercentage3.setText(Data.current.getGrades().getClass3grade());
        classPercentage4.setText(Data.current.getGrades().getClass4grade());
        classPercentage5.setText(Data.current.getGrades().getClass5grade());
        classPercentage6.setText(Data.current.getGrades().getClass6grade());
        classPercentage7.setText(Data.current.getGrades().getClass7grade());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}