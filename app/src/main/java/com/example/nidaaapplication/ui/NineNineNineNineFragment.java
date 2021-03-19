package com.example.nidaaapplication.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.nidaaapplication.DataProvider;
import com.example.nidaaapplication.R;

public class NineNineNineNineFragment extends Fragment {

    private CardView textToSpeechCardView, videoCallCardView, liveChatCardView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_9999, container, false);
        getActivity().setTitle("9999");

        initUI(root);

        textToSpeechCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+ DataProvider.royalOmanPolice));
                startActivity(callIntent);
            }
        });


        liveChatCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:"));
                sendIntent.putExtra("sms_body", "Hello 9999");
                sendIntent.putExtra("address", "123123123");
                startActivity(sendIntent);
            }
        });

        videoCallCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capturePhoto();
            }
        });


        return root;
    }

    private void initUI(View view){
        textToSpeechCardView = view.findViewById(R.id.text_to_speech_card_view);
        videoCallCardView = view.findViewById(R.id.video_call_card_view);
        liveChatCardView = view.findViewById(R.id.live_chat_card_view);
    }

    private void capturePhoto() {
        Intent intent = new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
