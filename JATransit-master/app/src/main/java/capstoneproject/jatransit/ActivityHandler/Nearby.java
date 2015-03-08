package capstoneproject.jatransit.ActivityHandler;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import capstoneproject.jatransit.R;

/**
 * Created by Caliph Cole on 03/05/2015.
 */
public class Nearby extends Fragment {

    public static final String ARG_STRING = "Nearby";

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.nearby, container,
                false);

        return rootView;

    }
    public static Nearby newInstance(int someInt, String s) {

       Nearby nfragment = new Nearby();
        Bundle args = new Bundle();
        args.putInt("homescreen", someInt);
        nfragment.setArguments(args);
        return nfragment;
    }
}
