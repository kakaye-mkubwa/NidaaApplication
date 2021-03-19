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

public class BanksFragment extends Fragment {


    private CardView bankMuscatCardView, nboCardView, omanArabBankCardView,hsbcCardView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_bank, container, false);

        getActivity().setTitle("Bank");

        bankMuscatCardView = root.findViewById(R.id.bank_muscat_card_view);
        nboCardView = root.findViewById(R.id.nbo_card_view);
        omanArabBankCardView = root.findViewById(R.id.oman_arab_bank_card_view);
        hsbcCardView = root.findViewById(R.id.hsbc_card_view);

        bankMuscatCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentBankMuscatFragment bankMuscatFragment = new FragmentBankMuscatFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, bankMuscatFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        nboCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NationalBankOfOmanFragment nationalBankOfOmanFragment = new NationalBankOfOmanFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, nationalBankOfOmanFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        omanArabBankCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OmanArabBankFragment omanArabBankFragment = new OmanArabBankFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, omanArabBankFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        hsbcCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HSBCFragment hsbcFragment = new HSBCFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, hsbcFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return root;
    }
}
