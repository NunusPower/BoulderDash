package Controleur;

import Modele.Matrice;

public class Jeu
{

	private final Matrice m;

	public Jeu(Matrice m)
	{
		this.m = m;

	}

	public Matrice getMatrice()
	{
		return this.m;
	}

}