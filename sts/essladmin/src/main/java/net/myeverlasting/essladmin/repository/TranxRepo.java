package net.myeverlasting.essladmin.repository;

import java.util.Date;
import java.util.List;
import net.myeverlasting.essladmin.entity.Appuser;
import net.myeverlasting.essladmin.entity.Tranx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public abstract interface TranxRepo
  extends JpaRepository<Tranx, Long>
{
  public abstract Tranx findByTxnref(String paramString);
  
  public abstract List<Tranx> findByPayee(Appuser paramAppuser);
  
  public abstract List<Tranx> findByPayeeAndTranxtype(Appuser paramAppuser, String paramString);
  
  public abstract List<Tranx> findByTranxtype(String paramString);
  
  public abstract List<Tranx> findByCreatedOnBetween(Date paramDate1, Date paramDate2);
}
