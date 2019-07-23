package net.myeverlasting.essladmin.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties
{
  @Value("${smtp.username}")
  private String smtpUsername;
  @Value("${smtp.password}")
  private String smtpPassword;
  @Value("${smtp.port}")
  private String smtpPort;
  @Value("${smtp.host}")
  private String smtpHost;
  @Value("${smtp.auth}")
  private String smtpAuth;
  @Value("${smtp.socketFactory.port}")
  private String smtpSocketFactoryPort;
  @Value("${smtp.socketFactory.class}")
  private String smtpSocketFactoryClass;
  @Value("${url}")
  private String url;
  @Value("${adminMail}")
  private String adminEmail;
  
  public String getSmtpAuth()
  {
    return this.smtpAuth;
  }
  
  public void setSmtpAuth(String smtpAuth)
  {
    this.smtpAuth = smtpAuth;
  }
  
  public String getSmtpSocketFactoryPort()
  {
    return this.smtpSocketFactoryPort;
  }
  
  public void setSmtpSocketFactoryPort(String smtpSocketFactoryPort)
  {
    this.smtpSocketFactoryPort = smtpSocketFactoryPort;
  }
  
  public String getSmtpSocketFactoryClass()
  {
    return this.smtpSocketFactoryClass;
  }
  
  public void setSmtpSocketFactoryClass(String smtpSocketFactoryClass)
  {
    this.smtpSocketFactoryClass = smtpSocketFactoryClass;
  }
  
  public String getSmtpPassword()
  {
    return this.smtpPassword;
  }
  
  public void setSmtpPassword(String smtpPassword)
  {
    this.smtpPassword = smtpPassword;
  }
  
  public String getSmtpPort()
  {
    return this.smtpPort;
  }
  
  public void setSmtpPort(String smtpPort)
  {
    this.smtpPort = smtpPort;
  }
  
  public String getSmtpHost()
  {
    return this.smtpHost;
  }
  
  public void setSmtpHost(String smtpHost)
  {
    this.smtpHost = smtpHost;
  }
  
  public String getSmtpUsername()
  {
    return this.smtpUsername;
  }
  
  public void setSmtpUsername(String smtpUsername)
  {
    this.smtpUsername = smtpUsername;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public void setUrl(String url)
  {
    this.url = url;
  }
  
  public String getAdminEmail()
  {
    return this.adminEmail;
  }
  
  public void setAdminEmail(String adminEmail)
  {
    this.adminEmail = adminEmail;
  }
  

}
