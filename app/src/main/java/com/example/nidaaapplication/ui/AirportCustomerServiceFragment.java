package com.example.nidaaapplication.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.nidaaapplication.R;

public class AirportCustomerServiceFragment extends Fragment {

    private CardView muscatInterAirportCardView, salalahAirportCardView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_airport_customer_service, container, false);

        getActivity().setTitle("Airport Customer Service");

        muscatInterAirportCardView = root.findViewById(R.id.muscat_airport_card_view);
        salalahAirportCardView = root.findViewById(R.id.salalah_airport_card_view);

        muscatInterAirportCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MuscatInternationAirportFragment muscatInternationAirportFragment = new MuscatInternationAirportFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, muscatInternationAirportFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        salalahAirportCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SalalahAirportFragment salalahAirportFragment = new SalalahAirportFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, salalahAirportFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return root;
    }
}
