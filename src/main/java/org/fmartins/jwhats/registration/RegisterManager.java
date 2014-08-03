package org.fmartins.jwhats.registration;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class RegisterManager {

  private final String url = "v.whatsapp.net/v2/register";
  private String charset = "UTF-8";
  private String pr_in = "in";
  private String cc;
  private CodeRequest code;
  
  public void registerNumber(String cc, String in){
    try {
      URLConnection connection = new URL(url+"?").openConnection();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
