package calendarioSeries.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

public class RequestUtil {
	
	public static String getRequestStream(HttpServletRequest request) {
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(request.getInputStream()));
			return br.readLine();
		} catch (IOException e) {
			System.out.println("Algo deu errado -> " + e.getMessage());
			return null;
		}
	}

	public static String getParameter(String url, String paramName) throws ArrayIndexOutOfBoundsException {
		Pattern pattern = Pattern.compile(paramName + "=[^&]*");
		Matcher matcher = pattern.matcher(url);
		matcher.find();
		String value = matcher.group().split("=")[1];
		return value;
	}
}