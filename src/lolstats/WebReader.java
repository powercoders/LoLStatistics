package lolstats;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebReader {
    public String webData = "";

    public WebReader(String url) {
        try {
            URL pageURL = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection) pageURL.openConnection();
            int respCode = urlConnection.getResponseCode();
            String response = urlConnection.getResponseMessage();
            int count = 1;
            while (true) {
                String header = urlConnection.getHeaderField(count);
                String key = urlConnection.getHeaderFieldKey(count);
                if (header == null || key == null) {
                    break;
                }
                count++;
            }
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            Reader r = new InputStreamReader(in);
            int c;
            System.out.println("Please wait downloading and structuring data.");
            while ((c = r.read()) != -1) {
                webData = webData+String.valueOf((char) c);
            }
            //System.out.println(webData);
        } catch (Exception ee) {
        }

    }

}

