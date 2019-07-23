package net.myeverlasting.essladmin.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import net.myeverlasting.essladmin.entity.Merchant;
@Service
public interface MerchRepo extends JpaRepository<Merchant, Long> {
	List<Merchant> findByCreatedOn(Date cd);
	List<Merchant> findByOwnerId(Long id);

}
