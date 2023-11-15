package AimsProject.Lab02;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.id = ++nbDigitalVideoDiscs;
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category) {
		super();
		this.id = ++nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.id = ++nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
    public int getId() {
        return id;
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
}