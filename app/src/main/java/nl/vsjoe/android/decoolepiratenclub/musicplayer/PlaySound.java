package nl.vsjoe.android.decoolepiratenclub.musicplayer;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by FLuFFy on 23-2-2015.
 */
public class PlaySound {

    private MediaPlayer mp;

    public PlaySound(Context context, int sound) {
        mp = new MediaPlayer().create(context, sound);
        mp.start();
    }
}
