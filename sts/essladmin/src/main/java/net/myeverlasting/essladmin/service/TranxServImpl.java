package net.myeverlasting.essladmin.service;

import java.util.Date;
import java.util.List;

import net.myeverlasting.essladmin.entity.Appuser;
import net.myeverlasting.essladmin.entity.Tranx;
import net.myeverlasting.essladmin.repository.TranxRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranxServImpl
  implements TranxServ
{
  @Autowired
  private TranxRepo tranxRepo;
  
  public List<Tranx> allTranx()
  {
    return this.tranxRepo.findAll();
  }
  
  public List<Tranx> myTranx(Appuser user)
  {
    return this.tranxRepo.findByPayee(user);
  }
  
  public Tranx aTranx(Long id)
  {
    return (Tranx)this.tranxRepo.getOne(id);
  }
  
  public Tranx saveTranx(Tranx tranx)
  {
    return (Tranx)this.tranxRepo.save(tranx);
  }
  
  public List<Tranx> findbyDate(Date sd, Date ed)
  {
    return this.tranxRepo.findByCreatedOnBetween(sd, ed);
  }
  
  public List<Tranx> findbytype(String type)
  {
    return this.tranxRepo.findByTranxtype(type);
  }
  
  public Tranx findbyRef(String ref)
  {
    return this.tranxRepo.findByTxnref(ref);
  }
  
  public List<Tranx> mywtdordep(Appuser User, String type)
  {
    return this.tranxRepo.findByPayeeAndTranxtype(User, type);
  }
  
  
}
