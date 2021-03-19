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

public class EmergencySupportFragment extends Fragment {


    private CardView waterElectricityCardView, nineNineCardView, breakdownCardView,requestServiceCardView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_emergency_support, container, false);

        getActivity().setTitle("Emergency Support");

        waterElectricityCardView = root.findViewById(R.id.water_electricity_card_view);
        nineNineCardView = root.findViewById(R.id.ninenine_card_view);
        breakdownCardView = root.findViewById(R.id.breakdown_card_view);
        requestServiceCardView = root.findViewById(R.id.request_service_card_view);

        waterElectricityCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WaterAndElectricityFragment waterAndElectricityFragment = new WaterAndElectricityFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, waterAndElectricityFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        nineNineCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NineNineNineNineFragment nineNineNineNineFragment = new NineNineNineNineFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, nineNineNineNineFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        breakdownCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BreakdownServiceFragment breakdownServiceFragment = new BreakdownServiceFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, breakdownServiceFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        requestServiceCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestServiceFragment requestServiceFragment = new RequestServiceFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, requestServiceFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return root;
    }
}
