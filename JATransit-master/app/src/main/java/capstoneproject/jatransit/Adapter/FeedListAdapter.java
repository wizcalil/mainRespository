package capstoneproject.jatransit.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

import capstoneproject.jatransit.R;
import capstoneproject.jatransit.data.FeedItem;

/**
 * Created by Caliph Cole on 03/10/2015.
 */
public class FeedListAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<FeedItem> feedItems;

    public FeedListAdapter(android.app.Activity activity, List<FeedItem> feedItems) {
        this.activity = activity;
        this.feedItems = feedItems;
    }

    @Override
    public int getCount() {
        return feedItems.size();
    }

    @Override
    public Object getItem(int location) {
        return feedItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.feed_item, null);


        TextView route = (TextView) convertView.findViewById(R.id.route);
        TextView origin = (TextView) convertView
                .findViewById(R.id.origin);
        TextView via = (TextView) convertView
                .findViewById(R.id.via);
        TextView destination = (TextView) convertView.findViewById(R.id.destination);


        FeedItem item = feedItems.get(position);

        route.setText(item.getRoute());
        origin.setText(item.getOrigin());
        via.setText(item.getVia());
        destination.setText(item.getDestination());

        return convertView;
    }

    public void clearData(){

        feedItems.clear();
    }
}
