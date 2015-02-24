package nl.vsjoe.android.decoolepiratenclub;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import nl.vsjoe.android.decoolepiratenclub.musicplayer.SkyBlockThemeSongPlayer;


public class SkyBlockActivity extends ActionBarActivity {

    SkyBlockThemeSongPlayer sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp = new SkyBlockThemeSongPlayer(this.getApplicationContext());
        setContentView(R.layout.activity_sky_block);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sky_block, menu);
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

    public void skyBlockIntro(View view) {
        sp.playIntro();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        sp.stopPlayer();
    }

    @Override
    protected void onDestroy() {
        sp.stopPlayer();
        super.onDestroy();

    }
}
