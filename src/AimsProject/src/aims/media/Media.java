package AimsProject.src.aims.media;

public class Media {
	
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
	public Media() {
		super();
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
	
}
