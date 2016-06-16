package postIt.entity;

public class Tarefa {

	private int id;
	private String tituloTarefa;
	private String descricaoTarefa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTituloTarefa() {
		return tituloTarefa;
	}

	public void setTituloTarefa(String tituloTarefa) {
		this.tituloTarefa = tituloTarefa;
	}

	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}

	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}

	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", tituloTarefa=" + tituloTarefa
				+ ", descricaoTarefa=" + descricaoTarefa + "]";
	}

}