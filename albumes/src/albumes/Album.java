package albumes;

public class Album {
	
	private int id;
	private int año;
	private String titulo;
	private String autor;
	private String tipo;
	private double estrellas;
	private int ediciones;
	
	public Album(int i, int a, String t, String au, String ti, double e, int ed) {

		this.id = i;
		this.año = a;
		this.titulo = t;
		this.autor = au;
		this.tipo = ti;
		this.estrellas = e;
		this.ediciones = ed;
		
	}
	
	public static Album getBest() {
		Album mejor = null;
		
		return mejor;
	}
	
	public int getVotos() {
		int votos = 0;
		
		return votos;
	}

	public int getId() {
		return id;
	}

	public int getAño() {
		return año;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getTipo() {
		return tipo;
	}

	public double getEstrellas() {
		return estrellas;
	}

	public int getEdiciones() {
		return ediciones;
	}

}
