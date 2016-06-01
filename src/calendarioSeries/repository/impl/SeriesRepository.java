package calendarioSeries.repository.impl;

import java.util.ArrayList;
import calendarioSeries.entity.Series;

public class SeriesRepository {

	private static SeriesRepository sInstance;
	private int autoIncrement;
	private ArrayList<Series> arraySeries;

	private SeriesRepository() {
		this.arraySeries = new ArrayList<>();
		this.autoIncrement = 1;
	}

	public static SeriesRepository getInstance() {
		synchronized (SeriesRepository.class) {
			if (sInstance == null)
				sInstance = new SeriesRepository();
		}
		return sInstance;
	}

	public boolean create(Series series) {
		try {
			series.setId(autoIncrement);
			this.arraySeries.add(series);
			autoIncrement++;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void update(Series series) {
		try {
			for (Series serie : arraySeries) {
				if (serie.getId() == series.getId()) {
					arraySeries.remove(serie);
					arraySeries.add(series);
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	
	}

	public boolean delete(Series series) {
		try {
			this.arraySeries.remove(series);
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

	public Series read(int id) {
		try {
			for (int i = 0; i < this.arraySeries.size(); i++) {
				if (this.arraySeries.get(i).getId() == id)
					return this.arraySeries.get(i);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
		return null;
	}

	public ArrayList<Series> read() {
		return this.arraySeries;
	}
}