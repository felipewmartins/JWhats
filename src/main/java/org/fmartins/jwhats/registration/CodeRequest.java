package org.fmartins.jwhats.registration;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class CodeRequest {
  private String charset = "UTF-8";
  private String url ="http://v.whatsapp.net/v2/code";
  

  public void getCode(String cc, String in){
    try {
      String busca = String.format("p_in=%s&cc=%s", 
          URLEncoder.encode(cc, charset),URLEncoder.encode(in, charset));
      URLConnection connection = new URL(url + "?" + busca).openConnection();
      connection.setRequestProperty("Accept-Charset", charset);
      InputStream response = connection.getInputStream();
      
    } catch (IOException ex) {
      // TODO Auto-generated catch block
      ex.printStackTrace();
    }
  }
}
