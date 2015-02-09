package trafficInfrastructure.road;

import graphicsLoader.GraphicsConfig;

import java.util.ArrayList;

import trafficInfrastructure.roadPath.PathPoint;

public class HorizontalBlock {
	
		

		public static int [] nextBlockLocation(int x1,int y1, int x2, int y2){
			int [] tab = {x1+GraphicsConfig.BLOCK_SIDE_SIZE, y1 , x2 + GraphicsConfig.BLOCK_SIDE_SIZE, y2};
			return tab;
		}
		
		public static ArrayList<PathPoint> getPathPoints(int x, int y, short blockType){
			ArrayList<PathPoint> arrPathPoints = new ArrayList<PathPoint>();
			for (int i = 0; i < GraphicsConfig.BLOCK_SIDE_SIZE; i++){
			arrPathPoints.add(new PathPoint(blockType, x+i, y+GraphicsConfig.CAR_POSITION, 1 , -1));
			}
			return arrPathPoints;
		}
		
		public static ArrayList<PathPoint> getInversePathPoints(int x, int y, short blockType){
			ArrayList<PathPoint> arrPathPoints = new ArrayList<PathPoint>();
			for (int i = 0; i < GraphicsConfig.BLOCK_SIDE_SIZE; i++){
				arrPathPoints.add(new PathPoint(blockType, x+GraphicsConfig.BLOCK_SIDE_SIZE-i, y+GraphicsConfig.CAR_INVERSE_POSITION,-1, -1));
			}
			return arrPathPoints;
		}
}
