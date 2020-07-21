package com.daskull.auradulmaraqiyah.Fragment;

import android.app.ProgressDialog;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.daskull.auradulmaraqiyah.AnimationClasses;
import com.daskull.auradulmaraqiyah.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.io.IOException;

/**
 * A simple {@link Fragment} subclass.
 */
public class RadioFragment extends Fragment {

    WebView personalRadio;
    CardView play;
    ImageView imgPlay, icoStatus;
    TextView status, info, shutdown;
    MediaPlayer mediaPlayer = new MediaPlayer();
    ProgressBar progress;
    AdView ads3,ads4;
    boolean isPlaying = true;
    //String url = "http://scg.streamingmurah.com:8170/listen.pls;&type=mp3";
    String url = "https://r1.siar.us/public/radio-alhamzar/embed#";
    int flag = 0;
    ProgressDialog progressDialog;

    public RadioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_radio, container, false);
        personalRadio=v.findViewById(R.id.radioweb);
        progressDialog  =new ProgressDialog(getActivity());
        progressDialog.setTitle("Loading . . .");

        ads3=v.findViewById(R.id.ads4);
        ads4 = v.findViewById(R.id.ads5);
        MobileAds.initialize(getActivity(), "ca-app-pub-6617430244106452~9153275293");
        AdRequest request = new AdRequest.Builder().build();
        ads3.loadAd(request);
        ads4.loadAd(request);
        progressDialog.show();

        personalRadio.getSettings().setJavaScriptEnabled(true);
        personalRadio.loadUrl(url);
        personalRadio.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    progressDialog.dismiss();

                } else {
                    progressDialog.show();

                }
            }
        });



        return v;
    }


}
