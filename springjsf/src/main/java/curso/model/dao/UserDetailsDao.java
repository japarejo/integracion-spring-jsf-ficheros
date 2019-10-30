package curso.model.dao;

import java.util.List;

import curso.model.entities.UserDetails;


public interface UserDetailsDao {
    public UserDetails getuserDetails(int id);
    public List<UserDetails> getAllUserDetails();
}