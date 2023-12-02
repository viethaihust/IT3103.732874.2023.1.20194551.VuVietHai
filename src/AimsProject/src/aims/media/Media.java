package AimsProject.src.aims.media;

import java.util.Comparator;

public class Media {
	
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
	public Media() {
		super();
	}
	
    protected Media(String title) {
        this();
        this.title = title;
    }
    
    protected Media(String title, String category, float cost) {
        this();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override
    public boolean equals(Object o) {
        Media media = (Media) o;
        return media.getTitle().equals(this.getTitle());
    }
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
}
