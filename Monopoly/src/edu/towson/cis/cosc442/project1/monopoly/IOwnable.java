package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	Player getTheOwner();

	int getPrice();

	Boolean playAction(String msg);

	void setTheOwner(Player owner);

	boolean isAvailable();

	void setAvailable(boolean available);

}