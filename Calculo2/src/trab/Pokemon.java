package trab;

import java.util.Random;
import java.util.ArrayList;

public class Pokemon {
	
	private String nome;
	private int num;
	private String tipo;
	private double cordX
	private double cordY;
	private double cordZ;
	private boolean aceito;
        
        
        public Pokemon{
            nome = "";
            num = 0;
            tipo = "";
            cordX = 0.0;
            cordY = 0.0;
            cordZ = 0.0;
            aceito = false;
        }
	
	
        ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>;
	
	public ArrayList<Pokemon> gerarListaPoke(){
	
            pokedex.add{"bulbasaur",1,"Grama",0,0,0,false};
            pokedex.add{"ivisaur",2,"Grama",0,0,0,false};
            pokedex.add{"venusaur",3,"Grama",0,0,0,false};
            pokedex.add{"charmander",4,"fogo",0,0,0,false};
            pokedex.add{"charmeleon",5,"fogo",0,0,0,false};
            pokedex.add{"charizard",6,"fogo",0,0,0,false};
            pokedex.add{"squirtle",7,"agua",0,0,0,false};
            pokedex.add{"wartortle",8,"agua",0,0,0,false};
            pokedex.add{"blastoise",9,"agua",0,0,0,false};
            pokedex.add{"caterpie",10,"solo",0,0,0,false};
            pokedex.add{"metapod",11,"Grama",0,0,0,false};
            pokedex.add{"butterfree",12,"voador",0,0,0,false};
            pokedex.add{"weedle",13,"solo",0,0,0,false};
            pokedex.add{"kakuna",14,"Grama",0,0,0,false};
            pokedex.add{"beedrill",15,"voador",0,0,0,false};
            pokedex.add{"pidgey",16,"voador",0,0,0,false};
            pokedex.add{"pideotto",17,"voador",0,0,0,false};
            pokedex.add{"pideot",18,"voador",0,0,0,false};
            pokedex.add{"ratata",19,"solo",0,0,0,false};
            pokedex.add{"raticate",20,"solo",0,0,0,false};
            pokedex.add{"spearow",21,"voador",0,0,0,false};
            pokedex.add{"fearow",22,"voador",0,0,0,false};
            pokedex.add{"ekans",23,"solo",0,0,0,false};
            pokedex.add{"arbok",24,"solo",0,0,0,false};
            pokedex.add{"pikachu",25,"eletrico",0,0,0,false};
            pokedex.add{"raichu",26,"eletrico",0,0,0,false};
            pokedex.add{"sandshew",27,"solo",0,0,0,false};
            pokedex.add{"sandslash",28,"solo",0,0,0,false};
            pokedex.add{"nidoram(m)",29,"solo",0,0,0,false};
            pokedex.add{"nidorino",30,"solo",0,0,0,false};
            pokedex.add{"nidoking",31,"solo",0,0,0,false};
            pokedex.add{"nidoram(f)",32,"solo",0,0,0,false};
            pokedex.add{"nidorina",33,"solo",0,0,0,false};
            pokedex.add{"nidoqueen",34,"solo",0,0,0,false};
            pokedex.add{"clefary",35,"solo",0,0,0,false};
            pokedex.add{"clafable",36,"solo",0,0,0,false};
            pokedex.add{"vulpix",37,"fogo",0,0,0,false};
            pokedex.add{"ninetails",38,"fogo",0,0,0,false};
            pokedex.add{"jigglypuff",39,"solo",0,0,0,false};
            pokedex.add{"wigglypuff",40,"solo",0,0,0,false};
            pokedex.add{"zubat",41,"voador",0,0,0,false};
            pokedex.add{"golbat",42,"voador",0,0,0,false};
            pokedex.add{"oddish",43,"solo",0,0,0,false};
            pokedex.add{"gloom",44,"solo",0,0,0,false};
            pokedex.add{"vileplume",45,"solo",0,0,0,false};
            pokedex.add{"paras",46,"solo",0,0,0,false};
            pokedex.add{"parasect",47,"solo",0,0,0,false};
            pokedex.add{"venonat",48,"solo",0,0,0,false};
            pokedex.add{"venomoth",49,"voador",0,0,0,false};
            pokedex.add{"diglet",50,"solo",0,0,0,false};
            pokedex.add{"dugtrio",51,"solo",0,0,0,false};
            pokedex.add{"meowth",52,"solo",0,0,0,false};
            pokedex.add{"persian",53,"solo",0,0,0,false};
            pokedex.add{"psyduck",54,"agua",0,0,0,false};
            pokedex.add{"golduck",55,"agua",0,0,0,false};
            pokedex.add{"mankey",56,"solo",0,0,0,false};
            pokedex.add{"primape",57,"solo",0,0,0,false};
            pokedex.add{"growlithe",58,"fogo",0,0,0,false};
            pokedex.add{"arcanine",59,"fogo",0,0,0,false};
            pokedex.add{"poliwag",60,"agua",0,0,0,false};
            pokedex.add{"poliwhirl",61,"agua",0,0,0,false};
            pokedex.add{"Poliwrath",62,"agua",0,0,0,false};
            pokedex.add{"abra",63,"Psychic",0,0,0,false};
            pokedex.add{"kadabra",64,"Psychic",0,0,0,false};
            pokedex.add{"alakasam",65,"Psychic",0,0,0,false};
            pokedex.add{"machop",66,"solo",0,0,0,false};
            pokedex.add{"machoke",67,"solo",0,0,0,false};
            pokedex.add{"machamp",68,"solo",0,0,0,false};
            pokedex.add{"tentacool",69,"agua",0,0,0,false};
            pokedex.add{"tentacruel",70,"agua",0,0,0,false};
            pokedex.add{"geodude",71,"pedra",0,0,0,false};
            pokedex.add{"graveler",72,"pedra",0,0,0,false};
            pokedex.add{"golem",73,"pedra",0,0,0,false};
            pokedex.add{"ponita",74,"fogo",0,0,0,false};
            pokedex.add{"rapidash",75,"fogo",0,0,0,false};
            pokedex.add{"slowpoke",76,"agua",0,0,0,false};
            pokedex.add{"slowbro",77,"agua",0,0,0,false};
            pokedex.add{"magnemite",78,"eletrico",0,0,0,false};
            pokedex.add{"magneton",79,"eletrico",0,0,0,false};
            pokedex.add{"doduo",80,"solo",0,0,0,false};
            pokedex.add{"dotrio",81,"solo",0,0,0,false};
            pokedex.add{"grimer",82,"solo",0,0,0,false};
            pokedex.add{"muk",83,"solo",0,0,0,false};
            pokedex.add{"shelder",84,"gelo",0,0,0,false};
            pokedex.add{"cloyster",85,"gelo",0,0,0,false};
            pokedex.add{"gastly",86,"fantasma",0,0,0,false};
            pokedex.add{"haunter",87,"fantasma",0,0,0,false};
            pokedex.add{"gengar",88,"fantasma",0,0,0,false};
            pokedex.add{"onix",89,"pedra",0,0,0,false};
            pokedex.add{"voltorb",90,"eletrico",0,0,0,false};
            pokedex.add{"electrode",91,"eletrico",0,0,0,false};
            pokedex.add{"cubone",92,"solo",0,0,0,false};
            pokedex.add{"marowak",93,"solo",0,0,0,false};
            pokedex.add{"elektabuzz",94,"eletrico",0,0,0,false};
            pokedex.add{"magmar",95,"fogo",0,0,0,false};
            pokedex.add{"tauros",96,"solo",0,0,0,false};
            pokedex.add{"articuno",97,"voador",0,0,0,false};
            pokedex.add{"zapdos",98,"voador",0,0,0,false};
            pokedex.add{"moltres",99,"voador",0,0,0,false};
            pokedex.add{"mew",100,"Psychic",0,0,0,false};
            
            return pokedex;
	}
	
}
