package capstoneproject.jatransit.ActivityHandler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import capstoneproject.jatransit.R;

/**
 * Created by Caliph Cole on 03/05/2015.
 */
public class Route extends Fragment{

    public static final String ARG_STRING = "Route";

    private View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        rootView  = inflater.inflate(R.layout.route, container,
                false);

        return rootView;
    }

    public static Route newInstance(int someInt, String s){

        Route rFragment = new Route();
        Bundle args = new Bundle();
        args.putInt(s, someInt);
        rFragment.setArguments(args);
        return rFragment;
    }
}
