package com.example.nidaaapplication.ui.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.nidaaapplication.R;
import com.example.nidaaapplication.ui.medicalhistory.MedicalHistoryViewModel;

public class HistoryFragment extends Fragment {
    private MedicalHistoryViewModel medicalHistoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        medicalHistoryViewModel = ViewModelProviders.of(this).get(MedicalHistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_history, container, false);

        getActivity().setTitle("History");

        return root;
    }
}
