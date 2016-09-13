package controllers;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import trab.Pokemon;

public class PokemonTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Pokemon> pokemons;
	String colunas[] = { "Nome", "Tipo", "X", "Y", "Z" };

	public PokemonTableModel(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		return pokemons.size();
	}
	
	@Override
	public String getColumnName(int col){
		return colunas[col];
	}

	@Override
	public Object getValueAt(int row, int col) {
		switch (col) {
		case 0:
			return pokemons.get(row).getNome();
		case 1:
			return pokemons.get(row).getTipo();
		case 2:
			return pokemons.get(row).getCordX();
		case 3:
			return pokemons.get(row).getCordY();
		case 4:
			return pokemons.get(row).getCordZ();
		default:
			return pokemons.get(row);
		}
	}

}
