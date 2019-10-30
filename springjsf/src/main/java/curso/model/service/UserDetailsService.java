package curso.model.service;

import java.util.List;

import curso.model.entities.UserDetails;

public interface UserDetailsService {
    public UserDetails getuserDetails(int id);
    public List<UserDetails> getAllUserDetails();
}
