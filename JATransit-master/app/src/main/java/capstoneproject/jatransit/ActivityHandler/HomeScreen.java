package capstoneproject.jatransit.ActivityHandler;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import capstoneproject.jatransit.ImageHandler.ImageAdapter;
import capstoneproject.jatransit.R;

/**
 * Created by Caliph Cole on 03/04/2015.
 */
public class HomeScreen extends Fragment {


    public static final String ARG_STRING = "HOME";
    private View rootView;

    /**
     * Initialization of all the fragments
     */
    private Nearby nearby;
    private MapsFragment map;
    private Faq faq;
    private NFCBusTicket nfcBusTicket;
    private Route route;
    private TermsCondition termsCondition;
    private TripPlanner tripPlanner;
    private Payment pay;


    /**
     * SetUp GridView for home screen
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*if (savedInstanceState == null){
            nearby = Nearby.newInstance(0,"Nearby");
            map =  MapsFragment.newInstance (1,"Map");
            faq = Faq.newInstance(2,"FAQ");
            nfcBusTicket = NFCBusTicket.newInstance(3,"NFC");
            route  = Route.newInstance(4,"Route");
            termsCondition = TermsCondition.newInstance(5,"Terms");
            tripPlanner  = TripPlanner.newInstance(6,"Trip");

        }*/
         rootView = inflater.inflate(R.layout.homescreen, container,
                false);


        ((GridView) rootView.findViewById(R.id.option))
                .setAdapter(new ImageAdapter(getActivity()));


        gridViewListener();//handles the grid view listener

        return rootView;
    }

    /**
     * Handles the position selection on the homeScreen
     */
    public void gridViewListener(){
        ((GridView) rootView.findViewById(R.id.option))
                .setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View v,
                                            int position, long id) {

                        switch(position){

                            case 0:

                                nearby = Nearby.newInstance(0, nearby.ARG_STRING);
                                FragmentManager fragmentManager0 = getActivity().getSupportFragmentManager();

                                fragmentManager0.beginTransaction().replace(R.id.container, nearby,nearby.ARG_STRING).commit();
                                Toast.makeText(getActivity(), "Nearby",
                                        Toast.LENGTH_SHORT).show();

                                break;
                            case 1:
                                route = Route.newInstance(1, route.ARG_STRING);
                                FragmentManager fragmentManager1 = getActivity().getSupportFragmentManager();

                                fragmentManager1.beginTransaction().replace(R.id.container, route,route.ARG_STRING).commit();

                                Toast.makeText(getActivity(), "routes",
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 2:

                                tripPlanner = TripPlanner.newInstance(2, tripPlanner.ARG_STRING);
                                FragmentManager fragmentManager2 = getActivity().getSupportFragmentManager();

                                fragmentManager2.beginTransaction().replace(R.id.container, tripPlanner,route.ARG_STRING).commit();
                                Toast.makeText(getActivity(), "Trip Planner",
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 3:

                                map = MapsFragment.newInstance(3, map.ARG_STRING);
                                FragmentManager fragmentManager3 = getActivity().getSupportFragmentManager();

                                fragmentManager3.beginTransaction().replace(R.id.container, map,map.ARG_STRING).commit();

                                Toast.makeText(getActivity(), "map",
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 4:
                                //Set up widget
                                Toast.makeText(getActivity(), "search",
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 5:

                                faq= Faq.newInstance(5, faq.ARG_STRING);
                                FragmentManager fragmentManager5 = getActivity().getSupportFragmentManager();

                                fragmentManager5.beginTransaction().replace(R.id.container, faq,faq.ARG_STRING).commit();
                                Toast.makeText(getActivity(), "faq",
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 6:
                                termsCondition = TermsCondition.newInstance(6, termsCondition.ARG_STRING);
                                FragmentManager fragmentManager6 = getActivity().getSupportFragmentManager();

                                fragmentManager6.beginTransaction().replace(R.id.container, termsCondition,termsCondition.ARG_STRING).commit();
                                Toast.makeText(getActivity(), "terms and condition",
                                        Toast.LENGTH_SHORT).show();
                                break;

                            case 7:

                                pay = Payment.newInstance(7, termsCondition.ARG_STRING);
                                FragmentManager fragmentManager7 = getActivity().getSupportFragmentManager();

                                fragmentManager7.beginTransaction().replace(R.id.container, pay,pay.ARG_STRING).commit();
                                break;

                        }
                    }
                });

    }

    public static HomeScreen newInstance(int someInt, String someTitle) {
        HomeScreen hfragment = new HomeScreen();
        Bundle args = new Bundle();
        args.putInt("homescreen", someInt);
        hfragment.setArguments(args);
        return hfragment;
    }
}
