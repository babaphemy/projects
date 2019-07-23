package net.myeverlasting.essladmin.service;

import java.util.List;

import net.myeverlasting.essladmin.entity.Appuser;
import net.myeverlasting.essladmin.entity.Group;

public interface UserServ {
	public List<Appuser> allUsers();
	List<Appuser> activeUsers();
	List<Appuser> groupLess();
	public Appuser findOne(Long id);
	public Appuser doLogin(String email, String password);
	public Appuser saveUser(Appuser user);
	public void updateUser(Appuser user);
	public Appuser findByEmail(String email);
	public Appuser doConfirm(String token,String email);
	Appuser findByUsername(String username);
	
	List<Appuser> ActiveMembers();
	List<Appuser> activeGrpMembers(Group grp);


}
