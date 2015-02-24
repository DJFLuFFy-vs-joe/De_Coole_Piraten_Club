package nl.vsjoe.android.decoolepiratenclub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends Activity {

    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.listview);

        list = new ArrayList<String>();

        mainMenu();

        final StableArrayAdapter adapter = new StableArrayAdapter(this, R.layout.custom_list_item, list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {

                Intent intent;

                Context context = parent.getContext();

                intent = new Intent(context, MainActivity.class);

                String choice = list.get(position);

                if (choice == "Stuurman Koala") {
                    intent = new Intent(context, StuurmanKoala.class);
                }

                  /*               case 0 :
                        intent = new Intent(context, SkyBlockActivity.class);
                        break;
                    case 1 :
                        intent = new Intent(context, BootsmanKraai.class);
                        break;
                    case 2 :

                        break;
                    case 3 :
                        intent = new Intent(context, DekZwabberFLuffy.class);
                        break;
                    default :
                    */

                startActivity(intent);
            }
        });
    }

    private void mainMenu() {
       // list.add("Sky Block Theme Song");
        list.add("Stuurman Koala");
       // list.add("Dekzwabber FLuFFy");
       // list.add("Bootsman Kraai");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId, List<String> objects ) {
            super(context, textViewResourceId, objects);

            for(int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }
    }
}
