package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

import ADReNA_API.Data.DataSet;
import ADReNA_API.NeuralNetwork.Backpropagation;

public class HotsPicker {
	private Backpropagation bkpprop;
	private int tamanhoEntrada = 80; //80 heróis
	private int tamanhoSaida = 7;	 //80 em binario é 1010000
	private int numCamadasIntermediarias = 70;
	private int[] neuroniosCamada = {};
	private int[] layoutRna = new int[numCamadasIntermediarias];
	private double taxaAprendizado = 0.2;
	private double taxaErro = 0.2;
	private int maxIteracoes = 500;
	
	private String enderecoEntradas = "dados/entradas.txt";
	private String enderecoNomes = "dados/nomes.txt";
	
	private int[] entradaTreino;
	private int[] saidaTreino;
	
	private TreeMap<String, Integer> nomesHerois;	
	
	/**
	 * Configura a RNA de Backpropagation
	 */
	public void configurar() {
		
		for(int i = 0; i <  numCamadasIntermediarias; i++) {
			layoutRna[i] = neuroniosCamada[i];
		}
	
		bkpprop = new Backpropagation(tamanhoEntrada, tamanhoSaida, layoutRna);
		
		bkpprop.SetLearningRate(taxaAprendizado);
		bkpprop.SetErrorRate(taxaErro);
		bkpprop.SetMaxIterationNumber(maxIteracoes);
		
		
	}
	
	/**
	 * Método que lê as entradas para treinamento
	 * através de arquivos txt
	 */
	public void lerEntradasTreino() {
		
		try {
			File f = new File(enderecoEntradas);
			BufferedReader bf = new BufferedReader(new FileReader(f));
			
			String line = bf.readLine();
			while(line != null && !line.isEmpty()) {
				System.out.println(line);
				line = bf.readLine();
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void heroeNames() {
		nomesHerois = new TreeMap<>();
		try {
			File f = new File(enderecoNomes);
			BufferedReader bf = new BufferedReader(new FileReader(f));
			
			int counter = 0;
			String line = bf.readLine();
			while(line != null && !line.isEmpty()) {
				//System.out.println(line);
				nomesHerois.put(line, counter);
				
				line = bf.readLine();
				counter++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		nomesHerois.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});
		
	}
	
	
	public void treinar() {
		
		DataSet trainningSet = new DataSet(tamanhoEntrada, tamanhoSaida);
		
		//trainningSet.add();
		
		
	}
	
	
}
