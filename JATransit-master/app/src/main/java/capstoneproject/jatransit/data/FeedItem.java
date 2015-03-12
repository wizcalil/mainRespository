package capstoneproject.jatransit.data;

/**
 * Created by Caliph Cole on 03/10/2015.
 */
public class FeedItem {

    private String route,origin,via,destination;
    public FeedItem(String route, String origin, String via,String destination){

        super();
        this.route = route;
        this.origin = origin;
        this.via = via;
        this.destination = destination;

    }
    public FeedItem(){

    }
    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }



    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }



    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }



    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }








}
