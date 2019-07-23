package net.myeverlasting.essladmin.service;

import java.util.Date;
import java.util.List;
import net.myeverlasting.essladmin.entity.Appuser;
import net.myeverlasting.essladmin.entity.Tranx;

public abstract interface TranxServ
{
  public abstract List<Tranx> allTranx();
  
  public abstract List<Tranx> myTranx(Appuser paramAppuser);
  
  public abstract List<Tranx> mywtdordep(Appuser paramAppuser, String paramString);
  
  public abstract Tranx aTranx(Long paramLong);
  
  public abstract Tranx saveTranx(Tranx paramTranx);
  
  public abstract List<Tranx> findbyDate(Date paramDate1, Date paramDate2);
  
  public abstract List<Tranx> findbytype(String paramString);
  
  public abstract Tranx findbyRef(String paramString);
  
  
}
