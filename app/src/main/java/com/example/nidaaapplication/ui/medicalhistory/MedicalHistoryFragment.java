package com.example.nidaaapplication.ui.medicalhistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.nidaaapplication.R;

public class MedicalHistoryFragment extends Fragment {

    private MedicalHistoryViewModel medicalHistoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        medicalHistoryViewModel = ViewModelProviders.of(this).get(MedicalHistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_medical_history, container, false);

        getActivity().setTitle("Medical History");

        return root;
    }

}
