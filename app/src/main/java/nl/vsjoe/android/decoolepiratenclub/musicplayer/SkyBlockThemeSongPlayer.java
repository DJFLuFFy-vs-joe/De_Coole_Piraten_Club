package nl.vsjoe.android.decoolepiratenclub.musicplayer;

import android.content.Context;
import android.media.MediaPlayer;

import nl.vsjoe.android.decoolepiratenclub.R;

/**
 * Created by FLuFFy on 24-2-2015.
 */
public class SkyBlockThemeSongPlayer {

    private MediaPlayer mp;

    public SkyBlockThemeSongPlayer(Context context) {

        mp = new MediaPlayer().create(context, R.raw.skyblock_intro);
    }

    public void playIntro() {

        if (mp.isPlaying()) {
            mp.stop();
        }

        mp.start();
    }
}
