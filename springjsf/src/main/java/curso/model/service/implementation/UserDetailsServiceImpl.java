package curso.model.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import curso.model.dao.UserDetailsDao;
import curso.model.entities.UserDetails;
import curso.model.service.UserDetailsService;

public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserDetailsDao userDetailsDao;

	@Override
	public UserDetails getuserDetails(int id) {
		return userDetailsDao.getuserDetails(id);
	}

	@Override
	public List<UserDetails> getAllUserDetails() {
		return userDetailsDao.getAllUserDetails();
	}

	public UserDetailsDao getUserDetailsDao() {
		return userDetailsDao;
	}
}