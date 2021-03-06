package org.geekteam.nplyon2016.nplyon2016.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.esn.geekteam.npnancy15.R;

/**
 * Created by Spider on 29/04/15.
 */
public class AboutFragment extends Fragment{
    private static final String TAG = OCFragment.class.getSimpleName();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView iv = (ImageView) getActivity().findViewById(R.id.logo_geekteam);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.maison);
                mp.start();
            }
        });
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_about, container, false);
    }
}
