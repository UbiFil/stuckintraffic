/*
 * @author  Maxim Vasilishin
 * @version 1.0
 */
package agents;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class RoadBlock.
 */
public class RoadBlock {
	
	/** The ArrayList with cars. */
	private ArrayList<Car> arrCar = new ArrayList<Car>();
	
	/** The traffic light index. */
	private ArrayList <Short> trafficLightIndex = new ArrayList <Short>();
	
	/** The block type. */
	private short blockType;
	
	/** The speed limit. */
	private int speedLimit = AgentConfig.DEFAULT_SPEED_LIMIT;
	
	/**
	 * Instantiates a new road block.
	 *
	 * @param blockType the block type
	 */
	public RoadBlock(short blockType){
		this.blockType = blockType;
	}
	
	/**
	 * Adds the car to the block container.
	 *
	 * @param car
	 *            the car
	 */
	public void addCar(Car car){
		this.arrCar.add(car);
	}
	
	/**
	 * Checks if is car inside.
	 *
	 * @return true, if is car inside
	 */
	public boolean isCarInside(){
		if (this.arrCar.isEmpty()){
			return false;
		}
		else return true;
	}
	/**
	 * Delete car.
	 *
	 * @param car
	 *            the car
	 */
	public void deleteCar(Car car){
		int k = -1;
		
		for (int i = 0; i < this.arrCar.size()-1; i++){
			if (car.equals(this.arrCar.get(i))){
				k = i;
			}
		}
		
		if (k!=-1){
			this.arrCar.remove(k);
		}
	}
	
	public void clearCarList(){
		this.arrCar.clear();
	}
	
	/**
	 * Gets the car list.
	 *
	 * @return the car list
	 */
	public ArrayList<Car> getCarList(){
		return this.arrCar;
	}
	
	/**
	 * Gets the block type.
	 *
	 * @return the block type
	 */
	
	public short getBlockType(){
		return this.blockType;
	}
	
	/**
	 * Adds the traffic light index.
	 *
	 * @param index
	 *            the index
	 */
	public void addTrafficLightIndex (short index){ //Verify !!!
		this.trafficLightIndex.add(index);
	}
	
	public ArrayList <Short> getTrafficLightIndexList(){
		return this.trafficLightIndex;
	}
	
	/**
	 * Checks if is traffic light inside.
	 *
	 * @return true, if is traffic light inside
	 */
	public boolean isTrafficLightInside(){
		if (this.trafficLightIndex.isEmpty()) return false;
		else return true;
	}
	/**
	 * Nb traffic lights.
	 *
	 * @return the int
	 */
	public int nbTrafficLights(){
		return this.trafficLightIndex.size();
	}
	
	/**
	 * Gets the speed limit.
	 *
	 * @return the speed limit
	 */
	public int getSpeedLimit(){
		return this.getSpeedLimit();
	}
}
