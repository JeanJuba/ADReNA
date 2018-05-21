package main;

import java.io.FileNotFoundException;

import ADReNA_API.NeuralNetwork.Backpropagation;
import ADReNA_API.Util.Import;
import py4j.GatewayServer;

public class MainClass {
	
	
	
	private void importData() {
		try {
			Import.DataSet("//dados//input.json");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void start() {
		HotsPicker hotsPicker = new HotsPicker();
		//hotsPicker.lerEntradasTreino();
		hotsPicker.heroeNames();
		
	}
	
	
	public static void main(String[] args) {
		//MainClass mclass = new MainClass();
		//GatewayServer server = new GatewayServer(mclass);
		//server.start();
		start();
	}
	

}
