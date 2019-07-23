package net.myeverlasting.essladmin.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.myeverlasting.essladmin.entity.Appuser;
import net.myeverlasting.essladmin.repository.UserRepo;

@Service
public class DetailService implements UserDetailsService {
	private UserRepo users;
	

	public DetailService(UserRepo users) {
		super();
		this.users = users;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Appuser user = users.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException(username + " was not found");
		}
		return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                AuthorityUtils.createAuthorityList(user.getRoles())
        );
	}
	

}
