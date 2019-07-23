package net.myeverlasting.essladmin.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.myeverlasting.essladmin.entity.Appuser;
import net.myeverlasting.essladmin.entity.Group;
import net.myeverlasting.essladmin.repository.UserRepo;

@Service
public class UserServImpl implements UserServ {
	@Autowired
	private UserRepo userRepo;

	@Override
	public List<Appuser> allUsers() {
		return userRepo.findAll();
	}

	@Override
	public Appuser findOne(Long id) {
		return userRepo.getOne(id);
	}

	@Override
	public Appuser doLogin(String email, String password) {
		return userRepo.findByEmailAndPassword(email, password);
	}

	@Override
	public Appuser saveUser(Appuser user) {
		if (user.getId() == null) {
			user.setCreatedOn(new Date());
			user.setConfirmationToken(UUID.randomUUID().toString());
			user.setActive(false);
		}
		user.setUpdatedOn(new Date());
		return userRepo.save(user);
	}

	@Override
	public void updateUser(Appuser user) {
		userRepo.save(user);

	}

	@Override
	public Appuser findByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	@Override
	public Appuser doConfirm(String token, String email) {
		return userRepo.findByConfirmationTokenAndEmail(token, email);
	}

	@Override
	public Appuser findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public List<Appuser> activeUsers() {
		return userRepo.findByActive(true);
	}

	@Override
	public List<Appuser> groupLess() {
		return userRepo.findByGrppIsNull();
	}

	@Override
	public List<Appuser> ActiveMembers() {
		return userRepo.findMembers();
	}

	@Override
	public List<Appuser> activeGrpMembers(Group grp) {
		return userRepo.findByGrppAndActive(grp, true);
	}


}
