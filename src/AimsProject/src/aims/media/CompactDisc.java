package AimsProject.src.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    public void play() {
        System.out.println("There are " + tracks.size() + " tracks in this CD");
        for(Track track : tracks) {
            track.play();
        }
    }
    
	private String artist;
    private List<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }
    
    public CompactDisc(String title, String category, float cost, String artist) {
    	super();
    	this.title = title;
    	this.category = category;
    	this.cost = cost;
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }
    
    public CompactDisc() {
        super();
    }
    public CompactDisc(String artist) {
        super();
        this.artist = artist;
    }
    public CompactDisc(String artist, List<Track> tracks) {
        this(artist);
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        if(tracks.contains(track))
            System.out.println("Track already exists.");
        else {
            tracks.add(track);
            System.out.println("Track added");
        }
    }

    public void removeTrack(Track track) {
        if(tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed");
        }
        else
            System.out.println("Track not found");
    }

    public int getLength() {
        int totalLength = 0;
        for(Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CompactDisc - ");

        if (super.getTitle() != null) {
            builder.append(super.getTitle());
        }
        builder.append(" - ");

        if (super.getCategory() != null) {
            builder.append(super.getCategory());
        }
        builder.append(" - ");

        if (super.getCost() >= 0) {
            builder.append(String.format("%.2f $", super.getCost()));
        }
        
        builder.append(" - ");

        if (artist != null) {
            builder.append("Artist: ").append(artist);
        }

        return builder.toString();
    }

}
