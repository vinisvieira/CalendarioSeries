package postIt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import postIt.entity.Tarefa;
import postIt.repository.impl.TarefaRepositorio;

@WebServlet("/tarefa-servler-edit")
public class TarefaServlerEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TarefaRepositorio seriesRepository;

	public TarefaServlerEdit() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int i = Integer.parseInt(request.getParameter("i"));
		this.seriesRepository = TarefaRepositorio.getInstance();
		Tarefa tarefa = new Tarefa();

		if (i != 0) {

			tarefa = seriesRepository.procurar(i);

		}

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("editar-tarefa.jsp");
		request.setAttribute("tarefa", tarefa);
		request.setAttribute("i", i);

		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Tarefa tarefa = new Tarefa();

		tarefa.setId(Integer.parseInt(request.getParameter("i")));
		tarefa.setTituloTarefa(request.getParameter("tituloTarefa"));
		tarefa.setDescricaoTarefa(request.getParameter("descricaoTarefa"));
		

		this.seriesRepository = TarefaRepositorio.getInstance();
		this.seriesRepository.atualizar(tarefa);
		response.sendRedirect("listar-tarefa.jsp");
	}
}