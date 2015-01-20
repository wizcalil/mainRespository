package capstoneproject.busroutemanagementsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by CaliphCole on 01/20/2015.
 */
public class SplashScreen extends Activity {

    Thread runTime;

    @Override
    public void onCreate(Bundle savedInstanceState) {


        /*
        keep Splash Screen on for 5 seconds then navigate to login Screen
         */
        runTime = new Thread() {
            public void run() {
                try {
                    synchronized (this) {

                        wait(5000);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent main = new Intent(
                            "capstoneproject.busroutemanagementsystem.Login");
                    startActivity(main);
                    //finish();
                }

            }
        };
        runTime.start();

    }





}
