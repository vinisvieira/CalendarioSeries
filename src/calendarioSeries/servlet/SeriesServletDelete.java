package calendarioSeries.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calendarioSeries.entity.Series;
import calendarioSeries.repository.impl.SeriesRepository;
import calendarioSeries.util.Constants;

/**
 * Servlet implementation class SeriesServletDelete
 */
@WebServlet("/series-servlet-delete")
public class SeriesServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SeriesRepository seriesRepository;

	public SeriesServletDelete() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Map<String, String[]> params = request.getParameterMap();
		this.seriesRepository = SeriesRepository.getInstance();
		Series series = this.seriesRepository.read(Integer.parseInt(params
				.get(Constants.ID_PARAM)[0]));

		if (series != null) {
			boolean result = this.seriesRepository.delete(series);

			if (result) {
				response.getWriter().append(
						"Serie " + series.getName() + " deletado com sucesso!");
				response.sendRedirect("listar-series.jsp");
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