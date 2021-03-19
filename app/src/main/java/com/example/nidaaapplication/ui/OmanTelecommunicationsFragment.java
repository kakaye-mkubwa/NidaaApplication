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

public class OmanTelecommunicationsFragment extends Fragment {

    private CardView omantelCardView,ooredooCardView, rennaCardView, awasrCardView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_telco, container, false);

        getActivity().setTitle("Oman Telecommunications");

        omantelCardView = root.findViewById(R.id.omantel_card_view);
        ooredooCardView = root.findViewById(R.id.ooredoo_card_view);
        rennaCardView = root.findViewById(R.id.breakdown_card_view);
        awasrCardView = root.findViewById(R.id.awasr_card_view);


        omantelCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OmantelFragment omantelFragment = new OmantelFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, omantelFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ooredooCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OoredooFragment ooredooFragment = new OoredooFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, ooredooFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        rennaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RennaFragment rennaFragment = new RennaFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, rennaFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        awasrCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AwasrFragment awasrFragment = new AwasrFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, awasrFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return root;
    }
}
