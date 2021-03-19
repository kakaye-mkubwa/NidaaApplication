package com.example.nidaaapplication.ui.myprofile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.nidaaapplication.R;
import com.example.nidaaapplication.ui.medicalhistory.MedicalHistoryViewModel;

public class MyProfileFragment extends Fragment {
    private MyProfileViewModel myProfileViewModel;
    private TextView nameTextView,emailTextView,phoneNumberTextView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myProfileViewModel = ViewModelProviders.of(this).get(MyProfileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        getActivity().setTitle("My Profile");

        return root;
    }
}
