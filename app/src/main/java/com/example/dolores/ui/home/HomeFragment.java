package com.example.dolores.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.dolores.bosque.data.Data;
import com.example.dolores.databinding.FragmentHomeBinding;

import java.util.Objects;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.textView7.setText(Data.current.getUsername());
        binding.textView8.setText(Data.current.getId());

        String rating = Data.current.getGrades().getGpa();

        double rating2 = Double.parseDouble(rating);

        if (rating2 < 2.0) {
            binding.ratingBar.setRating(1);
        } else if (rating2 < 2.5 && rating2 > 2) {
            binding.ratingBar.setRating(2);
        } else if (rating2 < 3.5 && rating2 > 2) {
            binding.ratingBar.setRating(3);
        } else if (rating2 < 4.0 && rating2 > 3.5) {
            binding.ratingBar.setRating(4);
        } else {
            binding.ratingBar.setRating(5);
        }

        binding.floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getContext() != null && getContext().getApplicationContext() != null) {
                    Toast.makeText(
                            getContext().getApplicationContext(),
                            "Coming Soon!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}