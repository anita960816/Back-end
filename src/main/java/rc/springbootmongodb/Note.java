package rc.springbootmongodb;

import java.util.*;

public class Note {
    private String userName;
    private int rating;
    private boolean approved;

    protected Note(){
    }

    public Note (String userName, int raiting, boolean approved ){
        this.userName = userName;
        this.rating = rating;
        this.approved = approved;
    }

    public String getUserName() { return userName;}
    public int getRating() { return rating;}
    public boolean isApproved() { return approved;}
}
