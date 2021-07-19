package Data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.stereotype.Service;
@Service
public class Weather {

//	public static void main(String[] args) {
//		String address = "http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=NdZVcNclGWUa9BJwyDAANfWizb4QCHMBWGeN2E4iZIGAvck%2BNaeUkJSS2xbdqATZM3y%2BUfzxsiVWXDdEk96Lsw%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2021071516&HOUR=24&COURSE_ID=1";
//		try {
//			URL url = new URL(address);
//			URLConnection uc = url.openConnection();
//			BufferedReader in = new BufferedReader(
//					new InputStreamReader(uc.getInputStream()));
//			String line;
//			while((line=in.readLine())!=null) {
//				System.out.println(line);
//			}
//			in.close();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public String getWeatherDate() {
		String address = "http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=NdZVcNclGWUa9BJwyDAANfWizb4QCHMBWGeN2E4iZIGAvck%2BNaeUkJSS2xbdqATZM3y%2BUfzxsiVWXDdEk96Lsw%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2021071516&HOUR=24&COURSE_ID=1";
		String data = "";
		try {
			URL url = new URL(address);
			URLConnection uc = url.openConnection();
			BufferedReader in = new BufferedReader(
					new InputStreamReader(uc.getInputStream()));
			String line;
			while((line=in.readLine())!=null) {
				data += line;
			}
			in.close();
			return data;
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}

}
