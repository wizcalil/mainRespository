package capstoneproject.jatransit;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState;

import capstoneproject.jatransit.ActivityHandler.HomeScreen;
import capstoneproject.jatransit.ActivityHandler.MapsFragment;

/**
 * Created by CaliphCole on 02/17/2015.
 */
public class MainActivity extends ActionBarActivity{

    private static final String TAG = "DemoActivity";

    private SlidingUpPanelLayout mLayout;

    private MapsFragment maps;

    private HomeScreen home;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);//main layout


        /**
         * Center title of actionbar
         */
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar_layout);

        /**
         * Setting up the home screen fragment
         */
        home = HomeScreen.newInstance(0, "hello world");
        FragmentManager fragmentManager0 = getSupportFragmentManager();
        fragmentManager0.beginTransaction().add(R.id.container, home,"hello world").commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        MenuItem item = menu.findItem(R.id.settings);

        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.exit: {

                return true;
            }
            case R.id.settings: {

                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed(){
        if (mLayout != null &&
                (mLayout.getPanelState() == PanelState.EXPANDED || mLayout.getPanelState() == PanelState.ANCHORED)) {
            mLayout.setPanelState(PanelState.COLLAPSED);
        } else {
            super.onBackPressed();
        }
    }
}
