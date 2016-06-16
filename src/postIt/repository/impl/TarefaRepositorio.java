package postIt.repository.impl;

import java.util.ArrayList;

import postIt.entity.Tarefa;

public class TarefaRepositorio {

	private static TarefaRepositorio instance;
	private int autoIncrement;
	private ArrayList<Tarefa> arrayTarefa;

	private TarefaRepositorio() {
		this.arrayTarefa = new ArrayList<>();
		this.autoIncrement = 1;
	}

	public static TarefaRepositorio getInstance(){
		if (TarefaRepositorio.instance == null) {
			TarefaRepositorio.instance = new TarefaRepositorio();
		}
		return TarefaRepositorio.instance;
	}

	public boolean cadastrar(Tarefa tarefa) {
		try {
			tarefa.setId(autoIncrement);
			this.arrayTarefa.add(tarefa);
			autoIncrement++;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void atualizar(Tarefa tarefa) {
		try {
			for (Tarefa tarefas : arrayTarefa) {
				if (tarefas.getId() == tarefa.getId()) {
					arrayTarefa.remove(tarefas);
					arrayTarefa.add(tarefa);
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	
	}

	public boolean deletar(Tarefa tarefa) {
		try {
			this.arrayTarefa.remove(tarefa);
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

	public Tarefa procurar(int id) {
		try {
			for (int i = 0; i < this.arrayTarefa.size(); i++) {
				if (this.arrayTarefa.get(i).getId() == id)
					return this.arrayTarefa.get(i);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
		return null;
	}

	public ArrayList<Tarefa> listar() {
		return this.arrayTarefa;
	}
}