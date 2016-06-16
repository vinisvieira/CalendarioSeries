package postIt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import postIt.entity.Tarefa;
import postIt.repository.impl.TarefaRepositorio;
import postIt.util.Constants;

@WebServlet("/series-servlet")
public class TarefaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TarefaRepositorio seriesRepository;

	public TarefaServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Tarefa tarefa = new Tarefa();
		tarefa.setTituloTarefa(request.getParameter("tituloTarefa"));
		tarefa.setDescricaoTarefa(request.getParameter("descricaoTarefa"));
		
		this.seriesRepository = TarefaRepositorio.getInstance();
		this.seriesRepository.cadastrar(tarefa);

		response.sendRedirect("listar-tarefa.jsp");

	}
}