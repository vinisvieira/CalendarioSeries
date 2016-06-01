package calendarioSeries.servlet;

import java.io.IOException;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import calendarioSeries.entity.Series;
import calendarioSeries.repository.impl.SeriesRepository;
import calendarioSeries.util.Constants;
import calendarioSeries.util.RequestUtil;

@WebServlet("/series-servlet")
public class SeriesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SeriesRepository seriesRepository;

	public SeriesServlet() {
		super();

	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Series series = new Series();
		series.setName(request.getParameter(Constants.NAME_PARAM));
		series.setTemporada(Integer.parseInt(request
				.getParameter(Constants.TEMPORADA_PARAM)));
		series.setEpisodio(Integer.parseInt(request
				.getParameter(Constants.EPISODIO_PARAM)));
		series.setDia(request.getParameter(Constants.DIA_PARAM));
		series.setComplemento(request.getParameter(Constants.COMPLEMENTO_PARAM));

		this.seriesRepository = SeriesRepository.getInstance();
		this.seriesRepository.create(series);

		response.sendRedirect("listar-series.jsp");

	}
}