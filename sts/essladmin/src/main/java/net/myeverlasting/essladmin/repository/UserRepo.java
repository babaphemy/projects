package net.myeverlasting.essladmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import net.myeverlasting.essladmin.entity.Appuser;
import net.myeverlasting.essladmin.entity.Group;
@Service
public interface UserRepo extends JpaRepository<Appuser, Long> {
	Appuser findByEmailAndPassword(String email, String password);
	Appuser findByEmail(String email);
	List<Appuser> findByActive(Boolean ac);
	public Appuser findByConfirmationTokenAndEmail(String token,String email);
	Appuser findByUsername(String username);
	@Query("select a.username, a.firstname, a.lastname from Appuser a")
	public List<Object[]> msgRecipient();
	List<Appuser> findByGrppIsNull();
	
	@Query("select a from Appuser a where a.active = true and a.grpp != ADMIN")
	List<Appuser> findMembers();
	List<Appuser> findByGrppAndActive(Group grp, boolean ac);
}
