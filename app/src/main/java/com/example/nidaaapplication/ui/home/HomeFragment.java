package com.example.nidaaapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.nidaaapplication.R;
import com.example.nidaaapplication.ui.BanksFragment;
import com.example.nidaaapplication.ui.EmergencySupportFragment;
import com.example.nidaaapplication.ui.OmanTelecommunicationsFragment;
import com.example.nidaaapplication.ui.airport.AirportFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        CardView airportCardView = root.findViewById(R.id.water_electricity_card_view);
        CardView emergencyCardView = root.findViewById(R.id.ninenine_card_view);
        CardView telcoCardView = root.findViewById(R.id.breakdown_card_view);
        CardView bankCardView = root.findViewById(R.id.awasr_card_view);


        airportCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AirportFragment airportFragment= new AirportFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, airportFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        emergencyCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmergencySupportFragment emergencySupportFragment = new EmergencySupportFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, emergencySupportFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        telcoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OmanTelecommunicationsFragment omanTelecommunicationsFragment = new OmanTelecommunicationsFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, omanTelecommunicationsFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        bankCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BanksFragment banksFragment = new BanksFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, banksFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });


        return root;
    }
}
