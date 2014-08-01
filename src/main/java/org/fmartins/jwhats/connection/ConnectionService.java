package org.fmartins.jwhats.connection;

public class ConnectionService {
  private String codeCountry; 
  private String number;
  private String id;
  private String password;
  
  public ConnectionService(String codeCountry, String number){
    this.codeCountry = codeCountry;
    this.number = number;
  }
}
