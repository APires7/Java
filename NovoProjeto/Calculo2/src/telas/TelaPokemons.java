package telas;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import controllers.PokemonTableModel;
import trab.Pokemon;
import trab.Ponto;

public class TelaPokemons extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	private static ArrayList<Pokemon> pokemonsEscolhidos;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPokemons frame = new TelaPokemons();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Random random = new Random();
		int min = 50;
		int qtdPokemons = random.nextInt(min) + 50;
		ArrayList<Pokemon> pokemons = Pokemon.gerarListaPoke();
		pokemonsEscolhidos = new ArrayList<>();
		for (int i = 0; i < qtdPokemons; i++) {
			Pokemon pokemon = pokemons.get(i);
			Ponto ponto = Ponto.gerarPonto();
			while (pokemon.getTipo().equals("Voador") && ponto.getZ() <= 0) {
				ponto = Ponto.gerarPonto();
			}
			while (!pokemon.getTipo().equals("Voador") && !pokemon.getTipo().equals("Água") && ponto.getZ() != 0) {
				ponto = Ponto.gerarPonto();
			}
			
			pokemon.setCordX(ponto.getX());
			pokemon.setCordY(ponto.getY());
			pokemon.setCordZ(ponto.getZ());
			pokemonsEscolhidos.add(pokemon);
			//System.out.println(pokemon.getNome() + "\t\t" + pokemon.getTipo() + "\t" + pokemon.getCordX() + "\t"
			//		+ pokemon.getCordY() + "\t" + pokemon.getCordZ());
		}
	}

	/**
	 * Create the frame.
	 */
	public TelaPokemons() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 674, 449);
		contentPane.add(scrollPane);
		
		PokemonTableModel ptm = new PokemonTableModel(pokemonsEscolhidos);
		
		table = new JTable(ptm);
		scrollPane.setViewportView(table);
	}
}
