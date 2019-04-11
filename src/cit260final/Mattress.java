package cit260final;

public class Mattress {
	private int rank;
	private String brand;
	private int rating;
	private double price;
	private String durability;
	private String stabilization;
    private int firmness;
    private String position;
    private String type;
    /**
     * Default constructor. Does nothing.
     */
    public Mattress() {
       
    }
    
    public Mattress(int rank, String brand, int rating, double price, String durability, String stabilization, int firmness, String position, String type) {
    	this.rank = rank;
    	this.brand = brand;
    	this.rating = rating;
    	this.price= price;
    	this.durability = durability;
    	this.stabilization = stabilization;
    	this.firmness= firmness;
    	this.position= position;
    	this.type = type;
    	
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
    public String getStabilization() {
    	return stabilization;
    }
    public void setStabilization(String stabilization) {
    	this.stabilization = stabilization;
    }

    public int getFirmness() {
    	return firmness;
    }
    
    public void setFirmness(int firmness) {
    	this.firmness = firmness;
    }
    public String getPosition() {
    	return position;
    }
    
    public void setPosition(String position) {
    	this.position = position;
    }
    public String getType() {
    	return type;
    }
    public void setType(String type) {
    	this.type = type;
    }
    
    public String toString() {
    	return (rank + "   " + brand + "   " + rating + "   " + "$"+ price + "   " + position + "   " + durability
    			+ "   " + stabilization + "   " + firmness+ "   " + type);
    }
}

