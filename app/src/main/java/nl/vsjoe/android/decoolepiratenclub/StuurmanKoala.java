package nl.vsjoe.android.decoolepiratenclub;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import nl.vsjoe.android.decoolepiratenclub.musicplayer.PlaySound;


public class StuurmanKoala extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stuurman_koala);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stuurman_koala, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void playSound(View view, int soundId) {
        new PlaySound(view.getContext(), soundId);
    }

    //Button methods

    public void heyFluffy(View view) {
        playSound(view, R.raw.koala_heyfluffy);
    }

    public void kutGozer(View view){
        playSound(view, R.raw.koala_diekutgozer);
    }

    public void inDeFik(View view) {
        playSound(view, R.raw.koala_indefik);
    }

    public void jeStinkt(View view) {
        playSound(view, R.raw.koala_jestinktuitjebakkes);
    }

    public void haha(View view) {
        playSound(view, R.raw.koala_lach);
    }

    public void oops(View view) {
        playSound(view,R.raw.koala_oohooops);
    }
}
