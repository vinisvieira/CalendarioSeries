package calendarioSeries.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calendarioSeries.entity.Series;
import calendarioSeries.repository.impl.SeriesRepository;
import calendarioSeries.util.Constants;
import calendarioSeries.util.RequestUtil;

@WebServlet("/series-servler-edit")
public class SeriesServlerEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SeriesRepository seriesRepository;

	public SeriesServlerEdit() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int i = Integer.parseInt(request.getParameter("i"));
		this.seriesRepository = SeriesRepository.getInstance();
		Series serie = new Series();

		if (i != 0) {

			serie = seriesRepository.read(i);

		}

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("editar-series.jsp");
		request.setAttribute("serie", serie);
		request.setAttribute("i", i);

		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Series series = new Series();
		
		series.setId(Integer.parseInt(request.getParameter("i")));
		series.setName(request.getParameter(Constants.NAME_PARAM));
		series.setTemporada(Integer.parseInt(request.getParameter(Constants.TEMPORADA_PARAM)));
		series.setEpisodio(Integer.parseInt(request.getParameter(Constants.EPISODIO_PARAM)));
		series.setDia(request.getParameter(Constants.DIA_PARAM));
		series.setComplemento(request.getParameter(Constants.COMPLEMENTO_PARAM));

		this.seriesRepository = SeriesRepository.getInstance();
		this.seriesRepository.update(series);
		response.sendRedirect("listar-series.jsp");
	}
}