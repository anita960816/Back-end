package rc.springbootmongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document(collection = "Users")
public class User {
    @Id
    private String id;
    private String name;
    //@Indexed(direction = IndexDirection.ASCENDING)
    private String address;
    private List<Note> notes;

    protected User() { this.notes = new ArrayList<>();}

    public User (String name, String address, List<Note> notes) {
        this.name = name;
        this.address = address;
        this.notes = notes;
    }

    public String getId() { return id; }
    public String getName() { return name;}
    public String getAddress() { return address;}
    public List<Note> getNotes() { return notes;}
}
