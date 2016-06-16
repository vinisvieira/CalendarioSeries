package postIt.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import postIt.entity.Tarefa;
import postIt.repository.impl.TarefaRepositorio;
import postIt.util.Constants;

/**
 * Servlet implementation class SeriesServletDelete
 */
@WebServlet("/tarefa-servlet-delete")
public class TarefaServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TarefaRepositorio seriesRepository;

	public TarefaServletDelete() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Map<String, String[]> params = request.getParameterMap();
		this.seriesRepository = TarefaRepositorio.getInstance();
		Tarefa tarefa = this.seriesRepository.procurar(Integer.parseInt(params
				.get(Constants.ID_PARAM)[0]));

		if (tarefa != null) {
			boolean result = this.seriesRepository.deletar(tarefa);

			if (result) {
				response.getWriter().append("Tarefa " + tarefa.getTituloTarefa() + " deletado com sucesso!");
				response.sendRedirect("listar-tarefa.jsp");
			} else {
				response.getWriter().append("Ocorreu um erro na Operação");
				response.sendRedirect("index.jsp");
			}
		} else {
			response.getWriter().append("Serie não encontrado!");
			response.sendRedirect("index.jsp");

		}

	}
}