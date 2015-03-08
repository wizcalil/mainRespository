package capstoneproject.jatransit.ImageHandler;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import capstoneproject.jatransit.R;

/**
 * Created by Caliph Cole on 03/04/2015.
 */


public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    // references to our images
    private Integer[] mThumbIds1 = {R.drawable.nearby,R.drawable.route,R.drawable.trip,R.drawable.map,R.drawable.search,R.drawable.faq,R.drawable.terms,R.drawable.payment} ;//resource link

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds1.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {

            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(40, 40, 40, 40);

           
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds1[position]);



        return imageView;


    }
    private String[] label = {"nearby","route","trip","map","search","FAQ","terms","Payment"};
}
