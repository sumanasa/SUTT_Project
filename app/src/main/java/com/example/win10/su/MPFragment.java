package com.example.win10.su;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MPFragment extends Fragment {
        ImageButton play1, pause1, stop1, play2, pause2, stop2;
        MediaPlayer sound1, sound2;
        int paus1, paus2;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootview = inflater.inflate(R.layout.fragment_mediaplayer, container, false);

            play1 = (ImageButton) rootview.findViewById(R.id.play);
            pause1 = (ImageButton) rootview.findViewById(R.id.pause);
            stop1 = (ImageButton) rootview.findViewById(R.id.stop);
            play2 = (ImageButton) rootview.findViewById(R.id.play2);
            pause2 = (ImageButton) rootview.findViewById(R.id.pause2);
            stop2 = (ImageButton) rootview.findViewById(R.id.stop2);

            play1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (sound1 == null) {
                        sound1 = MediaPlayer.create(getActivity(), R.raw.shapeofyou);
                        sound1.start();
                    } else if (!sound1.isPlaying()) {
                        sound1.seekTo(paus1);
                        sound1.start();
                    }
                }
            });
            pause1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (sound1 != null) {
                        sound1.pause();
                        paus1 = sound1.getCurrentPosition();
                    }
                }
            });
            stop1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sound1.stop();
                    sound1= null;
                }
            });
            play2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (sound2 == null) {
                        sound2 = MediaPlayer.create(getActivity(), R.raw.alanwalker);
                        sound2.start();
                    } else if (!sound2.isPlaying()) {
                        sound2.seekTo(paus2);
                        sound2.start();
                    }
                }
            });
            pause2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (sound2 != null) {
                        sound2.pause();
                        paus2 = sound2.getCurrentPosition();
                    }
                }
            });
            stop2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sound2.stop();
                    sound2 = null;
                }
            });
            return rootview;
        }
}
