package AimsProject.src.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

	private List<String> authors = new ArrayList<>();
	
	public Book() {
		super();
	}
	
    public Book(String title) {
        super(title);
    }
    
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    
    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author already exists");
        } else {
            authors.add(authorName);
            System.out.println("Author added");
        }
    }
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed");
        } else {
            System.out.println("Author not found");
        }
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Book - ");

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

        return builder.toString();
    }

}
