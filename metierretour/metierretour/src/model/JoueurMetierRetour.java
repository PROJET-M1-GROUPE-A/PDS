package model;

import java.io.Serializable;

public class JoueurMetierRetour implements Serializable{
	private static final long serialVersionUID = 5948214634151906312L;
	private String nomJoueur;
	private String prenomJoueur;
	private String loginJoueur;
	private int numeroPresentation;
	private int positionJeu;
	private int resultatPremierLancer;
	private boolean doitJouer;
	private JoueurMetierRetour joueurGauche;
	private JoueurMetierRetour joueurDroite;
	
	public JoueurMetierRetour(String nomJoueur, String prenomJoueur, String loginJoueur){
		this.nomJoueur = nomJoueur;
		this.prenomJoueur = prenomJoueur;
		this.loginJoueur = loginJoueur;
	}
	
	public JoueurMetierRetour(){
		
	}

	public String getNomJoueur() {
		return nomJoueur;
	}
	
	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}
	
	public String getPrenomJoueur() {
		return prenomJoueur;
	}
	
	public void setPrenomJoueur(String prenomJoueur) {
		this.prenomJoueur = prenomJoueur;
	}
	
	public String getLoginJoueur() {
		return loginJoueur;
	}
	
	public void setLoginJoueur(String loginJoueur) {
		this.loginJoueur = loginJoueur;
	}

	public int getNumeroPresentation() {
		return numeroPresentation;
	}

	public void setNumeroPresentation(int numeroPresentation) {
		this.numeroPresentation = numeroPresentation;
	}

	public int getPositionJeu() {
		return positionJeu;
	}

	public void setPositionJeu(int positionJeu) {
		this.positionJeu = positionJeu;
	}

	public JoueurMetierRetour getJoueurGauche() {
		return joueurGauche;
	}

	public void setJoueurGauche(JoueurMetierRetour joueurGauche) {
		this.joueurGauche = joueurGauche;
	}

	public int getResultatPremierLancer() {
		return resultatPremierLancer;
	}

	public void setResultatPremierLancer(int resultatPremierLancer) {
		this.resultatPremierLancer = resultatPremierLancer;
	}

	public boolean isDoitJouer() {
		return doitJouer;
	}

	public void setDoitJouer(boolean doitJouer) {
		this.doitJouer = doitJouer;
	}

	public JoueurMetierRetour getJoueurDroite() {
		return joueurDroite;
	}

	public void setJoueurDroite(JoueurMetierRetour joueurDroite) {
		this.joueurDroite = joueurDroite;
	}
}