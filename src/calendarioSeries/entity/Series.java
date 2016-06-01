package calendarioSeries.entity;

public class Series {
	
	private int id;
	private String name;
	private int temporada;
	private int episodio;
	private String dia;
	private String complemento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTemporada() {
		return temporada;
	}
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	public int getEpisodio() {
		return episodio;
	}
	public void setEpisodio(int episodio) {
		this.episodio = episodio;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String toString() {
		return "Series [id=" + id + ", name=" + name + ", temporada="
				+ temporada + ", episodio=" + episodio + ", dia=" + dia
				+ ", complemento=" + complemento + "]";
	}
}