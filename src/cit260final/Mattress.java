package cit260final;

public class Mattress {
	private int rank;
	private String brand;
	private int rating;
	private double price;
	private String durability;
	private int stabilization;
    private int firmness;
    private String type;
    /**
     * Default constructor. Does nothing.
     */
    public Mattress() {
       
    }
    
    /**
     * getters and setters rank, Brand, rating,
     *  price, durability, stabilization, firmness,
     *  type.
     * @return
     */
    public int getRank() {
    	return rank;
    }
    
    public void setRank(int rank) {
    	this.rank = rank;
    }
    public String getBrand() {
    	return brand;
    }
    public void setBrand(String brand) {
    	this.brand = brand;
    }
    public double getRating() {
    	return rating;
    }
    
    public void setRating(int rating) {
    	this.rating = rating;
    }
    
    public double getPrice() {
    	return price;
    }
    public void setPrice(double price) {
    	this.price = price;
    }
    
    public String getDurability() {
    	return durability;
    }
    public void setDurability(String durability) {
    	this.durability = durability;
    }
    public int getStabilization() {
    	return stabilization;
    }
    public void setStabilization(int stabilization) {
    	this.stabilization = stabilization;
    }

    public int getFirmness() {
    	return firmness;
    }
    
    public void setFirmness(int firmness) {
    	this.firmness = firmness;
    }
    public String getType() {
    	return type;
    }
    public void setType(String type) {
    	this.type = type;
    }
    
}
