package main;

import graphicsLoader.GraphicsConfig;
import graphicsLoader.ImagesBuilder;
import graphicsLoader.SimulatorBilder.GraphicsDrawer;

import java.util.ArrayList;

import javax.swing.JFrame;

import trafficInfrastructure.RoadBuilder;
import trafficInfrastructure.road.BlockGraphicPoint;
import util.FileRW;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main (String[] args){
		String rdName = "test";
		AppDirBuilder.build();
		RoadBuilder rb = new RoadBuilder("test", 150 , 0);
		rb.buildRoad();
		JFrame frame = new JFrame();
		frame.setSize(GraphicsConfig.MAIN_WIDTH, GraphicsConfig.MAIN_HEIGHT+20);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagesBuilder ib = new ImagesBuilder();
		ArrayList<BlockGraphicPoint> arrBG =(ArrayList<BlockGraphicPoint>) FileRW.readObject(MainConfig.ROADBLOCK_PATH+"/"+rdName+MainConfig.ROADBLOCK_GRAPHICS_SUFFIX);
		frame.getContentPane().add(new GraphicsDrawer(50 , "test" , arrBG , ib ));
	    frame.setVisible(true);
	}
}
