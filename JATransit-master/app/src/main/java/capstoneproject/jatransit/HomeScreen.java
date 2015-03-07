package capstoneproject.jatransit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by Caliph Cole on 03/04/2015.
 */
public class HomeScreen extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.homescreen, container,
                false);
        ((GridView) rootView.findViewById(R.id.option))
                .setAdapter(new ImageAdapter(getActivity()));

        ((GridView) rootView.findViewById(R.id.option))
                .setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View v,
                                            int position, long id) {
                        Toast.makeText(getActivity(), "On Click listener is working",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        return rootView;
    }

    public static HomeScreen newInstance(int someInt, String someTitle) {
        HomeScreen hfragment = new HomeScreen();
        Bundle args = new Bundle();
        args.putInt("homescreen", someInt);
        hfragment.setArguments(args);
        return hfragment;
    }
}
