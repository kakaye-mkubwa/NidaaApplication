package com.example.nidaaapplication.ui.airport;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.nidaaapplication.R;
import com.example.nidaaapplication.ui.AirportCustomerServiceFragment;
import com.example.nidaaapplication.ui.BaggageTagFragment;
import com.example.nidaaapplication.ui.CheckInFragment;
import com.example.nidaaapplication.ui.FlightStatusFragment;

public class AirportFragment extends Fragment {
    private AirportViewModel airportViewModel;
    private CardView checkInCardView, baggageTagCardView,flightStatusCardView,airportCardView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_airport, container, false);
        return root;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        getActivity().setTitle("Airport");

        checkInCardView = view.findViewById(R.id.check_in_card_view);
        baggageTagCardView = view.findViewById(R.id.awasr_card_view);
        flightStatusCardView = view.findViewById(R.id.flight_status_card_view);
        airportCardView = view.findViewById(R.id.water_electricity_card_view);

        checkInCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckInFragment checkInFragment = new CheckInFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, checkInFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        baggageTagCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaggageTagFragment baggageTagFragment = new BaggageTagFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, baggageTagFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        flightStatusCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FlightStatusFragment flightStatusFragment = new FlightStatusFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, flightStatusFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        airportCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AirportCustomerServiceFragment airportCustomerServiceFragment = new AirportCustomerServiceFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, airportCustomerServiceFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });


    }
}
