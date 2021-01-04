package com.daskull.auradulmaraqiyah.Fragment;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.daskull.auradulmaraqiyah.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import dyanamitechetan.vusikview.VusikView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AudioFragment extends Fragment {
    private ImageButton btn_play_pause;
    private SeekBar seekBar;
    private TextView textView;
    private VusikView musicView;
    private MediaPlayer mediaPlayer;
    private int mediaLength;
    private int realtimeLength;
    Handler handler = new Handler();


    ImageView play,pause;
    Button stop;
    AdView ads7;

    public AudioFragment() {
        // Required empty public constructor
    }


    @SuppressLint("ClickableViewAccessibility")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_audio, container, false);
        seekBar = itemView.findViewById(R.id.seekbar);
        textView = itemView.findViewById(R.id.textTimer);
        musicView = itemView.findViewById(R.id.musicView);
        mediaPlayer = new MediaPlayer();
        play = itemView.findViewById(R.id.playbutton);
        pause=itemView.findViewById(R.id.playpause);
        ads7=itemView.findViewById(R.id.ads7);
        stop = itemView.findViewById(R.id.btnstop);
        MobileAds.initialize(getActivity(), "ca-app-pub-3940256099942544~3347511713");

        AdRequest request = new AdRequest.Builder().build();
        ads7.loadAd(request);





        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    mediaPlayer = MediaPlayer.create(getActivity(),R.raw.pusaka);
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            stopPlayer();
                        }
                    });
                    mediaPlayer.start();


                musicView.start();
                play.setVisibility(View.GONE);
                pause.setVisibility(View.VISIBLE);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    musicView.pauseNotesFall();
                    play.setVisibility(View.VISIBLE);
                    pause.setVisibility(View.GONE);
                }

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.exit(1);
                HomeFragment homeFragment = new HomeFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,homeFragment)
                        .commit();

            }
        });

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(mediaPlayer != null){
                    int mCurrentPosition = mediaPlayer.getCurrentPosition() / 1000;
                    seekBar.setProgress(mCurrentPosition);
                }
                handler.postDelayed(this, 1000);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBar.setMax(mediaPlayer.getDuration()/1000);

                if(mediaPlayer != null && fromUser){
                    mediaPlayer.seekTo(progress * 1000);
                    textView.setText(String.valueOf(mediaPlayer.getDuration()));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        return itemView;
    }


    private void stopPlayer() {

    }


}
