package AimsProject.src.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
    public boolean isMatch(int id) {
        return this.id == id;
    }

    public boolean isMatch(String title) {
        return this.title.equals(title);
    }
    
    public void print() {
        System.out.println(id + " - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + "$");
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DVD - ");
        
        if (super.getTitle() != null) {
            builder.append(super.getTitle());
        }
        builder.append(" - ");
        
        if (super.getCategory() != null) {
            builder.append(super.getCategory());
        }
        builder.append(" - ");
        
        if (director != null) {
            builder.append(director);
        }
        builder.append(" - ");
        
        if (length > 0) {
            builder.append(length).append(" minutes");
        }
        builder.append(": ");
        
        if (super.getCost() >= 0) {
            builder.append(String.format("%.2f $", super.getCost()));
        }
    
        return builder.toString();
    }
    
}
