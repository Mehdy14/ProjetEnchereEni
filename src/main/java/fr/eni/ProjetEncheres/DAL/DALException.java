package fr.eni.ProjetEncheres.DAL;

public class DALException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DALException() {
		// TODO Auto-generated constructor stub
	}
	
	public DALException(String message) {
		super(message);
	}

	public DALException(String message, Throwable exc) {
		super(message, exc);
	}
	
}
